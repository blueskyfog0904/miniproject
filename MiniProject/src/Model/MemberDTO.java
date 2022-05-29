package Model;

public class MemberDTO {
	
	private String id;	// id
	private String pw;	// pw
	private String name;	// ����
	private String regiNo; 	// �ֹι�ȣ
	private String tel;	// ��ȭ��ȣ
	private String c_value; // ������ ��
	
	// ȸ�����Խ�
	public MemberDTO(String id, String pw, String name, String regiNo, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.regiNo = regiNo;
		this.tel = tel;
	}
	
	
	// ȸ������ ������
	public MemberDTO(String id, String pw, String c_value) {
		super();
		this.id = id;
		this.pw = pw;
		this.c_value = c_value;
	}
	// ��й�ȣ �Ҿ������ ���
	public MemberDTO(String id, String name, String regiNo, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.regiNo = regiNo;
		this.tel = tel;
	}
	
	
	// �����ų ��
	public MemberDTO(String c_value) {
		super();
		this.c_value = c_value;
	}


	// �α��ν�
	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	



	


	public String getC_value() {
		return c_value;
	}

	public void setC_value(String c_value) {
		this.c_value = c_value;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegiNo() {
		return regiNo;
	}
	public void setRegiNo(String regiNo) {
		this.regiNo = regiNo;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}




	
	

}
