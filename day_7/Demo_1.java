package FileDemo;
/**
 * ɾ���ļ�����
 */
import java.io.File;

public class Demo_1 {

	public static void main(String[] args) {
		File  file=new File("P:\\test");
		deleteMethod(file);

	}

	private static void deleteMethod(File file) {
			//�����ڽ���
			if(!file.exists()) {
				return ;
			}
			if(file.isFile()) {
				file.delete();
			}else {
				//��ȡ���е����ļ�
				File[] files = file.listFiles();
				//ɾ�����ļ�
				for (File tmp : files) {
					deleteMethod(tmp);//����deleteMethod()ɾ��
				}
				//ɾ��������ļ���
				file.delete();
			}
		}

}
