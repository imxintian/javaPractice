package FileDemo;
/**
 * main������һ�㲻���쳣�����Ա�������Ҫ�о���ôץȡ�쳣
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_9 {
	/**
	 *1 main������һ�㲻���쳣
	 */
	public static void main(String[] args) {
		//1 ����������
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("p:/test/1.txt")));
			bw = new BufferedWriter(new FileWriter("note.txt"));
			
			//2 ��д����
			String line = null;
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();//����
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3�ر���Դ
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
					//û�йر���Դ  br�Ͳ�ָ�����������
					br=null;//brָ��null 
				} 
			}
			if(bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					bw=null;
				}
			}
		}
	
	}

}


