package com.rays.shallowdeep;

public class StudentDeep implements Cloneable{

	String name;
    Address address;

    StudentDeep(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
    	StudentDeep copy = (StudentDeep) super.clone();

        copy.address = new Address(this.address.city);

        return copy;
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
    	
    	Address a = new Address("Sangli");
        StudentDeep s1 = new StudentDeep("Apurva", a);

        StudentDeep s2 = (StudentDeep) s1.clone();
        
        s2.name="Shivam";

        s2.address.city = "Indore";
        
        System.out.println(s1.name);
        System.out.println(s1.address.city);
        
        System.out.println(s2.name);
        System.out.println(s2.address.city);
	}
}

//Output:
//Apurva
//Sangli
//Shivam
//Indore

