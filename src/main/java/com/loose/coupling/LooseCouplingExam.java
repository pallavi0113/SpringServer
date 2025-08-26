package com.loose.coupling;

public class LooseCouplingExam {
    public static void main(String[] arg){
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB=new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider=new WebServiceDataProvider();
        UserManager userManagerWithWS=new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());


        UserDataProvider newDatabaseProvider =new NewDatabaseProvider();
        UserManager userManagerWithNewDB=new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
