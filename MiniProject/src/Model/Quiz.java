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

	
	
	System.out.println("==== 문제 메뉴 ====");
	System.out.print("[1] 문제 입력 [2] 출제 문제, 답 확인 [3] 문제 삭제 >> ");
	int menu = sc.nextInt();
	if(menu==1) {
	
	while(true) {

	System.out.println("난이도를 입력하세요 (상,중,하)");
	String level = sc.next();
	
	sc.nextLine();
	
	
	System.out.println("문제를 입력하세요");
	String inputQ = sc.nextLine();
	
		
	System.out.println("답을 입력하세요");
	String inputA = sc.nextLine();
	

	
	
	if(level.equals("상")) {
		questionH.add(inputQ);
		answerH.add(inputA);
		
		
	}
	else if(level.equals("중")) {
		questionM.add(inputQ);
		answerM.add(inputA);
		
	}
	else if(level.equals("하")) {
		questionL.add(inputQ);
		answerL.add(inputA);
	}
	System.out.println("추가 문제 입력하시겠습니까?? [ Y / N ]");
		
	String addQuestion = sc.next();
	if(addQuestion.equals("N"))
	{
		System.out.println("문제입력이 종료되었습니다.");
		break;
	}
	
	
	}
	}
	else if(menu==2) { // [2] 출제문제, 답 확인
		while(true) {
		System.out.print("문제 난이도를 입력하세요 (상,중,하) >> ");
		String level = sc.next();
		if(level.equals("상")) {
			for(int i = 0; i < questionH.size(); i++)
			{
				System.out.println(questionH.get(i));
				System.out.println(answerH.get(i));
				
			}
			
			
		}
		else if(level.equals("중")) {
			for(int i = 0; i < questionM.size(); i++)
			{
				System.out.println(questionM.get(i));
				System.out.println(answerM.get(i));
				
			}
			
			
		}
		else if(level.equals("하")) {
			for(int i = 0; i < questionH.size(); i++)
			{
				System.out.println(questionL.get(i));
				System.out.println(answerL.get(i));
				
			}
			
		}
		System.out.println("종료하시겠습니까 [ Y / N ]");
			String exit = sc.next();
			if(exit.equals("Y") || exit.equals("y"))
			{
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}else if(menu==3) {	//[3] 문제 삭제
		
	}
	
	}
	
}
