package com.Day1;

class Student{
    private int id;
    private String name;
    private int passMark=40;

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

    public int getPassMark() {
        return passMark;
    }

    public void setPassMark(int passMark) {
        this.passMark = passMark;
    }

    public Student(int id) throws Exception {
        if(id<0)
            throw new Exception("id can't be negative");
        this.id=id;
    }
}
public class Demo18 {
    public static void main(String[] args) throws Exception {
        Student st=new Student(2);
        System.out.println(st.getId());
        st.setName("Shihab");
        st.setPassMark(60);

        System.out.println(st.getName());
        System.out.println(st.getPassMark());
    }
}
