public class Demo_02 {
//打印平行四边形
	public static void main(String[] args) {
		
			//外层控制行   6-1-i
			for(int i=0; i<6; i++) {
				//内层控制" "
				for(int j=0; j<5-i; j++) {
					System.out.print("-");
				}
				//内层控制 "*"
				for(int k=0; k<6; k++) {
					System.out.print("*");
				}
				System.out.println();//换行
			}
		}

	}
