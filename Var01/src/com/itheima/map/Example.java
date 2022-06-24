package com.itheima.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("test.properties"));
        properties.forEach((k,v)->System.out.println(k + "=" + v));
        FileOutputStream out = new FileOutputStream("test.properties");
        properties.setProperty("charset", "UTF-8");
        properties.setProperty("user", "shijiaqi");
        properties.store(out, "ĞÂÔöcharset±àÂë");
        
  	}

}
