import java.util.HashMap;

public class CompanyPlusDecorator extends CompDecorator {

    public CompanyPlusDecorator(HashMap<String, Boolean> featureFlagMap, Large largeCompany) {
        super(featureFlagMap, largeCompany);
    }

    /**
     * @param EmpID
     * @param ScheduleID
     */
    public void include_scheduleEmployee(int EmpID, int ScheduleID) {
        if (this.featureFlagMap.get("scheduleEmployee")) {
            this.largeCompany.scheduleEmployee(EmpID, ScheduleID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     * @param teamID
     */
    public void include_createHRTeam(int[][] EmpID, int teamID) {
        if (this.featureFlagMap.get("createHRTeam")) {
            this.largeCompany.createHRTeam(EmpID, teamID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();

    }

    /**
     * @param EmpID
     */
    public void include_trackOverTime(int EmpID) {
        if (this.featureFlagMap.get("trackOverTime")) {
            this.largeCompany.trackOverTime(EmpID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param empID
     */
    public void include_trackPaidTimeOff(int empID) {
        if (this.featureFlagMap.get("trackPaidTimeOff")) {
            this.largeCompany.trackPaidTimeOff(empID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param type
     * @param desc
     * @param budget
     */
    public void include_createCourse(int name, int type, int desc, int budget) {
        if (this.featureFlagMap.get("createCourse")) {
            this.largeCompany.createCourse(name, type, desc, budget);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param TeamID
     * @param budget
     */
    public void include_allocateBudgetForHRTeam(int TeamID, int budget) {
        if (this.featureFlagMap.get("allocateBudgetForHRTeam")) {
            this.largeCompany.allocateBudgetForHRTeam(TeamID, budget);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param empID
     * @param amount
     */
    public void include_makePayment(int empID, int amount) {
        if (this.featureFlagMap.get("makePayment")) {
            this.largeCompany.makePayment(empID, amount);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param Employee
     */
    public void include_arrangeCommuting(int Employee) {
        if (this.featureFlagMap.get("arrangeCommuting")) {
            this.largeCompany.arrangeCommuting(Employee);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void include_viewDisciplinaryStatus(int EmpID) {
        if (this.featureFlagMap.get("viewDisciplinaryStatus")) {
            this.largeCompany.viewDisciplinaryStatus(EmpID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param AppID
     * @param EmpID
     * @param Date
     * @param type
     */
    public void include_scheduleInterview(int AppID, int EmpID, int Date, int type) {
        if (this.featureFlagMap.get("scheduleInterview")) {
            this.largeCompany.scheduleInterview(AppID, EmpID, Date, type);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void include_trackAbsenceWithFingerPrint(int EmpID) {
        if (this.featureFlagMap.get("trackAbsenceWithFingerPrint")) {
            this.largeCompany.trackAbsenceWithFingerPrint(EmpID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void include_monitorWithSoftware(int EmpID) {
        if (this.featureFlagMap.get("monitorWithSoftware")) {
            this.largeCompany.monitorWithSoftware(EmpID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param empId
     * @param Schedule
     * @param Office
     */
    public void include_scheduleWithOffice(int[] empId, int Schedule, int Office) {
        if (this.featureFlagMap.get("scheduleWithOffice")) {
            this.largeCompany.scheduleWithOffice(empId, Schedule, Office);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param name
     * @param location
     * @param budget
     */
    public void include_organizeEvent(int name, int location, int budget) {
        if (this.featureFlagMap.get("organizeEvent")) {
            this.largeCompany.organizeEvent(name, location, budget);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param mentorID
     * @param menteeID
     */
    public void include_arrangeMentorship(int mentorID, int menteeID) {
        if (this.featureFlagMap.get("arrangeMentorship")) {
            this.largeCompany.arrangeMentorship(mentorID, menteeID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     * @param Date
     */
    public void include_createAutoPayment(int EmpID, int Date) {
        if (this.featureFlagMap.get("createAutoPayment")) {
            this.largeCompany.createAutoPayment(EmpID, Date);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpId
     * @param location
     * @param duration
     * @param dept
     * @param team
     */
    public void include_createInternship(int EmpId, int location, int duration, int dept, int team) {
        if (this.featureFlagMap.get("createInternship")) {
            this.largeCompany.createInternship(EmpId, location, duration, dept, team);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void include_trackAbsanceWithFaceDetection(int EmpID) {
        if (this.featureFlagMap.get("trackAbsanceWithFaceDetection")) {
            this.largeCompany.trackAbsanceWithFaceDetection(EmpID);
        }
        System.out.println("This functionality cannot be provided!");
        throw new UnsupportedOperationException();
    }

}