package com.coolwi.km.test;

import java.text.SimpleDateFormat;

public class getsysdate {

 public void testgettime(){
     long data=System.currentTimeMillis();
     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
    String date= df.format(data);//��ǰʱ��
     SimpleDateFormat df1 = new SimpleDateFormat("yyyy");//�������ڸ�ʽ
     String yy= df1.format(data);//��
     SimpleDateFormat df2 = new SimpleDateFormat("MM");//�������ڸ�ʽ
     String MM= df2.format(data);//��
     SimpleDateFormat df3 = new SimpleDateFormat("dd");//�������ڸ�ʽ
     String dd= df3.format(data);//��
    // System.o
     System.out.println(df1);
     System.out.println(df2);
     System.out.println(df3);
 }

}
