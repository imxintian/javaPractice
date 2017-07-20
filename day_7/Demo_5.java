package FileDemo;
import java.io.FileInputStream;

/*
 * 转换流（把字节流转换为字符流，可以指定编码集）
 * 字符流,用于文本的读写(文本文件,用记事本打开能看)
 * 输入流
 * 		int read()		读一个字符
 * 		int read(char[] buf, int offset, int len) 
 * 输出流
 * 		write(String str)
 * 		write(char[] buf, int offset, int len)
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;



public class Demo_5 {
	public static void main(String[] args)  {
		try {
			writeFile();
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile() throws IOException {
		InputStreamReader isr=new InputStreamReader(new FileInputStream("p:/test/1.txt"),"utf-8");
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("p:/test/2.txt"), "utf-8"); 
		//读写数据
		int len=0;
		char[] cbuf = new char[1024];
		while((len=isr.read(cbuf, 0, cbuf.length))!=-1) {
			//打印到控制台
			System.out.println(new String(cbuf,0,len));
			//写入到2.txt
			osw.write(cbuf, 0, len);
		}
		//3 关闭资源
		isr.close();
		osw.close();
			
	}

	private static void writeFile() throws IOException {
		OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream("p:/test/1.txt"), "utf-8");
		out.write("小说正文\n\r");
		out.write("这是小说正文");
		out.close();
	}
}
