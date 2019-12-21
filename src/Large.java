import MonitorNetwork.MonitorNetwork;
import MonitorSoftware.*;

public class Large extends Medium {

	private Office[] offices;
	private Schedule[] scheduleOffices;
	private Event[] events;
	private Employee[] mentorship;
	private MonitorSoftware monitor;
	private Payment[] automatedPayments;
	private Intern[] interships;

	public Large(Employee[] employee, JobOpening[] jobOpenings, Analytics analyticsEngine, Schedule[] schedules, Course[] courses, MonitorNetwork monitor, Commute[] commutes, String[] discipinaryStatus, Interview[] interview, Office[] offices, Schedule[] scheduleOffices, Event[] events, Employee[] mentorship, MonitorSoftware monitor1, Payment[] automatedPayments, Intern[] interships) {
		super(employee, jobOpenings, analyticsEngine, schedules, courses, monitor, commutes, discipinaryStatus, interview);
		this.offices = offices;
		this.scheduleOffices = scheduleOffices;
		this.events = events;
		this.mentorship = mentorship;
		this.monitor = monitor1;
		this.automatedPayments = automatedPayments;
		this.interships = interships;
	}

	/**
	 * 
	 * @param empId
	 * @param Schedule
	 * @param Office
	 */
	public void scheduleWithOffice(int[] empId, int Schedule, int Office) {
		// TODO - implement Large.ScheduleWithOffice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param location
	 * @param budget
	 */
	public void organizeEvent(int name, int location, int budget) {
		// TODO - implement Large.organizeEvent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mentorID
	 * @param menteeID
	 */
	public void arrangeMentorship(int mentorID, int menteeID) {
		// TODO - implement Large.arrangeMentorship
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param EmpID
	 */
	public void monitorWithSoftware(int EmpID) {
		// TODO - implement Large.monitorWithSoftware
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param EmpID
	 * @param Date
	 */
	public void createAutoPayment(int EmpID, int Date) {
		// TODO - implement Large.createAutoPayment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param EmpId
	 * @param location
	 * @param duration
	 * @param dept
	 * @param team
	 */
	public void createInternship(int EmpId, int location, int duration, int dept, int team) {
		// TODO - implement Large.createInternship
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param EmpID
	 */
	public void trackAbsanceWithFaceDetection(int EmpID) {
		// TODO - implement Large.trackAbsanceWithFaceDetection
		throw new UnsupportedOperationException();
	}

}