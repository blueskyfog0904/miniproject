package View;

import java.util.Scanner;

import Model.MemberDAO;
import Model.MemberDTO;

public class View {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		int cnt = 0;
		
		while(true) {
			
			System.out.println("[1] �α��� [2] ȸ������ [3] ȸ���������� [4] ����");
			int menu = sc.nextInt();
			
			if(menu==1)
			{
				System.out.print("ID >> ");
				String id = sc.next();
				System.out.print("Password >> ");
				String pw = sc.next();
				MemberDTO dto = new MemberDTO(id, pw);
				dao.login(dto);
				
				
			}
			else if(menu==2)
			{
				System.out.println("==== ȸ������ ====");
				System.out.print("ID�� �Է����ּ��� >> ");
				String id = sc.next();
				System.out.print("Password�� �Է����ּ��� >> ");
				String pw = sc.next();
				System.out.print("�̸��� �Է����ּ��� >> ");
				String name = sc.next();
				System.out.print("�ֹι�ȣ�� �Է����ּ��� >> ");
				String regiNo = sc.next();
				System.out.print("��ȭ��ȣ�� �Է����ּ��� >> ");
				String tel = sc.next();
				
				MemberDTO dto = new MemberDTO(id, pw, name, regiNo, tel);
				cnt = dao.insert(dto);
				if(cnt>0) {
					System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�!");
				}
						
			}
			else if(menu==3) {
				while(true) {
					System.out.print("[1] ȸ���������� [2] ID ã�� [3] ��й�ȣ ã�� [4] ȸ��Ż�� [5] ���� >> ");
					int menu1 = sc.nextInt();
					if(menu1==1) {
						while(true) {
						System.out.print("������ ������ �������ּ��� [1] ��й�ȣ [2] �̸� [3] ��ȭ��ȣ [4] ���� >> ");
						int menu2 = sc.nextInt();
						if(menu2==1) //[1] ��й�ȣ ����
						{
							System.out.print("ID�� �Է����ּ��� >>");
							String id = sc.next();
							System.out.print("�ֹε�Ϲ�ȣ�� �Է����ּ��� >>");
							String regiNo = sc.next();
							System.out.print("�̸��� �Է����ּ��� >>");
							String name = sc.next();
							System.out.print("��ȭ��ȣ�� �Է����ּ��� >>");
							String tel = sc.next();
							MemberDTO dto = new MemberDTO(id, regiNo, name, tel);
							dao.checkforpw(dto);
														
							
							System.out.print("������ Password�� �Է����ּ��� >>");
							String pw = sc.next();
							MemberDTO dto1 = new MemberDTO(id, pw);
							dao.update_pw(dto1);
							
							cnt = dao.update_pw(dto);
							if(cnt>0)
							{
								System.out.println("Password�� ����Ǿ����ϴ�.");
							}else {
								System.out.println("Password ���濡 �����Ͽ����ϴ�. �ٽ� �õ��Ͽ��ֽʽÿ�.");
							}
							
						} 
						else if(menu2==2)  // [2] �̸� ����
						{
							System.out.print("ID�� �Է����ּ��� >> ");
							String id = sc.next();
							System.out.print("Password�� �Է����ּ��� >> ");
							String pw = sc.next();
							MemberDTO dto = new MemberDTO(id, pw);
							dao.check(dto);
							System.out.print("������ �̸��� �Է����ּ��� >>");
							String c_value = sc.next();
							MemberDTO dto1 = new MemberDTO(id, pw, c_value);
							cnt = dao.update_name(dto1);
							if(cnt>0){
								System.out.println("�̸��� ����Ǿ����ϴ�.");
							}else {
								System.out.println("�̸� ���濡 �����Ͽ����ϴ�. �ٽ� �õ��Ͽ��ֽʽÿ�.");
							}
							
														
							
						}
						else if(menu2==3)		// [3] ��ȭ��ȣ ����
						{
							System.out.print("ID�� �Է����ּ��� >> ");
							String id = sc.next();
							System.out.print("Password�� �Է����ּ��� >> ");
							String pw = sc.next();
							MemberDTO dto = new MemberDTO(id, pw);
							dao.check(dto);
							System.out.print("������ ��ȭ��ȣ�� �Է����ּ��� >>");
							String c_value = sc.next();
							MemberDTO dto1 = new MemberDTO(id, pw, c_value);
							cnt = dao.update_tel(dto1);
							if(cnt>0){
								System.out.println("��ȭ��ȣ�� ����Ǿ����ϴ�.");
							}else {
								System.out.println("��ȭ��ȣ ���濡 �����Ͽ����ϴ�. �ٽ� �õ��Ͽ��ֽʽÿ�.");
							}
						}
						else if(menu2==4) 	// [4] ����
						{
							System.out.println("���� �޴��� ���ư��ϴ�.");
							break;
						}else {
							System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						}
						}
						
					}
					else if(menu1==2) {		// ID ã��
						System.out.println("ID�� ã�� ���� �ֹε�Ϲ�ȣ�� �Է����ּ��� >> ");
						String regiNo = sc.next();
						MemberDTO dto = new MemberDTO(regiNo);
						dao.selectID(dto);
						
						
					}
					else if(menu1==3) {		// PW ã��
						System.out.println("Password�� ã�� ���� �ֹε�Ϲ�ȣ�� �Է����ּ��� >> ");
						String regiNo = sc.next();
						MemberDTO dto = new MemberDTO(regiNo);
						dao.selectPW(dto);
						
					}
					else if(menu1==4) {		// ȸ��Ż��
						System.out.print("Ż���� ID�� �Է����ּ��� >> ");
						String id = sc.next();
						System.out.print("Password�� �Է����ּ��� >> ");
						String pw = sc.next();
						MemberDTO dto = new MemberDTO(id, pw);
						cnt = dao.delete(dto);
						if(cnt>=0)
						{
							System.out.println("ȸ���� Ż��Ǿ����ϴ�.");
						}else {
							System.out.println("ȸ��Ż�� ���еǾ����ϴ�. �ٽ� �õ����ֽʽÿ�.");
						}
												
					}
					else if(menu1==5) {	// ����
						System.out.println("���� �޴��� ���ư��ϴ�.");
						break;
					}else {
						System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					}
					
					
				}
				
			}else if(menu==4) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}else {
				System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է��Ͽ��ֽʽÿ�. ");
			}
			
		}
	
		

	}

}
