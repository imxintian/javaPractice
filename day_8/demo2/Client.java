package com.xintian.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 �����ͻ���socket
		Socket socket = new Socket("localhost",12345);
		//2 ����������
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		OutputStream out = socket.getOutputStream();
		//3 ��������
		String line = null;
		System.out.println("����������,(����886�Ƴ�)");
		while((line=br.readLine())!=null) {//�Ӽ��̻�ȡ����
			if("886".equals(line)) {
				break;//����886����ѭ��
			}
			line = line+"\r\n";
 			out.write(line.getBytes());//��������
		}
		//4 �ر���Դ
		br.close();
		out.close();
		socket.close();
	}
}
