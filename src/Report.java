public abstract class Report {

    private int ID;
    private String name;
    private String content;
    private String type;

    public Report(int ID, String name, String content, String type) {
        this.ID = ID;
        this.name = name;
        this.content = content;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * @param RepID
     */
    public void archiveReport(String RepID) {
        System.out.println("report ID = " + RepID + " archived");
    }

    /**
     * @param RepID
     */
    public void editReport(String RepID) {
        System.out.println("report ID = " + RepID + " edited");
    }

    /**
     * @param RepID
     */
    public void deleteReport(String RepID) {
        System.out.println("report ID = " + RepID + " deleted");
    }

    /**
     * @param RepID
     */
    public abstract void exportReport(String RepID);

    /**
     * @param RepID
     */
    public void shareReport(String RepID) {
        System.out.println("shared report with default template, ID = " + RepID);
    }

    public final void generateReport(String RepID) {
        exportReport(RepID);

        shareReport(RepID);
    }

}