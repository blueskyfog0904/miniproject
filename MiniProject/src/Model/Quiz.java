package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> questionL = new ArrayList<String>();
	ArrayList<String> answerL = new ArrayList<String>();
	ArrayList<String> questionM = new ArrayList<String>();
	ArrayList<String> answerM = new ArrayList<String>();
	ArrayList<String> questionH = new ArrayList<String>();
	ArrayList<String> answerH = new ArrayList<String>();
	
	Scanner sc = new Scanner(System.in);
	
//	for(int i = 0 ; i < questionH.size(); i++)
//	{
//		System.out.println(questionH.get(i));
//	}
	
	questionH = null;
	answerH = null;
	
//	String inputQ = sc.nextLine();
//	questionL.add(inputQ);

	
//	questionL.remove(0);

	
	
	System.out.println("==== ���� �޴� ====");
	System.out.print("[1] ���� �Է� [2] ���� ����, �� Ȯ�� [3] ���� ���� >> ");
	int menu = sc.nextInt();
	if(menu==1) {
	
	while(true) {

	System.out.println("���̵��� �Է��ϼ��� (��,��,��)");
	String level = sc.next();
	
	sc.nextLine();
	
	
	System.out.println("������ �Է��ϼ���");
	String inputQ = sc.nextLine();
	
		
	System.out.println("���� �Է��ϼ���");
	String inputA = sc.nextLine();
	

	
	
	if(level.equals("��")) {
		questionH.add(inputQ);
		answerH.add(inputA);
		
		
	}
	else if(level.equals("��")) {
		questionM.add(inputQ);
		answerM.add(inputA);
		
	}
	else if(level.equals("��")) {
		questionL.add(inputQ);
		answerL.add(inputA);
	}
	System.out.println("�߰� ���� �Է��Ͻðڽ��ϱ�?? [ Y / N ]");
		
	String addQuestion = sc.next();
	if(addQuestion.equals("N"))
	{
		System.out.println("�����Է��� ����Ǿ����ϴ�.");
		break;
	}
	
	
	}
	}
	else if(menu==2) { // [2] ��������, �� Ȯ��
		while(true) {
		System.out.print("���� ���̵��� �Է��ϼ��� (��,��,��) >> ");
		String level = sc.next();
		if(level.equals("��")) {
			for(int i = 0; i < questionH.size(); i++)
			{
				System.out.println(questionH.get(i));
				System.out.println(answerH.get(i));
				
			}
			
			
		}
		else if(level.equals("��")) {
			for(int i = 0; i < questionM.size(); i++)
			{
				System.out.println(questionM.get(i));
				System.out.println(answerM.get(i));
				
			}
			
			
		}
		else if(level.equals("��")) {
			for(int i = 0; i < questionH.size(); i++)
			{
				System.out.println(questionL.get(i));
				System.out.println(answerL.get(i));
				
			}
			
		}
		System.out.println("�����Ͻðڽ��ϱ� [ Y / N ]");
			String exit = sc.next();
			if(exit.equals("Y") || exit.equals("y"))
			{
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
		
	}else if(menu==3) {	//[3] ���� ����
		
	}
	
	}
	
}
