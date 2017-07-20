package FileDemo;
/**
 * 复制文件
 */
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_3 {

	public static void main(String[] args) {
		
		try {
			copyFile();
			copyFile1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 法一： 字符流
	// 耗时：0.001
	private static void copyFile() throws IOException {
		//获取程序开始执行时的系统时间
		long start=System.currentTimeMillis();
		//创建流对象
		FileInputStream fiStream=new FileInputStream("p:/test/1.txt");
		//
		FileOutputStream foStream=new FileOutputStream("小说.txt");
		/* *  int read(byte[] buf,int offset,int len)
		 *  	buf  存数据,每次读取的数据都会存于这个数组
		 *  	offset  一般为0
		 *  	len  期望读取的长度
		 *  	返回值:	一共去读的字节数,或-1
		 */
		//创建缓冲数组
		byte[] buf=new byte[1024];
		int len=0;
		//读写数据
		while ((len=fiStream.read(buf, 0, buf.length))!=-1) {
			foStream.write(buf,0,len);
		}
		// 关闭资源
		fiStream.close();
		foStream.close();
		//获取结束时系统时间
		long end = System.currentTimeMillis();
		System.out.println((end-start)*1.0/1000);
		
	}
	    
		//法二  字节流操作
	    //耗时0.037
		private static void copyFile1() throws IOException {
			long start = System.currentTimeMillis();
			//copy operation
			//1 创建流对象
			FileInputStream fis = new FileInputStream("p:/test/1.txt");
			FileOutputStream fos = new FileOutputStream("小说.txt");
			//2 读写数据
			int data = 0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			//3 关闭资源
			fis.close();
			fos.close();
			long end = System.currentTimeMillis();
			System.out.println((end-start)*1.0/1000);
		}

}
