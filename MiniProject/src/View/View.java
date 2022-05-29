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
			
			System.out.println("[1] 로그인 [2] 회원가입 [3] 회원정보관리 [4] 종료");
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
				System.out.println("==== 회원가입 ====");
				System.out.print("ID를 입력해주세요 >> ");
				String id = sc.next();
				System.out.print("Password를 입력해주세요 >> ");
				String pw = sc.next();
				System.out.print("이름을 입력해주세요 >> ");
				String name = sc.next();
				System.out.print("주민번호를 입력해주세요 >> ");
				String regiNo = sc.next();
				System.out.print("전화번호를 입력해주세요 >> ");
				String tel = sc.next();
				
				MemberDTO dto = new MemberDTO(id, pw, name, regiNo, tel);
				cnt = dao.insert(dto);
				if(cnt>0) {
					System.out.println("회원가입에 성공하셨습니다!");
				}
						
			}
			else if(menu==3) {
				while(true) {
					System.out.print("[1] 회원정보수정 [2] ID 찾기 [3] 비밀번호 찾기 [4] 회원탈퇴 [5] 이전 >> ");
					int menu1 = sc.nextInt();
					if(menu1==1) {
						while(true) {
						System.out.print("수정할 정보를 선택해주세요 [1] 비밀번호 [2] 이름 [3] 전화번호 [4] 이전 >> ");
						int menu2 = sc.nextInt();
						if(menu2==1) //[1] 비밀번호 수정
						{
							System.out.print("ID를 입력해주세요 >>");
							String id = sc.next();
							System.out.print("주민등록번호를 입력해주세요 >>");
							String regiNo = sc.next();
							System.out.print("이름을 입력해주세요 >>");
							String name = sc.next();
							System.out.print("전화번호를 입력해주세요 >>");
							String tel = sc.next();
							MemberDTO dto = new MemberDTO(id, regiNo, name, tel);
							dao.checkforpw(dto);
														
							
							System.out.print("변결할 Password를 입력해주세요 >>");
							String pw = sc.next();
							MemberDTO dto1 = new MemberDTO(id, pw);
							dao.update_pw(dto1);
							
							cnt = dao.update_pw(dto);
							if(cnt>0)
							{
								System.out.println("Password가 변경되었습니다.");
							}else {
								System.out.println("Password 변경에 실패하였습니다. 다시 시도하여주십시오.");
							}
							
						} 
						else if(menu2==2)  // [2] 이름 수정
						{
							System.out.print("ID를 입력해주세요 >> ");
							String id = sc.next();
							System.out.print("Password를 입력해주세요 >> ");
							String pw = sc.next();
							MemberDTO dto = new MemberDTO(id, pw);
							dao.check(dto);
							System.out.print("변결할 이름을 입력해주세요 >>");
							String c_value = sc.next();
							MemberDTO dto1 = new MemberDTO(id, pw, c_value);
							cnt = dao.update_name(dto1);
							if(cnt>0){
								System.out.println("이름이 변경되었습니다.");
							}else {
								System.out.println("이름 변경에 실패하였습니다. 다시 시도하여주십시오.");
							}
							
														
							
						}
						else if(menu2==3)		// [3] 전화번호 수정
						{
							System.out.print("ID를 입력해주세요 >> ");
							String id = sc.next();
							System.out.print("Password를 입력해주세요 >> ");
							String pw = sc.next();
							MemberDTO dto = new MemberDTO(id, pw);
							dao.check(dto);
							System.out.print("변결할 전화번호를 입력해주세요 >>");
							String c_value = sc.next();
							MemberDTO dto1 = new MemberDTO(id, pw, c_value);
							cnt = dao.update_tel(dto1);
							if(cnt>0){
								System.out.println("전화번호가 변경되었습니다.");
							}else {
								System.out.println("전화번호 변경에 실패하였습니다. 다시 시도하여주십시오.");
							}
						}
						else if(menu2==4) 	// [4] 이전
						{
							System.out.println("이전 메뉴로 돌아갑니다.");
							break;
						}else {
							System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
						}
						}
						
					}
					else if(menu1==2) {		// ID 찾기
						System.out.println("ID를 찾기 위해 주민등록번호를 입력해주세요 >> ");
						String regiNo = sc.next();
						MemberDTO dto = new MemberDTO(regiNo);
						dao.selectID(dto);
						
						
					}
					else if(menu1==3) {		// PW 찾기
						System.out.println("Password를 찾기 위해 주민등록번호를 입력해주세요 >> ");
						String regiNo = sc.next();
						MemberDTO dto = new MemberDTO(regiNo);
						dao.selectPW(dto);
						
					}
					else if(menu1==4) {		// 회원탈퇴
						System.out.print("탈퇴할 ID를 입력해주세요 >> ");
						String id = sc.next();
						System.out.print("Password를 입력해주세요 >> ");
						String pw = sc.next();
						MemberDTO dto = new MemberDTO(id, pw);
						cnt = dao.delete(dto);
						if(cnt>=0)
						{
							System.out.println("회원이 탈퇴되었습니다.");
						}else {
							System.out.println("회원탈퇴가 실패되었습니다. 다시 시도해주십시오.");
						}
												
					}
					else if(menu1==5) {	// 이전
						System.out.println("이전 메뉴로 돌아갑니다.");
						break;
					}else {
						System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
					}
					
					
				}
				
			}else if(menu==4) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력하여주십시오. ");
			}
			
		}
	
		

	}

}
