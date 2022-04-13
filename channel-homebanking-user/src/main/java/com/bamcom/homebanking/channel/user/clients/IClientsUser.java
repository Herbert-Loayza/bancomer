package com.bamcom.homebanking.channel.user.clients;

import com.bamcom.homebanking.channel.user.dto.MenuDTO;

import java.util.List;

public interface IClientsUser {
    public List<MenuDTO> getMenuDTOS(String rolCode);
}
