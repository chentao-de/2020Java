package student01;

import java.util.Scanner;

public class A5_18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ����������");
         //��������ѧ������  
		int renshu=sc.nextInt();
		
        System.out.println("������γ̵���Ŀ");
        int courseNum=sc.nextInt();
        //�����������ѧ��     
        //�������� []������=new ��������[����]
        String[] name=new String[renshu];
        // ����  ��ſγ�
        String [] course=new String[courseNum];
        //for ѭ��
	    for(int i=0;i<course.length;i++){ //
	    	System.out.println("�붨���"+(i+1)+"�ſγ̵�����");
	    //�������տγ�
	        course[i]=sc.next();     
	    }      
	
	}

}
