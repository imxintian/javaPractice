public class Demo_02 {

	public static void main(String[] args) {
		
			//��������   6-1-i
			for(int i=0; i<6; i++) {
				//�ڲ����" "
				for(int j=0; j<5-i; j++) {
					System.out.print("-");
				}
				//�ڲ���� "*"
				for(int k=0; k<6; k++) {
					System.out.print("*");
				}
				System.out.println();//����
			}
		}

	}
