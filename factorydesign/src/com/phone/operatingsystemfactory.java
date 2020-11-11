package com.phone;

public class operatingsystemfactory {
   public OS getInstance(String str)
   {
	    if(str.equals("open"))
		   return new android();
	    else if(str.equals("closed"))
		  return new IOS();
	    else
		   return new windows();
   }
}