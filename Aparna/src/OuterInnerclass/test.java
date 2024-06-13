package OuterInnerclass;

import OuterInnerclass.OuterClass.InnerClass;

public class test {

	public static void main(String[] args)
	{
       OuterClass u=new OuterClass();
       InnerClass i=new OuterClass.InnerClass();
       // i.m1();//
       //InnerClass.m1();
       System.out.println(i.c);//0
       i.m1();
       System.out.println(i.c);//
       OuterClass.InnerClass.m2();
      

       
    }

}
/*
 * if there is a two inner classes
 * 
 */
