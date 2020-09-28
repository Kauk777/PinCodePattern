package com.bridgelabz.pattern;
import java.util.regex.*;

public class PinCode {
	//Indian pin code do not start with 0
	private static final Pattern PIN_PATTERN=Pattern.compile("^[1-9]{1}[0-9]{5}$");
	
	public boolean validatePin(String pin) {
		return PIN_PATTERN.matcher(pin).matches();
	}
	
	public static void main(String[] args) {
		PinCode pinPattern=new PinCode();
		System.out.println("Validate pin A400088: "+pinPattern.validatePin("A400088"));
	}

}
