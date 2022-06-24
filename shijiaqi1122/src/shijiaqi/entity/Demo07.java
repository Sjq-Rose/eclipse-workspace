package shijiaqi.entity;

import javax.security.auth.Subject;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;
import javax.tools.Diagnostic;
class Dun {

	public int Sub(int a, int n) {
		return a - n;
	}

	public double Sub(double a, double n) {
		return a - n;
	}
}

public class Demo07 {
	public static void main(String[] args) { // 定义sub 方法时用了static ,下面主方法可以不用new个对象。
		Dun d = new Dun();

		System.out.println(d.Sub(10, 1));
		System.out.println(d.Sub(10.0, 1.0));
	}
}
