public class AdvancedReport extends Report {


	public AdvancedReport(int ID, String name, String content, String type) {
		super(ID, name, content, type);
	}

	/**
	 * 
	 * @param RepID
	 */
	public void shareReport(String RepID) {
		System.out.println("shared report with advanced template, ID = " + RepID);
	}

	/**
	 * 
	 * @param RepID
	 */
	public void exportReport(String RepID) {
		System.out.println("exported Advanced Report, ID = " + RepID);
	}

}