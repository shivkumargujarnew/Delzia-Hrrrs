package com.demo;

public class multithredingBreakSingletonDesignPattern extends Thread{

	
	   
	    @Override
	    public void run() {
	    	//Demo d=Demo.getInsatnace();
	    	System.out.println(Thread.currentThread().getName());
	    //	System.out.println(d.hashCode());
	    	
	    }
	   
	      public static void main(String[] args) {
			   
	    	  multithredingBreakSingletonDesignPattern t1=new multithredingBreakSingletonDesignPattern();
	    	   t1.start();
	    	   
	    	   multithredingBreakSingletonDesignPattern t2=new multithredingBreakSingletonDesignPattern();
	    	   t2.start();
	    	   
	    	   
	    	   
	    	   
		}
}
