import java.sql.Time;

public class Commute {

	private int ID;
	private String route;
	private Time time;

	public Commute(int ID, String route, Time time) {
		this.ID = ID;
		this.route = route;
		this.time = time;
	}
}