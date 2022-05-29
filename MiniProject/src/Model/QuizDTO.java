package Model;

public class QuizDTO {
	
	private String question;
	private String answer;
	private String level;
	
	public QuizDTO(String question, String answer, String level) {
		super();
		this.question = question;
		this.answer = answer;
		this.level = level;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
	
	

}
