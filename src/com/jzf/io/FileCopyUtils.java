package com.jzf.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class FileCopyUtils {
	
	private FileCopyUtils(){
		throw new AssertionError();
	}

	public static void fileCopy(String source, String target) throws IOException {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(source);
			outputStream = new FileOutputStream(target);

			byte[] buff = new byte[4096];
			int b;

			while ((b = inputStream.read(buff)) != -1) {
				outputStream.write(buff, 0, b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void fileCopy2(String source, String target) throws IOException {
		try (InputStream inputStream = new FileInputStream(source)) {
			try (OutputStream outputStream = new FileOutputStream(target)) {
				byte[] buff = new byte[4096];
				int b;
				while ((b = inputStream.read(buff)) != -1) {
					outputStream.write(buff, 0, b);//如果不指定长度，则会将缓存字节数组中的全部内容都写入目标文件
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		FileCopyUtils.fileCopy2("F:\\test.txt", "F:\\test2.txt");
		System.out.println("jjj");
	}
}
