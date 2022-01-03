
package com.electronics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain{

	public static void main(String args[]) {
		List<Car> intList=new ArrayList<Car>();
		Car c=new Car(2,"yamaha","petrol");
	    Car c1=new Car(1,"honda","diesel");
	    Car c2=new Car(3,"suzuki","diesel");
	    intList.add(c);
	    intList.add(c1);
	    intList.add(c2);
	    Collections.sort(intList);
	System.out.println("car List1:\n"+intList);
	

Collections.reverse(intList);
System.out.println(intList);
	}
}
