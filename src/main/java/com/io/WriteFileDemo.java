package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import com.google.common.io.Files;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class WriteFileDemo {
	public static void main(String[] args) throws IOException {
		/**
		 * 写入磁盘
		 */
		String content = " Hello. \n My name is Joson Liu. \n My Profession is software engineer. \n Nice to see you.";
		String filePath = "E:\\joson_test.txt";
		writeToFile(content,filePath);
		/**
		 * 利用相对 路径 写入当前项目的 resources 文件夹下  
		 */
		String content2 = " Hello. \n My name is Joson Liu. \n My Profession is software engineer. \n Nice to see you.";
		String filePath2 = ".\\src\\main\\resources\\joson_test.txt";
		writeToFile(content2,filePath2);
	}
	public static void writeToFile(String content,String filePath) throws IOException{
		System.out.println("write file start..");
		File file = new File(filePath);
		Files.write(content.getBytes(Charset.forName("UTF-8")), file);
		System.out.println("write file success..filePath:" + filePath);
	}
}

