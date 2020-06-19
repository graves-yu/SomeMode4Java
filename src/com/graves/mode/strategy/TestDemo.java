/**
 * 
 */
package com.graves.mode.strategy;

/**  
 * <p>Title: TestDemo</p>  
 * <p>Description: </p>  
 * @author Graves  
 * @date 2020年6月19日  
 */
public class TestDemo {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		Context context = new Context(new OperationAdd());
		context.executeOperation(num1, num2);
		
		System.out.println(new Context(new OperationAdd()).executeOperation(num1, num2));
		System.out.println(new Context(new OperationSubtract()).executeOperation(num1, num2));
		System.out.println(new Context(new OperationMultiply()).executeOperation(num1, num2));
		System.out.println(new Context(new OperationDivision()).executeOperation(num1, num2));
	}
}
