package com.IanFlanagan;

public class Main {

    public static void main(String[] args) {

         /*

        Summary	Description	Priority Labels	Test Type	Precondition	Folder	Step Description	Expected Result

         */

   //   // String myURL = MyAPIFunctions.buildURL(MyConfiguration.testCasesURL,"");

        String jsoncreate = "{ \"Summary\":\"IanTest\",\"Description\":\"Ian API Test\",\"Priority\":\"High\",\"labels\":\" None\",\"TestType\":\"Automated\",\"Folder\":\" \",\"Step Description\":\"Load URL. Enter username, enter password, click login\",\"Expected Result\":\"User successfully signed In!\" }";

        String json = "{ \"steps\":\"[ { \"status\": \"failed\", \"actualResult\": \"I cant login to the app\",\"comment\": \"Ian test\",\"description\": \"Enter username, enter password, click login button\",\"expectedResult\": \"Login successful\" } ]\"}";

        String jsonfolder = "{ \"name\":\"IanFolder\" }";

       // MyAPIFunctions.createFolder(MyConfiguration.myAPIKey,"IanFolder",jsonfolder,MyConfiguration.folders);

       //     MyAPIFunctions.getStuff(MyConfiguration.myAPIKey,"GET",MyConfiguration.testCasesURL, "tests");
     //   MyAPIFunctions.createTests(MyConfiguration.myAPIKey, jsoncreate, MyConfiguration.testCasesURL);
        MyAPIFunctions.updateTestResult(MyConfiguration.myAPIKey,json,MyConfiguration.updateTestAutoResult);
     //   GeneralFunctions.fileCheck("test.txt");

     //   MyAPIFunctions.getStuff(MyConfiguration.myAPIKey,"GET",MyConfiguration.projects,"projects");



    }
}
