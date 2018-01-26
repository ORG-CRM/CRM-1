package com.qianfeng.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ʵ�ּ��ܵĹ�����
 * 
 * @author qq
 * 
 */
public class MD5Util {

	public static String getMD5Str(String value) {

		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");

			byte[] arr = digest.digest(value.getBytes());// ʮ����

			BigInteger big = new BigInteger(1, arr);// 1 ��ʾ����

			return big.toString(16); // ʮ������

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

}
