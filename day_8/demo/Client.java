package com.xintian.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	/**
	 * �����ͻ���
	 * @throws IOException 
	 * @throws UnknownHostException 
	 * 
	 * 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 �����ͻ��˵�socket ���÷�������ip�Ͷ˿�
		Socket socket = new Socket("127.0.0.1",12345);
		System.out.println("���ӷ�����");
		//2 ��ȡ������
		OutputStream os = socket.getOutputStream();
		byte[] byts = "���,���ǿͻ���!".getBytes();
		//3��������
		os.write(byts);
		//4�ر���Դ
		os.close();
		socket.close();
		
	}

}
