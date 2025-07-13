package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {

	
	  public static void main(String[] args) throws Exception {
		Demo d1=Demo.getInsatnace();
		//hello
		  //hello2
//hello
		  //hello2
                //commit on 6 pm
		Demo d2=Demo.getInsatnace();
		
		//System.out.println(d1.hashCode());
		//System.out.println(d2.hashCode());
		//how many ways to 
		//serlization 
		System.out.println("selization started........");
		FileOutputStream fis=new FileOutputStream("C:\\Users\\SHIVKUMAR\\Desktop\\serlization");
		ObjectOutputStream obj=new ObjectOutputStream(fis);
		obj.writeObject(d1);
		System.out.println("serlization ended.............");
	
	   System.out.println("d serlization started.....");
	     FileInputStream fi=new FileInputStream("C:\\Users\\SHIVKUMAR\\Desktop\\serlization");
	     ObjectInputStream obi=new ObjectInputStream(fi);
	     Object ob=obi.readObject();
	  
	     Demo d=(Demo)ob;
	  
	//  System.out.println("d serlization ended............");
	  //
	    System.out.println(d1.hashCode());	  
	   //  System.out.println(d.hashCode());
	  
	  //using reflection
	    
	     Constructor<Demo> ct=Demo.class.getDeclaredConstructor();
	  
	      ct.setAccessible(true);
	      
	    // Demo dw= (Demo)ct.newInstance();
	  
	       //System.out.println("using reflection"+dw.hashCode());
	 
	    //clonning
	     
	     Demo dt=Demo.getInsatnace();
	     
	      Demo dt1=(Demo) dt.clone();
	  
	    System.out.println(dt1.hashCode());
	  
	  System.out.println(dt.hashCode());
	  
	  
	  
	  
	  
	  
	  }
}
