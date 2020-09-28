package com.bridgelabz.pattern;
import java.util.regex.*;

public class PinCode {
	//Indian pin code do not start with 0
	private static final Pattern PIN_PATTERN=Pattern.compile("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$");
	
	public boolean validatePin(String pin) {
		return PIN_PATTERN.matcher(pin).matches();
	}
	
	public static void main(String[] args) {
		PinCode pinPattern=new PinCode();
		System.out.println("Validate pin 400088: "+pinPattern.validatePin("400088"));
		System.out.println("Validate pin A400088: "+pinPattern.validatePin("A400088"));
		System.out.println("Validate pin 400088B: "+pinPattern.validatePin("400088B"));
		System.out.println("Validate pin 400 088: "+pinPattern.validatePin("400 088"));
	}

}
