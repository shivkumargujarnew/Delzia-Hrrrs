package com.demo;

import java.io.Serializable;

public final class Demo implements Serializable,Cloneable{

	  static Demo d;
	   
	  private Demo() throws Exception {
		  
		  if(d!=null) {
			  throw new  Exception();
		  }
	  };
	  
	  
	   public static Demo getInsatnace() throws Exception {
		 
		    if(d==null && null==d) {
		   
		   synchronized (Demo.class) {
			
		}
		   if(d==null) {
			   return d=new Demo();
		   }
		   return d;
	   }
			return d;
	   }
	        Object  readResolve(){
	        	 return d;  
	          }
	        @Override
	        protected Object clone() throws CloneNotSupportedException {
	        	// TODO Auto-generated method stub
	        	return d;
	        }
}
