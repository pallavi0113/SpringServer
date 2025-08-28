package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] arg){
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");


        UserManager userManagerWithDB;
        userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManagerWithDB.getUserInfo());


        UserManager userManagerWithWS;
        userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerWithWS.getUserInfo());



        UserManager userManagerWithNewDB;
        userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
