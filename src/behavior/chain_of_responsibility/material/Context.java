package behavior.chain_of_responsibility.material;

public class Context {

    private boolean isNewUser;
    private String location;
    private int remainedPrizeCount;

    public Context(boolean isNewUser, String location, int remainedPrizeCount) {
        this.isNewUser = isNewUser;
        this.location = location;
        this.remainedPrizeCount = remainedPrizeCount;
    }

    public boolean isNewUser() {
        return isNewUser;
    }

    public void setNewUser(boolean newUser) {
        isNewUser = newUser;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRemainedPrizeCount() {
        return remainedPrizeCount;
    }

    public void setRemainedPrizeCount(int remainedPrizeCount) {
        this.remainedPrizeCount = remainedPrizeCount;
    }
}
