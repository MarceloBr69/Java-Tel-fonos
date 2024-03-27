package com.Telefonos;

public class iPhone extends Phone implements Ringable{

	public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	@Override
	public String ring() {
		return "Iphone "+ getVersionNumber()+" dice: "+ getRingTone() + "."; 
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Desbloqueado mediante reconocimiento facial."; 
	}

	@Override
	public void displayInfo() {
		System.out.println("Modelo Iphone " + getVersionNumber() + " con una batería del "+getBatteryPercentage() + " Proveniente de: "+ getCarrier()+"."); 
		
	}

}
