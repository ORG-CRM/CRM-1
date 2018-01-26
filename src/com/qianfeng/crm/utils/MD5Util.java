package com.qianfeng.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 实现加密的工具类
 * 
 * @author qq
 * 
 */
public class MD5Util {

	public static String getMD5Str(String value) {

		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");

			byte[] arr = digest.digest(value.getBytes());// 十进制

			BigInteger big = new BigInteger(1, arr);// 1 表示正数

			return big.toString(16); // 十六进制

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

}
