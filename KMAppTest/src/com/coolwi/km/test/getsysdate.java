package com.coolwi.km.test;

import java.text.SimpleDateFormat;

public class getsysdate {

 public void testgettime(){
     long data=System.currentTimeMillis();
     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
    String date= df.format(data);//当前时间
     SimpleDateFormat df1 = new SimpleDateFormat("yyyy");//设置日期格式
     String yy= df1.format(data);//年
     SimpleDateFormat df2 = new SimpleDateFormat("MM");//设置日期格式
     String MM= df2.format(data);//月
     SimpleDateFormat df3 = new SimpleDateFormat("dd");//设置日期格式
     String dd= df3.format(data);//日
    // System.o
     System.out.println(df1);
     System.out.println(df2);
     System.out.println(df3);
 }

}
