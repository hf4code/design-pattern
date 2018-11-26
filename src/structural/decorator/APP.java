package structural.decorator;

import structural.decorator.condiment.Lemon;
import structural.decorator.condiment.Mango;
import structural.decorator.condiment.Milk;

public class APP {
    public static void main(String[] args) {
        Beverage beverage = new GreenTea();

        beverage = new Lemon(beverage);
        beverage = new Mango(beverage);

        //芒果柠檬绿茶 (绿茶,加柠檬,加芒果) 价格:￥17.0 (12+2+3)
        System.out.println(beverage.getDescription() + " 价格:$" + beverage.cost());

        //芒果牛奶双份柠檬红茶 (红茶,加柠檬,加柠檬,加牛奶,加芒果) 价格:$22.0 (10+2+2+5+3)
        Beverage beverage1 = new Mango(new Milk(new Lemon(new Lemon(new BlackTea()))));
        System.out.println(beverage1.getDescription() + " 价格:$" + beverage1.cost());
    }
}
