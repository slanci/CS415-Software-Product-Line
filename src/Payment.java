import java.util.Date;

public class Payment {

	private int transactionNo;
	private Date date;
	private String receiver;
	private String authorizedBy;
	private float amount;
	private String subject;

	public Payment(int transactionNo, Date date, String receiver, String authorizedBy, float amount, String subject) {
		this.transactionNo = transactionNo;
		this.date = date;
		this.receiver = receiver;
		this.authorizedBy = authorizedBy;
		this.amount = amount;
		this.subject = subject;
	}
}