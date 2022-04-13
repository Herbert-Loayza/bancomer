package com.bamcom.homebanking.channel.user.controller;

import com.bamcom.homebanking.channel.user.constans.HomeBankingConstants;
import com.bamcom.homebanking.channel.user.model.UsersMenuResponse;
import com.bamcom.homebanking.channel.user.service.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(HomeBankingConstants.API_VERSION + HomeBankingConstants.RESOURCES_USERS)
public class UserController {

    private final IUserService iUserService;

    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @RequestMapping(value = HomeBankingConstants.RESOURCE_USERS_MENU,
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<UsersMenuResponse> getUserMenu(@NotNull
                                                  @Valid
                                                  @RequestParam(value = "roleCode", required = true)
                                                          String roleCode){
        return new ResponseEntity<UsersMenuResponse>(iUserService.getUserMenu(roleCode),
                null,
                HttpStatus.OK);
    }





}
