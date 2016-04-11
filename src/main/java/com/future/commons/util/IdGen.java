package com.future.commons.util;

import java.security.SecureRandom;
import java.util.UUID;

import javax.ws.rs.ext.ParamConverter.Lazy;

import org.springframework.stereotype.Service;

/**
 * FileUtil
 *
 * @author Eric.guo
 * @date 2016/4/11
 */
@Service
@Lazy
public abstract class IdGen {
	
	private static SecureRandom random = new SecureRandom();
	
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
