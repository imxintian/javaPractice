package day_4;

public class cirlce {
	// 定义私有变量，半径
	private double radius;

	public cirlce() {
		this.radius = 0;
	}

	public cirlce(double radius) {
		radius = this.radius;
	}

	public static double getAera(double radius) {
		return Math.PI * radius * radius;
	}

	public static double getperimeter(double radius) {
		return Math.PI * 2 * radius;
	}

	public static void show(double radius) {
		System.out.println("圆的半径为" + radius);
		System.out.println("圆的周长为" + getperimeter(radius));
		System.out.println("圆的面积为" + getAera(radius));
	}
}
