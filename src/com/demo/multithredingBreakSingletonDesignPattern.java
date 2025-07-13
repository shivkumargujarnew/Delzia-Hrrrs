package com.demo;

public class multithredingBreakSingletonDesignPattern extends Thread{

	//hello 
	   
	    @Override
	    public void run() {
	    	//Demo d=Demo.getInsatnace();
      for(int i=0;i<10;i++){
   System.out.println(i);
  }
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
