package student01;

import java.util.Scanner;

public class A5_18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生的人数：");
         //用来接收学生人数  
		int renshu=sc.nextInt();
		
        System.out.println("请输入课程的数目");
        int courseNum=sc.nextInt();
        //用数组来存放学生     
        //数据类型 []数组名=new 数据类型[长度]
        String[] name=new String[renshu];
        // 数组  存放课程
        String [] course=new String[courseNum];
        //for 循环
	    for(int i=0;i<course.length;i++){ //
	    	System.out.println("请定义第"+(i+1)+"门课程的名字");
	    //用来接收课程
	        course[i]=sc.next();     
	    }      
	
	}

}
