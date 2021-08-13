package com.Day3;

public class Demo24 {
    public static void main(String[] args) throws Exception {

        doSome();
    }

    private static void doSome() throws Exception {
        doSomeThing();
    }

    private static void doSomeThing() throws Exception {
        doSomeThingElse();
    }

    private static void doSomeThingElse() throws Exception {
        throw new Exception();
    }

}
