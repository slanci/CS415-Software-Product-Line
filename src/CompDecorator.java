import java.util.HashMap;

public abstract class CompDecorator {

    Large largeCompany;
    HashMap<String, Boolean> featureFlagMap;


    public CompDecorator(HashMap<String, Boolean> featureFlagMap, Large largeCompany) {
        this.featureFlagMap = featureFlagMap;
        this.largeCompany = largeCompany;
    }

}