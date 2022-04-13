package com.bamcom.homebanking.channel.user.business.impl;

import com.bamcom.homebanking.channel.user.business.IUserBusiness;
import com.bamcom.homebanking.channel.user.clients.IClientsUser;
import com.bamcom.homebanking.channel.user.dto.MenuDTO;
import com.bamcom.homebanking.channel.user.dto.UserMenuDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBusiness implements IUserBusiness {

    private final IClientsUser iClientsUser;

    public UserBusiness(IClientsUser iClientsUser) {
        this.iClientsUser = iClientsUser;
    }

    @Override
    public UserMenuDTO getUserMenu(String rolCode) {
        return new UserMenuDTO(iClientsUser.getMenuDTOS(rolCode));
    }

}
