package student01;
import java.util.Scanner;

public class A5_19 {
	
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入学生的人数：");
	         //用来接收学生人数  
			int renshu=sc.nextInt();
			
	        System.out.println("请输入课程的数目");
	        int courseNum=sc.nextInt();
	        //用数组来存放学生     
	        //数据类型 []数组名=new 数据类型[长度]
	        String[] name=new String[renshu];//声明一个String数组用来存放学生的姓名
	        // 数组  存放课程
	            String [] course=new String[courseNum];//声明一个String数组来存放课程
	            int [][] number=new int[renshu][courseNum];
                int[]sum=new int[renshu];//有多少人就有多少总分
	            int[]avg=new int[renshu];//平均分
	              String[]str=new  String[renshu];
	            
	            //for 循环
	        /*
	         * 用来循环的存储课程的名称
	         * */
		    for(int i=0;i<course.length;i++){ //
		    	System.out.println("请定义第"+(i+1)+"门课程的名字");
		    //用来接收课程
		        course[i]=sc.next();   
		        
		    } 
		    /*
	         * 用来录入学生的各科的成绩
	         * */
		    for (int i=0;i<renshu;i++){
		    	int S=0;
		    	System.out.println("请输入学生的姓名：");
		          name[i]=sc.next();//用来存放学生姓名
		          String str11="";
		    	 for(int j=0; j<courseNum; j++){
		    		 System.out.println("请输入学生"+name[i]+course[j]+"的成绩");
		    	     number[i][j] =sc.nextInt();//用来存储特定学生的特定的成绩
		    	     S+=number[i][j];//算成绩总和
		    	     str11+=number[i][j]+"\t";
		    	 }
		    	 sum[i]=S;
		    	 avg[i]=S/courseNum;
		    	 str[i]=name[i]+"\t"+str11+sum[i]+"\t"+avg[i];
		    }
		     for(int i=0;i<sum.length;i++){
		    	 for(int j=0;j<sum.length-1;j++){
		    		 //数值交换
		    		if(sum[j]<sum[j+1]){
		    			int t1=sum[j];     String t2=str[j];
		    			                    str[j]=str[j+1];
		    			sum[j]=sum[j+1];       str[j+1]=t2;
		    			sum[j+1]=t1;
		    			
		    			
		    		} 
		    	 }
		    	 
		     }
		    System.out.print("学生");
		    for(int i=0;i<course.length;i++){
		    	System.out.print("\t"+course[i]);//输出课程的名称
		    	}
		       System.out.print("\t总分\t平均分\t排行榜");
		     System.out.println();//换行
		    for(int i=0;i<renshu;i++){
		    	System.out.println(str[i]+"\t第"+(i+1)+"名");
		    	
		    	
		    	
		    }
		
		}

	}


