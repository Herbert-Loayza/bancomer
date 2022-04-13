package com.bamcom.homebanking.channel.user.business;

import com.bamcom.homebanking.channel.user.dto.UserMenuDTO;

public interface IUserBusiness {
    public UserMenuDTO getUserMenu(String rolCode);
}
