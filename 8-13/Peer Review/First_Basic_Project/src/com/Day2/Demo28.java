package com.Day2;

class Student2{
    private int id;
    private String name;
    private int PassingMark=40;

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id<0)
            throw new Exception("id can;t be -ve");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.isBlank())
            throw new Exception("Name can't be Blank");
        this.name = name;
    }

    public int getPassingMark() {
        return PassingMark;
    }

    public void print(){
        System.out.println(" id: "+getId()+" name "+getName()+" passMark "+getPassingMark());
    }
}
public class Demo28 {
    public static void main(String[] args) throws Exception {
        Student2 student=new Student2();
        student.setId(2);
        student.setName("mahi");
        student.print();

    }
}
