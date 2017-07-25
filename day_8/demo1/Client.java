package com.xintian.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 创建客户端的Socket
		Socket socket = new Socket("localhost",10086);// 这一步完成,就建立了连接
		
		//2 获取流对象
		OutputStream os = socket.getOutputStream();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//3 读写数据
		System.out.print("请录入要发送的数据:");
		String input = br.readLine();//键盘录入
		os.write(input.getBytes());//发送录入的数据
		socket.shutdownOutput();//关闭输出流
		
		String msg = in.readLine();//读取数据
		System.out.println("服务器返回的数据:"+msg);
		//4 关闭资源
		os.close();
		br.close();
		in.close();
		socket.close();
	}
}
