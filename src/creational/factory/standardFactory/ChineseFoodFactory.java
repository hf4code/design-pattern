package creational.factory.standardFactory;

import creational.factory.material.ChineseFoodA;
import creational.factory.material.ChineseFoodB;
import creational.factory.material.Food;

/*
 * ��ʽʳ��ӹ���
 */
public class ChineseFoodFactory implements FoodFactory{

	@Override
	public Food makeFood(String name) {
		
		if (name.equals("A")) {
			return new ChineseFoodA();
		} else if (name.equals("B")) {
			return new ChineseFoodB();
		} else {
			return null;
		}
	}
}
