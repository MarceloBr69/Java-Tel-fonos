package com.Telefonos;

import java.io.PrintStream;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void displayInfo() {
		System.out.println("Modelo Galaxy " + getVersionNumber() + " con una batería del "+getBatteryPercentage() + " Proveniente de: "+ getCarrier()+"."); 
		
		
		
	}

	@Override
	public String ring() {
		return "Galaxy " + getVersionNumber() + " dice: " +getRingTone()+ ".";
		  
	}

	@Override
	public String unlock() {
		return "Desbloqueado mediante huella digital.";
	}

}
