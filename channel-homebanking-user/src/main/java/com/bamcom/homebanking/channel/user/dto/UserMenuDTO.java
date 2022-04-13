package com.bamcom.homebanking.channel.user.dto;

import lombok.*;

import java.util.List;

@Builder(toBuilder = true)
@ToString
@Setter
@Getter
public class UserMenuDTO {

    private List<MenuDTO> menus;

    public UserMenuDTO(List<MenuDTO> menus) {
        this.menus = menus;
    }
}
