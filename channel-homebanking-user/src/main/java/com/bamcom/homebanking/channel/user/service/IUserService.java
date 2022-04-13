package com.bamcom.homebanking.channel.user.service;


import com.bamcom.homebanking.channel.user.dto.UserMenuDTO;
import com.bamcom.homebanking.channel.user.model.UsersMenuResponse;

public interface IUserService {

    public UsersMenuResponse getUserMenu(String rolCode);

}
