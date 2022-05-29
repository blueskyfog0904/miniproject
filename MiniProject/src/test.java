import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrlist1 = new ArrayList<String>();
		ArrayList<String> arrlist2 = new ArrayList<String>();
		
		System.out.println("난이도 입력");
		String level = sc.next();
		
		sc.nextLine();
		
		System.out.println("문제입력");
		String inputQ = sc.nextLine();
		
	
		
		System.out.println("답입력");
		String inputA = sc.nextLine();
		
		System.out.println(level);
		System.out.println(inputQ);
		System.out.println(inputA);
		
		arrlist1.add(inputQ);
		arrlist2.add(inputA);
		
		System.out.println(arrlist1.get(0));
		System.out.println(arrlist2.get(0));
		
		
		
		
		

	}

}
