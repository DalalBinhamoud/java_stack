package claculator;

import java.io.Serializable;

public class Calculator implements Serializable {
	
	double oprand1;
	double oprand2;
	String operation;
	double result;
	
	
public void setOperandOne(double oprand1) {
	this.oprand1 = oprand1;
	
}
public void setOperation(String operation) {
	this.operation = operation;
}

public void setOperandTwo(double oprand2) {
	this.oprand2 = oprand2;
}

public void performOperation() {
	
	  if (this.operation.equals("+")) {
		  this.result = oprand1 + oprand2;
		    } else if (this.operation.equals("-")){
		    	this.result = oprand1 - oprand2;
		    } else if (this.operation.equals("*")){
		    	this.result = oprand1 * oprand2;
		    } else if (this.operation.equals("/")){
		    	this.result = oprand1 / oprand2;
}
	
}
public double getResults() {
	  return this.result;
}
}