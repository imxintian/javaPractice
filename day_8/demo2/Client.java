package com.xintian.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 创建客户端socket
		Socket socket = new Socket("localhost",12345);
		//2 创建流对象
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		OutputStream out = socket.getOutputStream();
		//3 发送数据
		String line = null;
		System.out.println("请输入内容,(输入886推出)");
		while((line=br.readLine())!=null) {//从键盘获取数据
			if("886".equals(line)) {
				break;//输入886结束循环
			}
			line = line+"\r\n";
 			out.write(line.getBytes());//发送数据
		}
		//4 关闭资源
		br.close();
		out.close();
		socket.close();
	}
}
