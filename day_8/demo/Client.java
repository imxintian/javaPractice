package com.xintian.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	/**
	 * 创建客户端
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * 
	 * 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 创建客户端的socket 设置服务器的ip和端口
		Socket socket = new Socket("127.0.0.1",12345);
		System.out.println("连接服务器");
		//2 获取流对象
		OutputStream os = socket.getOutputStream();
		byte[] byts = "你好,我是客户端!".getBytes();
		//3发送数据
		os.write(byts);
		//4关闭资源
		os.close();
		socket.close();
		
	}

}
