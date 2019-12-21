import MonitorNetwork.*;

public class Medium extends Small {

    private Schedule[] schedules;
    private Course[] courses;
    //TODO
    private MonitorNetwork monitor;
    private Commute[] commutes;
    private String[] discipinaryStatus;
    private Interview[] interview;

    public Medium(Employee[] employee, JobOpening[] jobOpenings, Analytics analyticsEngine, Schedule[] schedules, Course[] courses, MonitorNetwork monitor, Commute[] commutes, String[] discipinaryStatus, Interview[] interview) {
        super(employee, jobOpenings, analyticsEngine);
        this.schedules = schedules;
        this.courses = courses;
        this.monitor = monitor;
        this.commutes = commutes;
        this.discipinaryStatus = discipinaryStatus;
        this.interview = interview;
    }

    /**
     * @param EmpID
     * @param ScheduleID
     */
    public void scheduleEmployee(int EmpID, int ScheduleID) {
        for(Schedule schedule : schedules){
            if(schedule.getEmpID() == EmpID){
                schedule.getScheduleStrategy().createSchedule();
            }
        }
    }

    /**
     * @param EmpID
     * @param teamID
     */
    public void createHRTeam(int[][] EmpID, int teamID) {
        // TODO - implement Medium.createHRTeam
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void trackOverTime(int EmpID) {
        // TODO - implement Medium.trackOverTime
        throw new UnsupportedOperationException();
    }

    /**
     * @param empID
     */
    public void trackPaidTimeOff(int empID) {
        // TODO - implement Medium.trackPaidTimeOff
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param type
     * @param desc
     * @param budget
     */
    public void createCourse(int name, int type, int desc, int budget) {
        // TODO - implement Medium.createCourse
        throw new UnsupportedOperationException();
    }

    /**
     * @param TeamID
     * @param budget
     */
    public void allocateBudgetForHRTeam(int TeamID, int budget) {
        // TODO - implement Medium.allocateBudgetForHRTeam
        throw new UnsupportedOperationException();
    }

    /**
     * @param empID
     * @param amount
     */
    public void makePayment(int empID, int amount) {
        // TODO - implement Medium.makePayment
        throw new UnsupportedOperationException();
    }

    /**
     * @param Employee
     */
    public void arrangeCommuting(int Employee) {
        // TODO - implement Medium.arrangeCommuting
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void viewDisciplinaryStatus(int EmpID) {
        // TODO - implement Medium.viewDisciplinaryStatus
        throw new UnsupportedOperationException();
    }

    /**
     * @param AppID
     * @param EmpID
     * @param Date
     * @param type
     */
    public void scheduleInterview(int AppID, int EmpID, int Date, int type) {
        for(Schedule schedule : schedules){
            if(schedule.getEmpID() == EmpID){
                schedule.getScheduleStrategy().createSchedule();
            }
        }
    }

    /**
     * @param EmpID
     */
    public void trackAbsenceWithFingerPrint(int EmpID) {
        // TODO - implement Medium.trackAbsenceWithFingerPrint
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void monitorWithSoftware(int EmpID) {
        // TODO - implement Medium.monitorWithSoftware
        throw new UnsupportedOperationException();
    }

}