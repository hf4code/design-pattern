package behavior.chain_of_responsibility;

import behavior.chain_of_responsibility.material.ActivityService;
import behavior.chain_of_responsibility.material.Context;

// 校验用户是否是新用户
public class LocationRuleHandler extends RuleHandler {

    @Override
    public void apply(Context context) {
        ActivityService activityService = new ActivityService();

        boolean allowed = activityService.isSupportedLocation(context.getLocation());

        if (allowed) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("非常抱歉,您所在的地区无法参与本次活动");
        }
    }
}
