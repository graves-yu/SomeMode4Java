/**
 * 
 */
package com.graves.mode.builder;

/**  
 * BuiderPatternDemo 使用 MealBuider 来演示建造者模式（Builder Pattern）。
 * <p>Title: BuilderPatternDemo</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2019年9月17日  
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
