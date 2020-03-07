package com.raksh.log.service;

import com.raksh.log.exceptions.ServiceException;

public interface EmailService {
	public boolean sendMailToUser(String toEmailId, String subject, String body) throws ServiceException;
}
