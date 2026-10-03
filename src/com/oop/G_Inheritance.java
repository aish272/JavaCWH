//Lecture 45
package com.oop;

/**
 * @author aishwarya_mishra
 *
 */

class Base {
	private int baseProperty;


	public int getBaseProperty() {
		return baseProperty;
	}

	public void setBaseProperty(int baseProperty) {
		this.baseProperty = baseProperty;
	}

}

class Derived extends Base {
	private int derivedProperty;
	
	public int getDerivedProperty() {
		return derivedProperty;
	}

	public void setDerivedProperty(int derivedProperty) {
		this.derivedProperty = derivedProperty;
	}
}

public class G_Inheritance {

	public static void main(String[] args) {
		// Base accessing its properties
		Base b = new Base();
		b.setBaseProperty(9);
		System.out.println("Base class method accessed by base class object. The value of the attribute is "
				+ b.getBaseProperty());

		// derived object accessing the properties of base and derived class
		Derived d = new Derived();
		d.setBaseProperty(8);
		d.setDerivedProperty(89);
		System.out.println("Derived class method accessed by derived class object. The value of the attribute is "
				+ d.getDerivedProperty());
		System.out.println("Base class method accessed by derived class object. The value of the attribute is "
				+ d.getBaseProperty());

	}

}
