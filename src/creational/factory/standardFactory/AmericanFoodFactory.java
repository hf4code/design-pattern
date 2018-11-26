package creational.factory.standardFactory;

import creational.factory.material.AmericanFoodA;
import creational.factory.material.AmericanFoodB;
import creational.factory.material.Food;

/*
 * ��ʽʳ��ӹ���
 */
public class AmericanFoodFactory implements FoodFactory{

	@Override
	public Food makeFood(String name) {
		
		if (name.equals("A")) {
			return new AmericanFoodA();
		} else if (name.equals("B")) {
			return new AmericanFoodB();
		} else {
			return null;
		}
	}
}
