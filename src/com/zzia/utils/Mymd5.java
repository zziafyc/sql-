package com.zzia.utils;

import java.security.MessageDigest;

public class Mymd5 {
	
	private static String[] strings = { "0", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "a", "b", "c", "d", "e", "f" };

	public static String toMD5(String str) {
		StringBuffer s = new StringBuffer();
		try {
			// 将传递进来的字符串转成字符数组
			byte[] bytesofMessage = str.getBytes();
			// 创建具有指定算法名称的信息摘要
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			// 完成摘要计算。
			byte[] bytes = md5.digest(bytesofMessage);
			// 将计算得到的字符串转换成密码
			for (int i = 0; i < bytes.length; i++) {
				s.append(byteToString(bytes[i]));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s.toString();
	}

	// 讲byte数字转换成两个字符
	private static String byteToString(byte b) {
		// 如果数字小于0，则加上128让他变成正数
		if (b < 0)
			b += 128;
		return strings[b / 16] + strings[b % 16];
	}
}