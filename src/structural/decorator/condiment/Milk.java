package structural.decorator.condiment;

import structural.decorator.Beverage;

public class Milk extends Condiment {

    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 装饰
        return beverage.getDescription() + ",加牛奶";
    }

    @Override
    public double cost() {
        //装饰
        return beverage.cost() + 5; //加牛奶需要多加5元
    }
}
