package test2;
/**
 * ����ӽ�������100���Ժ��Ǽ��¼��ţ�����ʽ����xxxx-xx-xx����ʽ��ӡ������
1������Calendar���set()���������õ�ǰ����Ϊ2021��11��11�գ�add()��������100��������
2������Calendar��getTime() ��������Date���Ͷ���
2��ʹ��SimpleDateFormat���󣬵���format() ������ʽ��Date����
        2022-02-19
 * @author 1
 *
 */
import  java.text.DateFormat;
import  java.text.SimpleDateFormat;
import  java.util.Calendar;
import  java.util.Date;
public class Demo02 {
	public static void main(String[] args) {
        Calendar  calendar  =  Calendar.getInstance();
                calendar.set(2021, 10, 11);
                calendar.add(Calendar.DATE, 100);
                Date  date  =  calendar.getTime();
                DateFormat  format  =  new SimpleDateFormat("yyyy-MM-dd");//SimpleDateFormat��DateFormat������
                String  string  =  format.format(date);
                System.out.println(string);
        }
}


	    
       
	


