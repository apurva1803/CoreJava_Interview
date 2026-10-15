package com.rays.immutable;

final class Student {

	private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public static void main(String[] args) {

        Student s = new Student(1, "Apurva");

        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}

//Output:
//	1
//	Apurva
