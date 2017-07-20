package FileDemo;
/**
 * 删除文件操作
 */
import java.io.File;

public class Demo_1 {

	public static void main(String[] args) {
		File  file=new File("P:\\test");
		deleteMethod(file);

	}

	private static void deleteMethod(File file) {
			//不存在结束
			if(!file.exists()) {
				return ;
			}
			if(file.isFile()) {
				file.delete();
			}else {
				//获取所有的子文件
				File[] files = file.listFiles();
				//删除子文件
				for (File tmp : files) {
					deleteMethod(tmp);//调用deleteMethod()删除
				}
				//删除这个空文件夹
				file.delete();
			}
		}

}
