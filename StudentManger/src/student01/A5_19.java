package student01;
import java.util.Scanner;

public class A5_19 {
	
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("������ѧ����������");
	         //��������ѧ������  
			int renshu=sc.nextInt();
			
	        System.out.println("������γ̵���Ŀ");
	        int courseNum=sc.nextInt();
	        //�����������ѧ��     
	        //�������� []������=new ��������[����]
	        String[] name=new String[renshu];//����һ��String�����������ѧ��������
	        // ����  ��ſγ�
	            String [] course=new String[courseNum];//����һ��String��������ſγ�
	            int [][] number=new int[renshu][courseNum];
                int[]sum=new int[renshu];//�ж����˾��ж����ܷ�
	            int[]avg=new int[renshu];//ƽ����
	              String[]str=new  String[renshu];
	            
	            //for ѭ��
	        /*
	         * ����ѭ���Ĵ洢�γ̵�����
	         * */
		    for(int i=0;i<course.length;i++){ //
		    	System.out.println("�붨���"+(i+1)+"�ſγ̵�����");
		    //�������տγ�
		        course[i]=sc.next();   
		        
		    } 
		    /*
	         * ����¼��ѧ���ĸ��Ƶĳɼ�
	         * */
		    for (int i=0;i<renshu;i++){
		    	int S=0;
		    	System.out.println("������ѧ����������");
		          name[i]=sc.next();//�������ѧ������
		          String str11="";
		    	 for(int j=0; j<courseNum; j++){
		    		 System.out.println("������ѧ��"+name[i]+course[j]+"�ĳɼ�");
		    	     number[i][j] =sc.nextInt();//�����洢�ض�ѧ�����ض��ĳɼ�
		    	     S+=number[i][j];//��ɼ��ܺ�
		    	     str11+=number[i][j]+"\t";
		    	 }
		    	 sum[i]=S;
		    	 avg[i]=S/courseNum;
		    	 str[i]=name[i]+"\t"+str11+sum[i]+"\t"+avg[i];
		    }
		     for(int i=0;i<sum.length;i++){
		    	 for(int j=0;j<sum.length-1;j++){
		    		 //��ֵ����
		    		if(sum[j]<sum[j+1]){
		    			int t1=sum[j];     String t2=str[j];
		    			                    str[j]=str[j+1];
		    			sum[j]=sum[j+1];       str[j+1]=t2;
		    			sum[j+1]=t1;
		    			
		    			
		    		} 
		    	 }
		    	 
		     }
		    System.out.print("ѧ��");
		    for(int i=0;i<course.length;i++){
		    	System.out.print("\t"+course[i]);//����γ̵�����
		    	}
		       System.out.print("\t�ܷ�\tƽ����\t���а�");
		     System.out.println();//����
		    for(int i=0;i<renshu;i++){
		    	System.out.println(str[i]+"\t��"+(i+1)+"��");
		    	
		    	
		    	
		    }
		
		}

	}


