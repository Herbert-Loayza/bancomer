package com.bamcom.homebanking.channel.user.clients.impl;

import com.bamcom.homebanking.channel.user.clients.IClientsUser;
import com.bamcom.homebanking.channel.user.dto.MenuDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientsUserImpl implements IClientsUser {

    @Override
    public List<MenuDTO> getMenuDTOS(String rolCode) {
        //Llamar apis de negocio de ALAN
        List<MenuDTO> lMenus = new ArrayList<>();
        lMenus.add(new MenuDTO("menu-start","Inicio","/icons/menu-start.png"));
        lMenus.add(new MenuDTO("menu-products","Mis Productos","/icons/menu-products.png"));
        lMenus.add(new MenuDTO("menu-transfer","Transferencias","/icons/menu-transfer.png"));
        lMenus.add(new MenuDTO("menu-pay","Pagos","/icons/menu-pay.png"));
        lMenus.add(new MenuDTO("menu-card","Retiro sin tarjeta","/icons/menu-card.png"));
        lMenus.add(new MenuDTO("menu-exchange","Cambio de Divisas","/icons/menu-exchange.png"));
        lMenus.add(new MenuDTO("menu-business","Mis Finanzas","/icons/menu-business.png"));
        lMenus.add(new MenuDTO("menu-configuration","Configuracion","/icons/menu-configuration.png"));
        return lMenus;
    }
}
