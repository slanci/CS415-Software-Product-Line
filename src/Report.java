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

	/**
	 * 
	 * @param RepID
	 */
	public void archiveReport(String RepID) {
		// TODO - implement Report.archiveReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RepID
	 */
	public void editReport(String RepID) {
		// TODO - implement Report.editReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RepID
	 */
	public void deleteReport(String RepID) {
		// TODO - implement Report.deleteReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RepID
	 */
	public abstract void exportReport(String RepID);

	/**
	 * 
	 * @param RepID
	 */
	public void shareReport(String RepID) {
		System.out.println("shared report with default template, ID = " + RepID);
	}

	public final void ReportTemplate(String RepID) {
		exportReport(RepID);

		shareReport(RepID);
	}

}