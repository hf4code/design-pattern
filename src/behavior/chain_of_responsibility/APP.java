package behavior.chain_of_responsibility;

import behavior.chain_of_responsibility.material.Context;

public class APP {
    public static void main(String[] args) {
        Context context = new Context(true, "北京", 0);

        RuleHandler newUserRuleHandler = new NewUserRuleHandler();
        RuleHandler locationRuleHandler = new LocationRuleHandler();
        RuleHandler limitRuleHandler = new LimitRuleHandler();

        //假设本次活动仅校验地区和奖品数量，不校验新老用户
        locationRuleHandler.setSuccessor(limitRuleHandler);
        locationRuleHandler.apply(context);
    }
}
