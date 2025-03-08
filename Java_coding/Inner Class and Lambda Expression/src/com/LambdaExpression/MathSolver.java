package com.LambdaExpression;

public interface MathSolver {
	//Only one Abstract method
	public void  cube(int num);
	//default method
	default int square(int num){
		return num*num;
	}

}
