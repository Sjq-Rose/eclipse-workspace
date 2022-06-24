package hello;


//统计字符 abc出现的次数。
public class Demo03 {

	public static void main(String[] args) {
        String str1 = "abcadecabdbcacb";
        String str2 = "abc";
        int oldlength = str1.length();
        int newlength = str1.replace(str2,"").length();
        System.out.println((oldlength - newlength)/str2.length());
	}

}
