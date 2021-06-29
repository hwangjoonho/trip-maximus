package com.maximusteam.tripfulaxel.user.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.maximusteam.tripfulaxel.user.model.dao.UserMapper;
import com.maximusteam.tripfulaxel.user.model.dto.UserDTO;

/**
 * @author JJY
 *
 */
@Repository
public class UserServiceImpl implements UserService {

	private final UserMapper mapper;
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	public UserServiceImpl(UserMapper mapper) {
		this.mapper = mapper;
		this.passwordEncoder = passwordEncoder;
	}



	/**
	 * 회원가입용 메소드
	 */
	@Override
	public boolean registUser(UserDTO user) {
		
		return mapper.registUser(user) > 0? true:false;
	}

	
	/**
	 * 로그인용 메소드
	 */
	@Override
	public UserDTO loginUser(UserDTO user) {
		
		
		return mapper.loginUser(user);
	}


}
