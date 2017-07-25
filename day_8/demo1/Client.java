package com.xintian.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 �����ͻ��˵�Socket
		Socket socket = new Socket("localhost",10086);// ��һ�����,�ͽ���������
		
		//2 ��ȡ������
		OutputStream os = socket.getOutputStream();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						socket.getInputStream()));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//3 ��д����
		System.out.print("��¼��Ҫ���͵�����:");
		String input = br.readLine();//����¼��
		os.write(input.getBytes());//����¼�������
		socket.shutdownOutput();//�ر������
		
		String msg = in.readLine();//��ȡ����
		System.out.println("���������ص�����:"+msg);
		//4 �ر���Դ
		os.close();
		br.close();
		in.close();
		socket.close();
	}
}
