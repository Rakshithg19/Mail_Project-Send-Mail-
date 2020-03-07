package com.raksh.log.util;

import com.raksh.log.exceptions.UtilException;

public interface EmailUtil {
	public boolean sendMail(String toEmailId, String body, String subject) throws UtilException;
}
