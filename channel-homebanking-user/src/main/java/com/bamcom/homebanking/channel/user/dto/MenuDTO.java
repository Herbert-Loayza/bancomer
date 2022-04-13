package com.bamcom.homebanking.channel.user.dto;

import lombok.*;

@Builder(toBuilder = true)
@ToString
@Setter
@Getter
public class MenuDTO {

    private String code;
    private String name;
    private String icon;

    public MenuDTO(String code, String name, String icon) {
        this.code = code;
        this.name = name;
        this.icon = icon;
    }
}
