package com.xintian.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/*
	 * �����ͻ���
	 * 
	 *   �ͻ��˷�����Ϣ,�������ظ�
	 */
	public static void main(String[] args) throws IOException {
		//1 ������������socket
		ServerSocket server = new ServerSocket(10086);
		//2 �ȴ��ͻ�����
		Socket socket = 	server.accept();
		String ip = socket.getInetAddress().getHostName();
		System.out.println(ip+"���ӽ���");
		//3 ��ȡ�� ����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		OutputStream os = socket.getOutputStream();
		//4 ��ȡ����
		String msg = br.readLine();
		System.out.println(ip+":"+msg);
		socket.shutdownInput();//�ر�������
		//5 �ظ�����
		os.write("�ҽ��ܵ�������".getBytes());
		
		//6 �ر���Դ
		br.close();
		os.close();
		socket.close();
		
	}
}
