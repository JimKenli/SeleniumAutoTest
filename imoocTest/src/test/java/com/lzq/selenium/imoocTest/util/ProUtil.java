package com.lzq.selenium.imoocTest.util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProUtil {
	private Properties prop;
	private String filePath;
	/**
	 * 构造方法
	 */
	public ProUtil(String filePath){
		this.filePath = filePath;
		//System.out.println(this.filePath);
		this.prop = readProperties();
	}
	
	/**
	 * 读取配置文件
	 */
	private Properties readProperties(){
		Properties properties = new Properties();
		try {
			InputStream inputStream = new FileInputStream(filePath);
			BufferedInputStream in = new BufferedInputStream(inputStream);
			properties.load(in);
			//System.out.println(properties.getProperty("username"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	
	public String getPro(String key){
		
		if(prop.containsKey(key)){
			String username = prop.getProperty(key);
			System.out.println("找到了" + key + username);
			return username;
		}else{
			System.out.println("值不对" + key);
			return "";
		}

		
	}
	
	/**
	 * 写入内容
	 * */
	public void writePro(String key,String value){
		Properties pro = new Properties();
			try {
				FileOutputStream file = new FileOutputStream(filePath);
				pro.setProperty(key, value);
				pro.store(file, key);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	

}
