package test2;
/**
 * 计算从今天算起，100天以后是几月几号，并格式化成xxxx-xx-xx的形式打印出来。
1）调用Calendar类的set()方法，设置当前日期为2021年11月11日，add()方法计算100天后的日期
2）调用Calendar的getTime() 方法返回Date类型对象
2）使用SimpleDateFormat对象，调用format() 方法格式化Date对象
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
                DateFormat  format  =  new SimpleDateFormat("yyyy-MM-dd");//SimpleDateFormat是DateFormat的子类
                String  string  =  format.format(date);
                System.out.println(string);
        }
}


	    
       
	


