package com.raksh.log.dao;

import java.io.Serializable;

import com.raksh.log.entity.UserEntity;

public interface UserDAO {
	public Serializable save(UserEntity entity);

}
