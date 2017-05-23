package day_4;

/*
 * 圆柱体类,继承圆类
 */
public class cylinder extends cirlce {
	private double height;

	public cylinder(double radius, double height) {
		super(radius);
		height = this.height;
	}

	// 求体积
	public static double getVol(double radius, double height) {
		return getAera(radius) * height;
	}

	public static void show(double radius, double height) {
		System.out.println("圆柱体积为" + getVol(radius, height));
	}
}
