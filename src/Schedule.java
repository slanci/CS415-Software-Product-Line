import java.util.Date;

public class Schedule{

	private ScheduleStrategy scheduleStrategy;

	public Schedule(ScheduleStrategy scheduleStrategy){
		this.scheduleStrategy = scheduleStrategy;
	}

	private int ID;
	private int workingHours;
	private String[] workingDays;
	private Date meetingTimes;

	public void setScheduleStrategy() {
		// TODO - implement Schedule.setScheduleStrategy
		throw new UnsupportedOperationException();
	}

}