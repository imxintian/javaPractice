import java.util.Scanner;
//��ӡ����
public class Demo_03 {
	
	public static void main(String[] args) {   
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		int m=sc.nextInt();
		//i��������
		for (int i = 1; i <= m; i++) {
			//j���ƿո� �ո�=����-i;
			for (int j =1 ; j <=m-i; j++) {
				System.out.print("-");
				}
			//k �����Ǻţ��Ǻ�=2*i-1;
				for (int k = 1; k <=2*i-1 ; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//�°벿��
		//��i������
		for (int i = m-1; i >0; i--) {
			for (int j =1 ; j <=m-i; j++) {
				System.out.print("-");
				}
				for (int k = 1; k <=2*i-1 ; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		}
	}	