package com.phone;

public class OSFactoryManager {

	
	public OS getInstance(String str) {
		
		if(str.equals("OPEN"))
			return new Android();
		else if(str.equals("CLOSED"))
			return new IOS();
		else
			return new Windows();
		
	}
	
}
