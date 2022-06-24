package com.itheima.list;

import  java.util.*;
public  class  ArrayLIstTest{
  public  static  void  main(String[]  args)  {
          //创建了一个ArrayList对象：list
          List<String>  list=new ArrayList( );

          //向list中添加元素
          list.add("Hello");
          list.add("World");
          list.add("HaHaHaHa");

          //第一种遍历方法使用增强型foreach语句遍历List
          for  (String str :list)  {                        
                System.out.println(str);
          }  

          //第二种遍历，把ArrayList转换为数组，然后对数组进行遍历
          String[]  strArray=new  String[list.size()];
          list.toArray(strArray);
          for(int  i=0;i<strArray.length;i++)  
          {
                
          System.out.println(strArray[i]);

          }    

        //第三种遍历  使用Iterator迭代器接口进行遍历        
          Iterator<String>  it=list.iterator( );
          while(it.hasNext())//判断下一个元素之后有值
          {
                  System.out.println(it.next());
          }

  }


	}


