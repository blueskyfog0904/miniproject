package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	// 1. 동적 연결
	// 2. DB 연결
	// 3. SQL문
	// 4. 종료
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	int cnt = 0;
	
public void selectPW(MemberDTO dto) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			String sql = "select pw from member where regiNo = ?";
		
			String regiNo = dto.getC_value();

							
			psmt  = conn.prepareStatement(sql);
			
			psmt.setString(1, regiNo);
					
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String result = rs.getString(1);
				System.out.println("회원님의 Password는 "+result+" 입니다.");
				
			}
			
			
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if(rs != null) {
					rs.close();
				}
				
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public void selectID(MemberDTO dto) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			String sql = "select id from member where regiNo = ?";
		
			String regiNo = dto.getC_value();

							
			psmt  = conn.prepareStatement(sql);
			
			psmt.setString(1, regiNo);
					
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String result = rs.getString(1);
				System.out.println("회원님의 ID는 "+result+" 입니다.");
				
			}
			
			
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if(rs != null) {
					rs.close();
				}
				
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
public void checkforpw(MemberDTO dto) {
		
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 성공");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		conn = DriverManager.getConnection(url, db_id, db_pw);
		if(conn !=null) {
			System.out.println("DB 연결 성공");
		}
		
		String sql = "select regiNo from member where id = ?";
	
		String regiNo = dto.getRegiNo();
						
		psmt  = conn.prepareStatement(sql);
		
		psmt.setString(1, regiNo);
				
		rs = psmt.executeQuery();
		
		if(rs.next()) {
			String result = rs.getString(1);
			if(dto.getId().equals(result)) {
				System.out.println("주민등록번호 확인 성공");
			}else {
				System.out.println("주민등록번호가 맞지 않습니다. 다시 확인해주세요");
			}
			
		}
		sql = "select name from member where id = ?";
		
		String name = dto.getName();
						
		psmt  = conn.prepareStatement(sql);
		
		psmt.setString(1, name);
				
		rs = psmt.executeQuery();
		
		if(rs.next()) {
			String result = rs.getString(1);
			if(dto.getName().equals(result)) {
				System.out.println("이름 확인 성공");
			}else {
				System.out.println("이름이 맞지 않습니다.. 다시 확인해주세요");
			}
			
		}
		
					
		
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패");
	} catch (SQLException e) {
		System.out.println("DB 연결 실패");
	} finally {
		
		try {
			if(rs != null) {
				rs.close();
			}
			
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	}
	
	
public void check(MemberDTO dto) {
		
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 성공");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		conn = DriverManager.getConnection(url, db_id, db_pw);
		if(conn !=null) {
			System.out.println("DB 연결 성공");
		}
		
		String sql = "select pw from member where id = ?";
	
		String id = dto.getId();
						
		psmt  = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
				
		rs = psmt.executeQuery();
		
		if(rs.next()) {
			String result = rs.getString(1);
			if(dto.getPw().equals(result)) {
				System.out.println("ID, PW 확인 성공");
			}else {
				System.out.println("ID, PW 맞지 않습니다. 다시 확인해주세요");
			}
			
		}
					
		
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패");
	} catch (SQLException e) {
		System.out.println("DB 연결 실패");
	} finally {
		
		try {
			if(rs != null) {
				rs.close();
			}
			
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	}
	
	
	
	public void login(MemberDTO dto) {
		
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 로딩 성공");
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";
		
		conn = DriverManager.getConnection(url, db_id, db_pw);
		if(conn !=null) {
			System.out.println("DB 연결 성공");
		}
		
		String sql = "select pw from member where id = ?";
	
		String id = dto.getId();
						
		psmt  = conn.prepareStatement(sql);
		
		psmt.setString(1, id);
				
		rs = psmt.executeQuery();
		
		if(rs.next()) {
			String result = rs.getString(1);
			if(dto.getPw().equals(result)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패");
			}
			
		}
					
		
	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패");
	} catch (SQLException e) {
		System.out.println("DB 연결 실패");
	} finally {
		
		try {
			if(rs != null) {
				rs.close();
			}
			
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
	}
	
	public int delete(MemberDTO dto) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			String sql = "delete from member where id = ?";
			
			String id = dto.getId();
			
					
			psmt  = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			
			
			cnt = psmt.executeUpdate();
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cnt;
		
	}
	
	public int update_pw(MemberDTO dto) { // pw 변경
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			
			String sql = "update member set pw =? where id = ?";
			
			String pw = dto.getPw();
			String id = dto.getId();
			
			psmt  = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cnt;
		
		
	}public int update_tel(MemberDTO dto) { // 전화번호 변경
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			
			String sql = "update member set tel =? where id = ?";
			
			String c_value = dto.getC_value();

			String id = dto.getId();
			
			psmt  = conn.prepareStatement(sql);
			psmt.setString(1, c_value);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cnt;
		
		
	}
	
public int update_name(MemberDTO dto) { // 이름 변경
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			
			String sql = "update member set name =? where id = ?";
			
			String c_value = dto.getC_value();

			String id = dto.getId();
			
			psmt  = conn.prepareStatement(sql);
			psmt.setString(1, c_value);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cnt;
		
		
	}
	
	
	public int insert(MemberDTO dto) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if(conn !=null) {
				System.out.println("DB 연결 성공");
			}
			
			String sql = "insert into member values(?, ?, ?, ?, ?)";
			
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			String regiNo = dto.getRegiNo();
			String tel = dto.getTel();
					
			psmt  = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, regiNo);
			psmt.setString(5, tel);
			
			cnt = psmt.executeUpdate();
						
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		} finally {
			
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return cnt;
	}
	
	
}
