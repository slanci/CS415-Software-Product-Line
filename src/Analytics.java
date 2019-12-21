public class Analytics {

    private int[] employeeData;
    private int[] paymentData;
    private int[] monitoringData;
    private int[] attandanceData;
    private int[] jobOpeningData;
    private Report[] reports;

    public Analytics(int[] employeeData, int[] paymentData, int[] monitoringData, int[] attandanceData, int[] jobOpeningData, Report[] reports) {
        this.employeeData = employeeData;
        this.paymentData = paymentData;
        this.monitoringData = monitoringData;
        this.attandanceData = attandanceData;
        this.jobOpeningData = jobOpeningData;
        this.reports = reports;
    }

    /**
     * @param EmpID
     */
    public void generateEmployeeData(String EmpID) {
        // TODO - implement Analytics.generateEmployeeData
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void generatePaymentData(String EmpID) {
        // TODO - implement Analytics.generatePaymentData
        throw new UnsupportedOperationException();
    }

    /**
     * @param EmpID
     */
    public void generateAttandenceData(String EmpID) {
        // TODO - implement Analytics.generateAttandenceData
        throw new UnsupportedOperationException();
    }

    /**
     * @param JobOpeningID
     */
    public void JobOpeningData(String JobOpeningID) {
        // TODO - implement Analytics.JobOpeningData
        throw new UnsupportedOperationException();
    }

    public void generateReports() {
        for (Report r : this.reports) {
            r.generateReport(r.getType());
        }
    }

}