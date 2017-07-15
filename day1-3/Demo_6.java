package day_7;




	import java.util.Scanner;
	/**
	 * 迷你DVD管理器
	需求说明：为某音像店开发一个迷你DVD管理器，实现如下图所示的DVD碟片的管理功能。
	功能具体包括：新增、查看、删除、借出、归还和退出。程序可参照以下步骤进行开发：
	（1）数据初始化
	使用数组对象保存DVD信息；每张DVD的信息包含：名称、是否可借的状态、借出的日期、借出的次数。
	（2）查看DVD信息
		使用for循环遍历显示每个DVD的信息。当name[i]==null时循环结束。
	（3）新增DVD信息
	向各数组中存储相应的DVD信息，如果已经存储了6个DVD则提示用户货架已满。
	（4）删除DVD信息
	按照输入的名称，删除指定DVD信息；删除借出状态的DVD和不存在的DVD时，都要给出相应提示。
	（5）借出DVD业务处理
	按照输入的名称，借出指定DVD；若该DVD已借出或没有该DVD，都要给出相应提示。
	（6）归还DVD业务处理
	如果归还未借出的DVD、不存在的DVD分别给出相应提示。
	（7）菜单切换
		使用switch语句实现菜单选择；使用循环来实现返回和退出。

	 * @author tiantian
	 *
	 */
	public class Demo_6 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			boolean flag=false;
			//命名dvd
			String[]names=new String[6];
			//借阅状态,DVD借阅状态 0：可借出 1：已借出
			int []states=new int [6];
			//借阅次数
			int[]count=new int [6];
			//借阅日期
			int []dates=new int [6];
			//1. 初始化数据
			names[0]="嫌疑人X的献身";
			states[0]=1;
			dates[0]=1;
			count[0]=10;
			
			names[1]="放学后";
			states[1]=0;
			count[1]=12;
			
			names[2]="追风筝的人";
			states[3]=1;
			count[3]=20;
			int num =-1;
	//主题部分
			do { // 主菜单显示
	            System.out.println("欢迎使用迷你DVD管理器");
	            System.out.println("-----------------");
	            System.out.println("1、新增DVD");
	            System.out.println("2、查看DVD");
	            System.out.println("3、删除DVD");
	            System.out.println("4、借出DVD");
	            System.out.println("5、归还DVD");
	            System.out.println("6、退出DVD");
	            System.out.println("-----------------");
	            System.out.println("请选择:");
	            int choice=sc.nextInt();
	            switch (choice) {
	            case 1:
					//查看
					 System.out.println("-->查看DVD");
		             System.out.println("序号\t" + "状态\t" + "名称\t\t" + "借出日期\t" + "借出次数");
		             for (int i = 0; i < names.length; i++) {
						if (names[i]!=null) {
							String state=(states[i]==0)?"可借":"已借出";
							String dateStr = (dates[i] == 0) ? "" : (dates[i] + "日");
	                       String countStr = (count[i] == 0) ? "" : (count[i] + "次");
	                       System.out.println((i + 1) + "\t" + state + "\t" + names[i] + "\t\t" + dateStr + "\t" + countStr);
	                       }
		             	}
		             break;
				case 2:
					//新增DVD
					System.out.println("--->新增DVD");
					System.out.println("请输入DVD名称：");
					String name=sc.next();
					boolean flag1=false;
					for (int i = 0; i < names.length; i++) {
						//插入DvD
						if (names[i]==null) {
							names[i]=name;
							flag1=true;
							break;
							}
					}
					if (flag1) {
						System.out.println("新增《"+name+"》成功！");
					}else {
						System.out.println("货架已满，无法新增！");
					}
					break;
					
					case 3:
						  // 删除
		                System.out.println("-->删除DVD");
		                System.out.println("请输入要删除的DVD名称：");
		                String delete = sc.next();
		                // 能否找到用户要删除的DVD名称
		                // false 没有找到匹配的DVD，不能删除
		                // true 能找到相应的DVD
		                boolean flag2 = false;
		                // 记录要删除的DVD位置
		                int index = -1;
		                // 找到要删除DVD的位置
		                for (int i = 0; i < names.length; i++) {
							if (names[i] != null && delete.equals(names[i]) && states[i] == 1) {
								//有，但是已经借出
								flag2 = true;
		                        System.out.println("对不起，要删除的DVD已经借出，无法删除！");
		                        break;
							}
							else if (names[i] != null && delete.equals(names[i]) && states[i] == 0) {
								//有，没有借出
								 flag2 = true;
			                     index = i;
			                     System.out.println("删除《" + delete + "》成功！");
			                     break;
							}
						}
		                // 找到DVD才删除
		                if (index != -1) {
		                    // 根据上一步找到的下标位置index，开始删除工作
		                    for (int j = index; j < names.length; j++) {
		                        // 删除，后面的值一次往前覆盖，最后一个值为null
		                        if (j != names.length - 1) {
		                            names[j] = names[j + 1];
		                            states[j] = states[j + 1];
		                            dates[j] = dates[j + 1];
		                            count[j] = count[j + 1];

		                        }
		                        names[names.length - 1] = null;
		                        states[names.length - 1] = 0;
		                        dates[names.length - 1] = 0;
		                        count[names.length - 1] = 0;

		                    }
		                }
		                if (!flag2) {
		                    System.out.println("对不起，没有匹配的DVD信息，无法删除！");
		                }
		                break;
					case 4:
		                // 借出
		                System.out.println("请输入要借阅的DVD名称：");
		                String want = sc.next();
		                for (int i = 0; i <= names.length; i++) {
		                    if (names[i] == null) {
		                        System.out.println("没有匹配的DVD信息");
		                        break;
		                    } else if (want.equals(names[i]) && states[i] == 1) {
		                        System.out.println(want + "已借出，无法借阅！");
		                        break;
		                    } else if (want.equals(names[i]) && states[i] == 0) {
		                        System.out.print("请输入借阅日期：");
		                        dates[i] = sc.nextInt();
		                        while (dates[i] < 1 || dates[i] > 31) {
		                            System.out.println("日期必须在1~31之间，请重新输入！");
		                            dates[i] = sc.nextInt();
		                        }
		                        states[i] = 1;
		                        count[i]++;
		                        System.out.println("《" + want + "》借阅成功！");
		                        break;
		                    }
		                }

		                break;
					 case 5:
			                // 归还
			                System.out.println("请输入要归还的DVD名称：");
			                String back = sc.next();
			                for (int i = 0; i <= names.length; i++) {
			                    if (names[i] == null) {
			                        System.out.println("没有匹配的DVD信息");
			                        break;
			                    } else if (back.equals(names[i]) && states[i] == 0) {
			                    	//未借出，无法归还
			                        System.out.println(back + "未被借出，无法归还！");
			                        break;
			                    } else if (back.equals(names[i]) && states[i] == 1) {
			                        System.out.print("请输入归还日期：");
			                        // 记录归还日期
			                        int backDate = sc.nextInt();
			                        while (backDate < dates[i] || backDate > 31) {
			                            if (backDate < dates[i]) {
			                                System.out.println("归还日期不能小于借出日期，请重新输入！");
			                            } else if (backDate > 31) {
			                                System.out.println("归还日期必须在1~31之间，请重新输入！");
			                            }
			                            backDate = sc.nextInt();
			                        }
			                        states[i] = 1;
			                        count[i]++;
			                        System.out.println("《" + back + "》归还成功！");
			                        System.out.println("《" + back + "》借阅日期：" + dates[i] + "日");
			                        System.out.println("《" + back + "》归还日期：" + backDate + "日");
			                        // 数据更新
			                        states[i] = 0;
			                        dates[i] = 0;
			                        break;
			                    }
			                }
			                break;
					 case 6:
			                // 退出
			                flag = true;
			                break;
			            default:
			                // 输入要求以外的数字，默认退出
			                flag = true;
			                break;
			            }
			            if (flag) {
			                // 想退出菜单
			                num = -1;
			                break;

			            } else {
			                // 不退出，继续进行主菜单选择
			                System.out.println("-----------------");
			                System.out.println("请输入0返回：");
			                num = sc.nextInt();
			            }
			        } while (num == 0);
			        // 程序退出，结束
			        System.out.println("谢谢使用本系统！");
			    }
			}


