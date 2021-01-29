package com.corejava.Assignment1;

class Login{
    String userId = "Ajay",password = "password";
    int attempt=0;
    public String loginUser(String user, String pass) {

        if(attempt == 3){
            return "You have entered wrong credentials 3 times\nContact Admin";
        }


        if(user == userId && pass == password){
            attempt=0;
            return "Welcome "+ user;
        }else{
            attempt++;
            return "You have entered wrong credentials ,please enter the right credentials.";
        }
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {}
}
