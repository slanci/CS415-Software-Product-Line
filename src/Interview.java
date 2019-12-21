import java.util.Date;

public class Interview {

	private int ID;
	private int applicationID;
	private Date date;
	private Employee interviewer;
	private String type;

	public Interview(int ID, int applicationID, Date date, Employee interviewer, String type) {
		this.ID = ID;
		this.applicationID = applicationID;
		this.date = date;
		this.interviewer = interviewer;
		this.type = type;
	}
}