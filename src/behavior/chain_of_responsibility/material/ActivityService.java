package behavior.chain_of_responsibility.material;

public class ActivityService {

    private static final String activityLocation = "北京";

    public boolean isSupportedLocation(String location) {
        return activityLocation.equals(location);
    }

    public int queryRemainedTimes(Context context) {
        return context.getRemainedPrizeCount();

    }
}
