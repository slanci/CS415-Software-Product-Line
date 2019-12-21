import java.util.HashMap;

public class HumanResourceSystem {

	public static void main(String[] args){

        //Companies
        Small small = Small(...);
        Medium medium = Medium(...);
        Large large = Large(...);

        //Small company functionalities that it has without extension
        small.archieveApplication(...);
        small.createHRTeam(...);

        //Extensions for small company as it desires
        HashMap<String, Boolean> sFeatureFlagMap = new HashMap<String, Boolean>();
        sFeatureFlagMap.put("scheduleEmployee", true);
        sFeatureFlagMap.put("createHRTeam", true);
        //rest of the functionalities 0 as default

        CompanyPlusDecorator smallExtensioner = new CompanyPlusDecorator(sFeatureFlagMap, large);

        //Use the included new functionalities with decorator
        smallExtensioner.include_scheduleEmployee(...);
        smallExtensioner.include_createHRTeam(...);

        //Medium company functionalities that it has without extension
        medium.createHRTeam(...);
        medium.createCourse(...);

        //Extensions for medium company as it desires
        HashMap<String, Boolean> mFeatureFlagMap = new HashMap<String, Boolean>();
        sFeatureFlagMap.put("organizeEvent", true);
        //rest of the functionalities 0 as default

        CompanyPlusDecorator mediumExtensioner = new CompanyPlusDecorator(mFeatureFlagMap, large);
        //Use the included new functionality with decorator
        mediumExtensioner.include_organizeEvent(...);
        
        //Large company functionalities, it has already every functionality
        large.createJobOpening(...);
        large.createHRTeam(...);

    }
}