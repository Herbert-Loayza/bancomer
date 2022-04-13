package com.bamcom.homebanking.channel.user.service.impl;

import com.bamcom.homebanking.channel.user.business.IUserBusiness;
import com.bamcom.homebanking.channel.user.model.UsersMenuResponse;
import com.bamcom.homebanking.channel.user.service.IUserService;
import org.springframework.stereotype.Service;

import static com.bamcom.homebanking.channel.user.common.UserMapper.buildUsersMenuResponse;


@Service
public class UserServiceImpl implements IUserService {

    private final IUserBusiness iUserBusiness;

    public UserServiceImpl(IUserBusiness iUserBusiness) {
        this.iUserBusiness = iUserBusiness;
    }

    @Override
    public UsersMenuResponse getUserMenu(String rolCode) {
        return buildUsersMenuResponse(iUserBusiness.getUserMenu(rolCode));
    }
}
