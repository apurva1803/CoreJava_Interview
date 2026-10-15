package com.rays.shallowdeep;

public class StudentShallow implements Cloneable{
	
	String name;
    Address address;

    StudentShallow(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    public static void main(String[] args) throws Exception {
    	
        Address a = new Address("Sangli");
        StudentShallow s1 = new StudentShallow("Apurva", a);

        StudentShallow s2 = (StudentShallow) s1.clone();

        s2.address.city = "Indore";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }


}

//Output:
//	Indore
//	Indore
