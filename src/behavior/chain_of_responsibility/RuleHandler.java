package behavior.chain_of_responsibility;

import behavior.chain_of_responsibility.material.Context;

// 规则处理器基类
public abstract class RuleHandler {

    // 后继节点
    protected RuleHandler successor;

    public abstract void apply(Context context);

    public RuleHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }
}
