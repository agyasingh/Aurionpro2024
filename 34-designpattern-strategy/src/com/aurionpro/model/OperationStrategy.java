package com.aurionpro.model;

public class OperationStrategy {
	
	IOperation operation;

	public OperationStrategy(IOperation operation) {
		super();
		this.operation = operation;
	}

	public IOperation getOperation() {
		return operation;
	}

	
	
	public void doOperation(int a,int b) {
		operation.doOperation(a, b);
	}
	
	public void setOperation(IOperation operation){
		
		this.operation=operation;
	}

}
