package creational.factory.simpleFactory;

import creational.factory.material.Food;
import creational.factory.material.HuangmenChicken;
import creational.factory.material.LanzhouNoodle;

/*
 * �򵥹���ģʽ-֮-ʳƷ�ӹ���
 */
public class FoodFactory {
	
	public static Food makeFood(String name){
		
		if (name.equals("noodle")) {
			Food noodle = new LanzhouNoodle();
			noodle.addSpicy("pepper");
			return noodle;
		} else if (name.equals("chicken")) {
			Food chicken = new HuangmenChicken();
			chicken.addCondiment("pomato");
			return chicken;
		} else {
			return null;
		}
	}
}
