package com.xworkz.array;

import com.xworkz.array.*;
import array.MobileKalla;

public class KallaStarter {

	public static void main(String[] args) {

		Kalla kalla = new Kalla("wert", 50, 30, 20, "btm");

		// mobKalla.displayDetails();
		int no = kalla.getTotalNoOfCases();
		kalla.getAge();
		kalla.getArea();
		kalla.getExperience();
		System.out.println(no);
		MobileKalla mobileKalla = new MobileKalla("sdfg", 60, 30, 60, "btm", "mobile kalla");
		String sep = mobileKalla.getSpecification();
		System.out.println(sep);
		System.out.println(mobileKalla.getExperience());

		System.out.println(mobileKalla.getAge());
	}

}
