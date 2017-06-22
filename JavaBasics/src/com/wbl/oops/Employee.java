package com.wbl.oops;

public class Employee {

	private int id;
	private String name;
	
	public Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Employee){
		Employee e2= (Employee)o;//typecasting from object to employee
		if(this.id==e2.id && this.name==e2.name){
			return true;
		}
		}
		return false;
	}
	

	public static void main(String args[]){
		Employee e1= new Employee(1,"Sheetal");
		Employee e2= new Employee(1,"Sheetal");
		
		/*String s1= new String("hello");
		String s2= new String("hello");
		*/
		boolean result = e1.equals(e2);
		
		//System.out.println("hashcode for e1:"+e1.hashCode());
		//System.out.println("hashcode for e2:"+e2.hashCode());
		
		
		
		//System.out.println("result:" + result);
		
		int i1=10;
		int i2=20;
		//System.out.println(i1==i2);
		
		String s1="hello";
		String s2="hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
	}
	
	
}
