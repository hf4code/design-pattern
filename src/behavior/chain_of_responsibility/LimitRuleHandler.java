package behavior.chain_of_responsibility;

import behavior.chain_of_responsibility.material.ActivityService;
import behavior.chain_of_responsibility.material.Context;

// 校验奖品是否已领完
public class LimitRuleHandler extends RuleHandler {

    @Override
    public void apply(Context context) {
        ActivityService activityService = new ActivityService();

        int remainedTimes = activityService.queryRemainedTimes(context);

        if (remainedTimes > 0) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("您来得太晚了,奖品被领完了");
        }
    }
}
