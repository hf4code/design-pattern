package structural.proxy;

import creational.factory.material.Food;

public class APP {
    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        Food chicken = foodService.makeChicken();
        Food noodle = foodService.makeNoodle();
        System.out.println(chicken);
        System.out.println(noodle);
    }
}
