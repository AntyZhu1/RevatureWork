package com.Day3;

class UserAlreadyLoggedInException extends Exception{

}
class Authentication{
    private boolean isLoggedIn=false;

    public void login(String email,String password) throws UserAlreadyLoggedInException {
        if(!isLoggedIn){
            if(email.equals("admin")&& password.equals("123")){
                isLoggedIn=true;
                System.out.println("Login successfully");
            }else {
                System.out.println("Login Failed!!!!!!!!!!");
            }
        }else {
            throw new UserAlreadyLoggedInException();
        }
    }
}
public class Demo21 {
    public static void main(String[] args) {
        Authentication authentication=new Authentication();

        try {
            authentication.login("admin","123");
        } catch (UserAlreadyLoggedInException e) {
            e.printStackTrace();
        }
        try {
            authentication.login("admin","123");
        } catch (UserAlreadyLoggedInException e) {
            System.out.println("Hey! you already logged in");
        }
    }
}
