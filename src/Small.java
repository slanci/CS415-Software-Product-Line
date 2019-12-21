public class Small extends Company {

    private Employee[] employee;
    private JobOpening[] jobOpenings;
    private Analytics analyticsEngine;

    public Small(Employee[] employee, JobOpening[] jobOpenings, Analytics analyticsEngine) {
        this.employee = employee;
        this.jobOpenings = jobOpenings;
        this.analyticsEngine = analyticsEngine;
    }

    /**
     * @param pos
     * @param dept
     * @param description
     */
    public void createJobOpening(String pos, Department dept, String description) {
        // TODO - implement Small.createJobOpening
        throw new UnsupportedOperationException();
    }

    /**
     * @param id
     */
    public void deleteJobOpening(int id) {
        // TODO - implement Small.deleteJobOpening
        throw new UnsupportedOperationException();
    }

    /**
     * @param ID
     */
    public void editApplication(int ID) {
        // TODO - implement Small.editApplication
        throw new UnsupportedOperationException();
    }

    /**
     * @param ID
     */
    public void deleteApplication(int ID) {
        // TODO - implement Small.deleteApplication
        throw new UnsupportedOperationException();
    }

    /**
     * @param ID
     */
    public void archieveApplication(int ID) {
        // TODO - implement Small.archieveApplication
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void trackAbsenceWithIdCard(int EmpID) {
        // TODO - implement Small.trackAbsenceWithIdCard
        throw new UnsupportedOperationException();
    }

    /**
     * @param ApplicantID
     * @param position
     * @param team
     */
    public void employApplicant(int ApplicantID, String position, HRTeam team) {
        // TODO - implement Small.employApplicant
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void viewSalaryHistory(int EmpID) {
        // TODO - implement Small.viewSalaryHistory
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void viewJobHistory(int EmpID) {
        // TODO - implement Small.viewJobHistory
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     * @param teamID
     */
    public void createHRTeam(int[][] EmpID, int teamID) {
        // TODO - implement Small.createHRTeam
        throw new UnsupportedOperationException();
    }

    /**
     * @param type
     * @param content
     * @param employee
     */
    public void generateEmpReport(String type, Analytics content, Employee employee) {
        content.JobOpeningData(Integer.toString(employee.getId()));
        content.generateReports();
    }

    /**
     * @param type
     * @param content
     * @param jobOpening
     */
    public void generateAppReport(String type, Analytics content, JobOpening jobOpening) {
        content.JobOpeningData(Integer.toString(jobOpening.getId()));
        content.generateReports();
    }

}