package com.userOp.simplebackend.exception;

import com.userOp.simplebackend.repository.UserRepository;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(Long id)
	{
		super("Could not found the user with id"+id);
	}

}
