package com.company;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private String adress;

    public Student(int id, String name, int age, String adress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    @Override
    public String toString(){
        return id + "\t" + name +"\t" + age +"\t" + adress;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.name);
    }

    public int getAge() {
        return age;
    }
}
