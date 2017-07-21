package FileDemo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Demo_10 {
	public static void main(String[] args) throws IOException {
	/**
	 * System.in  用于键盘内容的读取
	 * System.out	用于控制台的打印
	 */
	//自定义读取键盘的流对象
	//使用BufferedReader 包装  System.in
	BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	System.out.println("请输入一行内容?");
	String msg = br.readLine();
	System.out.println(msg);
	
	//打印流
	PrintWriter pw = new PrintWriter(new FileWriter("test.txt"));
	
	pw.println("hello");
	pw.print("world");
	pw.close();
	
	
	//FileWriter 追加使用
	FileWriter fw = new FileWriter("msg.txt",true);//追加 msg.txt
	
	
}
}
