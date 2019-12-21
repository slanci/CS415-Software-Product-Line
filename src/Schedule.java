import java.util.Date;

public class Schedule{

	private ScheduleStrategy scheduleStrategy;

	private int ID;
	private int workingHours;
	private String[] workingDays;
	private Date meetingTimes;

	public Schedule(ScheduleStrategy scheduleStrategy, int ID, int workingHours, String[] workingDays, Date meetingTimes) {
		this.scheduleStrategy = scheduleStrategy;
		this.ID = ID;
		this.workingHours = workingHours;
		this.workingDays = workingDays;
		this.meetingTimes = meetingTimes;
	}

	public void setScheduleStrategy(ScheduleStrategy scheduleStrategy) {
		this.scheduleStrategy = scheduleStrategy;
	}

}