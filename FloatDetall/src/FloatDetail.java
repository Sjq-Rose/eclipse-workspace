
public class FloatDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�ʡ��float�ͳ��������ӡ�f����F��
		//float num1 = 1.1; ����
		float num2 = 1.1F;//��
		double num3 = 1.1;//��
		double num4 = 1.1f;//С����ת��Ϊ�����Ϳ��Լ�f��F
		//ʮ��������ʽ���磺5.12    512.0f   .512��������С���㣩
		double num5 = .123 ;//�ȼ���0.123
		System.out.println(num5);
		//��ѧ��������ʽ��5.12e2  [5.12*10�Ķ��η���  5.12E-2   ����
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512
	    //ͨ�������ʹ��double�ͣ���Ϊ����float�͸���ȷ��
		double num9 = 2.1234567851;
		float  num10 = 2.123457851f;
		System.out.println(num9);
		System.out.println(num10);
		//������ʹ�����壺2.7��8.1/3 �Ƚ�
		double num11 = 2.7;
		double num12 = 8.1/3;//2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//�ӽ�2.7��һ��С����������2.7
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж�ʱ��ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		// ��ȷ��д���� Ctrl + / ע�Ϳ�ݼ����ٴ������ȡ��ע��
		//if��Math.abs(num11 -num12) <0.000001) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���...");
		
		//����ͨ��java API 
		//System.out.println(Main.abs(num11 - num12));
	}
}
