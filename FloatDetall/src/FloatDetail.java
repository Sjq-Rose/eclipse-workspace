
public class FloatDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //java的浮点型常量（具体值）默认为double型，省明float型常量，须后加‘f’或‘F’
		//float num1 = 1.1; 错误
		float num2 = 1.1F;//对
		double num3 = 1.1;//对
		double num4 = 1.1f;//小类型转换为大类型可以加f或F
		//十进制数形式：如：5.12    512.0f   .512（必须有小数点）
		double num5 = .123 ;//等价于0.123
		System.out.println(num5);
		//科学计数法形式：5.12e2  [5.12*10的二次方】  5.12E-2   【】
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512
	    //通常情况下使用double型，因为它比float型更精确。
		double num9 = 2.1234567851;
		float  num10 = 2.123457851f;
		System.out.println(num9);
		System.out.println(num10);
		//浮点数使用陷阱：2.7和8.1/3 比较
		double num11 = 2.7;
		double num12 = 8.1/3;//2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7
		//得到一个重要的使用点：当我们对运算结果是小数的进行想等判断时，要小心
		//应该是以两个数的差值的绝对值，在某个精度范围类判断
		// 正确的写法， Ctrl + / 注释快捷键，再次输入就取消注释
		//if（Math.abs(num11 -num12) <0.000001) {
			System.out.println("差值非常小，到我的规定精度，认为相等...");
		
		//可以通过java API 
		//System.out.println(Main.abs(num11 - num12));
	}
}
