public abstract class CompDecorator {

	Company largeCompany;
	HashMap<String, Boolean> featureFlagMap = new HashMap<String, Boolean>();

	public CompDecorator(CHashMap<String, Boolean> featureFlagMap, Company largeCompany){
		this.featureFlagMap = featureFlagMap;
		this.largeCompany = largeCompany;
	}
	
}