package FileDemo;
/**
 * 复制文件
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_4 {
	

	public static void main(String[] args) {
		try {
			copyfiles();
			copyFile1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//高效流操作
// 耗时16.493

	private static void copyfiles() throws IOException {
		//获取系统时间
		long start = System.currentTimeMillis();
		//1 创建流对象
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("P:\\test\\肖申克的救赎.RMVB"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("P:\\test\\movie\\movie.RMVB"));
		byte []bytes=new byte[1024];
		//2 读写数	据
		int len = 0;//实际读取的长度
		while((len=bis.read(bytes, 0, bytes.length))!=-1) {
			bos.write(bytes,0,len);
		}
		//关闭资源
		bis.close();
		bos.close();
		long end = System.currentTimeMillis();
		System.out.println((end-start)*1.0/1000);
	}
	//字符流操作
	//耗时：32.962
		private static void copyFile1() throws IOException {
			long start = System.currentTimeMillis();
			
			//1 创建流对象
			FileInputStream fis = new FileInputStream("P:\\\\test\\\\肖申克的救赎.RMVB");
			FileOutputStream fos = new FileOutputStream("P:\\test\\movie\\movie.RMVB");
			
			byte[] buf = new byte[1024];
			int len = 0;//实际长度
			while((len=fis.read(buf, 0, buf.length))!=-1) {
				fos.write(buf,0,len);
			}
			//3 关闭资源
			fis.close();
			fos.close();
			
			long end = System.currentTimeMillis();
			System.out.println((end-start)*1.0/1000);
		}
}
