package com.wbl.others;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeSerialization  implements Serializable{
	
	public int id;
	public String name;
	transient public String city;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	
		EmployeeSerialization emp = new EmployeeSerialization();
		emp.id=1;
		emp.name="Geetha";
		emp.city="Fremont";
		
		//serialization
		FileOutputStream fos = new FileOutputStream("C:/Users/shilpi/Medha/Jan-Java/emp.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);					
		os.writeObject(emp);
		
		//deserialization
		FileInputStream fis = new FileInputStream("C:/Users/shilpi/Medha/Jan-Java/emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);					
		EmployeeSerialization emp2 = (EmployeeSerialization)ois.readObject();
		
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.city);
				
	}

}
