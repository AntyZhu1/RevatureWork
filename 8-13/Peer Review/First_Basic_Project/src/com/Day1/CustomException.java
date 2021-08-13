package com.Day1;

class Student5{
    private int id;
    private  String name;
    private int passMark=40;

    public int getId() {
        return id;
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

    public Student5(int id) throws Exception {
        if(id<0){
            throw new Exception("Id can't be negative");
        }
        this.id=id;
    }
    public void studentInfo(){
        System.out.println("Id: "+id+", name: "+name+", pass Mark: "+passMark);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            Student5 student=new Student5(1);
            student.setName("mahi");
            student.getPassMark();
            student.studentInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
