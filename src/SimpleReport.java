public class SimpleReport extends Report {

    public SimpleReport(int ID, String name, String content, String type) {
        super(ID, name, content, type);
    }

    /**
     * @param RepID
     */
    public void exportReport(String RepID) {
        System.out.println("exported Simple Report, ID = " + RepID);
    }

}