package com.aurionpro.test;

import com.aurionpro.model.OperationStrategy;
import com.aurionpro.model.*;
public class StrategyTest {
public static void main(String[] args) {
	OperationStrategy op=new OperationStrategy(new AddOperation());
	op.doOperation(4, 5);
	op.setOperation(new MultiplyOperation());
	op.doOperation(6, 7);
}
}
