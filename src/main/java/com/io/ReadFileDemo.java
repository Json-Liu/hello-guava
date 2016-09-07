package com.io;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import com.google.common.io.Resources;

/***读文件
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class ReadFileDemo {
	public static void main(String[] args) throws Throwable {
		/**
		 * 从外部URL获取文件 
		 */
		URL url = new URL("http://yyfinancesmall.bs2dl.yy.com/test.txt");
		readFileFromUrlWithByte(url);
		readFileFromUrlWithChar(url);
		/**
		 * 从项目Resources 文件夹下获取文件 
		 */
		URL resource = Resources.getResource("test.txt");
		readFileFromUrlWithChar(resource);
		/**
		 * 从磁盘获取文件 
		 */
		readFileFromFilePath("E:\\test.txt");
	}
	/**
	 * 根据URL 通过字节流 读取文件 
	 * @param url
	 */
	public static void readFileFromUrlWithByte( URL url ){
		ByteSource asByteSource = Resources.asByteSource(url);
		try {
			long size = asByteSource.size();
			System.out.println("file size :"+size);
			CharSource asCharSource = asByteSource.asCharSource(Charset.forName("UTF-8"));
			String content = asCharSource.read();
			System.out.println("-------------------------------readFileFromUrlWithByte START--------------------------------");
			System.out.println(content);
			System.out.println("-------------------------------我是分隔线--------------------------------");
			ImmutableList<String> readLines = asCharSource.readLines();
			for (String each : readLines) {
				System.out.println(each);
			}
			System.out.println("-------------------------------readFileFromUrlWithByte END--------------------------------");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 根据URL 通过字符流 读取文件 
	 * @param url
	 * @throws IOException 
	 */
	public static void readFileFromUrlWithChar( URL url ) throws IOException{
		System.out.println("-------------------------------readFileFromUrlWithChar START--------------------------------");
		CharSource asCharSource = Resources.asCharSource(url, Charset.forName("UTF-8"));
		String allContent = asCharSource.read();
		System.out.println(allContent);//一次读取所有内容 作为一个字符串
		System.out.println("-------------------------------我是分隔线--------------------------------");
		ImmutableList<String> readLines = asCharSource.readLines();
		for (String each : readLines) {//读取所有行 每行作为一个字符串保存在列表中
			System.out.println(each);
		}
		System.out.println("-------------------------------readFileFromUrlWithChar END--------------------------------");
	}
	/**
	 * 根据文件 路径读取文件 
	 * @param filePath
	 * @throws IOException 
	 */
	public static void readFileFromFilePath(String filePath ) throws IOException{
		File file = new File(filePath);
		System.out.println("-------------------------------readFileFromFilePath START--------------------------------");
		CharSource asCharSource = Files.asCharSource(file, Charset.forName("UTF-8"));
		asCharSource.read();
		System.out.println("-------------------------------我是分隔线--------------------------------");
		ImmutableList<String> readLines = asCharSource.readLines();
		for (String each : readLines) {//读取所有行 每行作为一个字符串保存在列表中
			System.out.println(each);
		}
		System.out.println("-------------------------------readFileFromFilePath END--------------------------------");
	}
}

