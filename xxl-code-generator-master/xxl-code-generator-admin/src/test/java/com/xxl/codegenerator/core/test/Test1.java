package com.xxl.codegenerator.core.test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) {
		read1();
	}

	public static String read1(){
		InputStreamReader reader = null;
		FileWriter writer = null;
		StringBuffer buffer = new StringBuffer();
		try {
			reader = new InputStreamReader(new FileInputStream("E:\\xmltest\\dd\\GD_20180531_DCJZDDBS.txt"),"GBK");
//			reader = new FileReader("E:\\xmltest\\dd\\GD_20180531_DCJZDDBS.txt");
			char[] len = new char[56];
			int a;
			while((a = reader.read(len))!=-1){
				buffer.append(len);
				if(a<len.length){
					int more = len.length-a ;
					buffer.delete(buffer.length()-more, buffer.length());
				}
			}
			System.out.println(buffer.toString());
			return buffer.toString();
		} catch (Exception e) {
			
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
