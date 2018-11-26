package creational.factory.standardFactory;

import creational.factory.material.Food;

/*
 * ����ģʽ-֮-ʳƷ�ӹ���
 */
public interface FoodFactory {
	
	Food makeFood(String name);
}
