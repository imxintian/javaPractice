package FileDemo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Demo_10 {
	public static void main(String[] args) throws IOException {
	/**
	 * System.in  ���ڼ������ݵĶ�ȡ
	 * System.out	���ڿ���̨�Ĵ�ӡ
	 */
	//�Զ����ȡ���̵�������
	//ʹ��BufferedReader ��װ  System.in
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	System.out.println("������һ������?");
	String msg = br.readLine();
	System.out.println(msg);
	
	//��ӡ��
	PrintWriter pw = new PrintWriter(new FileWriter("test.txt"));
	
	pw.println("hello");
	pw.print("world");
	pw.close();
	
	
	//FileWriter ׷��ʹ��
	FileWriter fw = new FileWriter("msg.txt",true);//׷�� msg.txt
	
	
}
}
