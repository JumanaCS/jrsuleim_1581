public class Email{
	private String subject;
	private String to;
	private String from;
	private String body;

	public Email(String subject, String to, String from, String body){
		this.subject = subject;
		this.to = to;
		this.from = from;
		this.body = body;
	}

	public Email(String subject, String to, String from){
		this.subject = subject;
		this.to = to;
		this.from = from;
		this.body = "";
	}

	public void setBody(String body){
		this.body = body;
	}

	public void addToBody(String text){
		this.body += text;
	}

	public boolean equals(Email other){
		if(subject.equals(other.getSubject()) && to.equals(other.getTo()) && from.equals(other.getFrom()) && body.equals(other.getBody())){
			return true;
		}
		else 
			return false;
	}

	public String getSubject(){
		return this.subject;
	}

	public String getTo(){
		return this.to;
	}

	public String getFrom(){
		return this.from;
	}

	public String getBody(){
		return this.body;
	}

	public String toString(){
		return String.format("From: %s; To: %s; Subject: %s; Body: %s", from, to, subject, body); 
	}
}