package com.imooc.resource.demo;

import org.springframework.core.io.FileSystemResource;

import java.io.*;

/**
 * @author hike97
 * @create 2021-06-07 11:40
 * @desc
 **/
public class ResourceDemo {
	public static void main (String[] args) throws IOException {
		FileSystemResource fileSystemResource = new FileSystemResource ("E:\\idea_workspace_2021\\spring-framework-5.2.15.RELEASE\\spring-demo02\\src\\main\\java\\com\\imooc\\resource\\demo\\word.txt");
		File file = fileSystemResource.getFile ();
		System.out.println (file.length ());
		//获得输出流
		OutputStream outputStream = fileSystemResource.getOutputStream ();
		BufferedWriter bufferedWriter = new BufferedWriter (new OutputStreamWriter (outputStream));
		bufferedWriter.write ("Hello World");
		bufferedWriter.flush ();
		outputStream.close ();
		bufferedWriter.close ();
	}
}
