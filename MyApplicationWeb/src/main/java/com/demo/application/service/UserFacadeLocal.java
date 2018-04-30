package com.demo.application.service;

import java.util.List;

import com.demo.application.dto.UserDto;

public interface UserFacadeLocal {

	Long createUser(UserDto dto);

	List<UserDto> getUser(String loginName, String fullName, String phoneNumber);

}
