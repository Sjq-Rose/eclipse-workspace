package com.itheima.list;

import  java.util.*;
public  class  ArrayLIstTest{
  public  static  void  main(String[]  args)  {
          //������һ��ArrayList����list
          List<String>  list=new ArrayList( );

          //��list�����Ԫ��
          list.add("Hello");
          list.add("World");
          list.add("HaHaHaHa");

          //��һ�ֱ�������ʹ����ǿ��foreach������List
          for  (String str :list)  {                        
                System.out.println(str);
          }  

          //�ڶ��ֱ�������ArrayListת��Ϊ���飬Ȼ���������б���
          String[]  strArray=new  String[list.size()];
          list.toArray(strArray);
          for(int  i=0;i<strArray.length;i++)  
          {
                
          System.out.println(strArray[i]);

          }    

        //�����ֱ���  ʹ��Iterator�������ӿڽ��б���        
          Iterator<String>  it=list.iterator( );
          while(it.hasNext())//�ж���һ��Ԫ��֮����ֵ
          {
                  System.out.println(it.next());
          }

  }


	}


