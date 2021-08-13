package com.Day6;

interface Hello {
    public String greeting();
}

interface Welcome {
    public String greeting(String name);
}

interface Calculation {
    public int addNum(int a, int b);
}

interface Say {
    public void sayHello(String name);
}


public class Demo10 {
    public static void main(String[] args) {


        //without parameter
        Hello hello = () -> {
            return "Welcome home";
        };
        System.out.println(hello.greeting());

        // with parameter
        Welcome welcome = (name) -> {
            return "Welcome " + name;
        };
        System.out.println(welcome.greeting("mahi"));

        // with multiple parameters
        Calculation calculation=(a,b)->{
            return a+b;
        };
        System.out.println(calculation.addNum(25,30));

        // without return
        Say say=(name)->{
            System.out.println("Hello "+name);
        };
        say.sayHello("Rafa");

    }
}
