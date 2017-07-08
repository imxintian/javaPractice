import java.util.Scanner;
//打印菱形
public class Demo_03 {
	
	public static void main(String[] args) {   
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入行数：");
		int m=sc.nextInt();
		//i控制行数
		for (int i = 1; i <= m; i++) {
			//j控制空格 空格=行数-i;
			for (int j =1 ; j <=m-i; j++) {
				System.out.print("-");
				}
			//k 控制星号，星号=2*i-1;
				for (int k = 1; k <=2*i-1 ; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		//下半部分
		//把i做减减
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