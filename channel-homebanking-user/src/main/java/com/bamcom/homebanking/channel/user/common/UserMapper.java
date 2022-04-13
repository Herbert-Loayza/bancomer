package com.bamcom.homebanking.channel.user.common;

import com.bamcom.homebanking.channel.user.dto.UserMenuDTO;
import com.bamcom.homebanking.channel.user.model.Menu;
import com.bamcom.homebanking.channel.user.model.UsersMenuResponse;

import java.util.stream.Collectors;

public class UserMapper {

    public static UsersMenuResponse buildUsersMenuResponse(UserMenuDTO userMenuDTO){
        return new UsersMenuResponse().menus(userMenuDTO
                .getMenus()
                .stream()
                .map(menuDTO -> new Menu()
                        .code(menuDTO.getCode())
                        .name(menuDTO.getName())
                        .icon(menuDTO.getIcon()))
                .collect(Collectors.toList()));
    }

}
