package com.tight.coupling;

public class TightCouplingExam {
    public static void main(String[] arg){
        UserManager userManager=new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
