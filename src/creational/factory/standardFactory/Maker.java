package creational.factory.standardFactory;

import creational.factory.material.Food;

/*
 * ������Բ���һ�й���������Ʒ
 */
public class Maker {
	
	public static void main(String[] args) {
		// ��ѡ��һ������Ĺ���
		FoodFactory cFoodFactory = new ChineseFoodFactory();
		FoodFactory aFoodFactory = new AmericanFoodFactory();
		
		// �ɵ�һ���Ĺ�����������Ķ��󣬲�ͬ�Ĺ��������һ���Ķ���
		Food food1 = cFoodFactory.makeFood("A");
		Food food2 = aFoodFactory.makeFood("A");
		
		Class clazz1 = food1.getClass();
		Class clazz2 = food2.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz2.getName());
	}
}
