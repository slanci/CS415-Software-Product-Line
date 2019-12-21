public class JobOpening {

    private int id;
    private Application[] applications;


    public JobOpening(int id, Application[] applications) {
        this.id = id;
        this.applications = applications;
    }

    public int getId() {
        return id;
    }

    public Application[] getApplications() {
        return applications;
    }
}