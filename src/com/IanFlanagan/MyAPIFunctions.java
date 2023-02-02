package com.IanFlanagan;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyAPIFunctions {


    public static String buildURL(String myShortURL,String data)   {

        String myURL = null;

        if(data != null && !data.trim().isEmpty()) {

            // data is defined
            System.out.println("Data is defined lets build that URL!");

            try {
                myURL =(new StringBuilder()).append(MyConfiguration.baseURL).append(myShortURL).append(data).toString().trim();
                // System.out.println("My new URL is = " +myURL);
            }
            catch (Exception ex) {
                System.out.println("Can't build URL " +ex.getMessage());
            }
        }
        else {

          //  System.out.println("Data is not defined");
            System.out.println("Data is defined lets build that URL!");
            try {
                myURL =(new StringBuilder()).append(MyConfiguration.baseURL).append(myShortURL).append(data).toString();
                // System.out.println("My new URL is = " +myURL);
            }
            catch (Exception ex) {
                System.out.println("Can't build URL " +ex.getMessage());
            }

        }
        System.out.println("URL is = " +myURL);
        return myURL;
    }

    // Test Cases


    public static String getStuff(String myToken, String oppType, String urlType, String myStringopp) {

        String myTests = "";

        try {

            System.out.println("Calling " +myStringopp+"() method now");
            String myUrl = buildURL(urlType,"");

            URL obj = new URL(myUrl);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(oppType);
            con.setRequestProperty("type", "apikey");
            con.setRequestProperty("description", "TTM4J API Key");
            con.setRequestProperty("Authorization", myToken);
            System.out.println("Connection info is " +con);
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //  System.out.println(response.toString());
            myTests = response.toString();

        } catch (Exception ex) {

            System.out.println("Can't call the " +myStringopp+ "() method " +ex.getMessage());

        }
        System.out.println("My " +myStringopp+ " are = " +myTests);
        return myTests;

    }

    public static void createFolder(String myToken,String folderName, String json, String urlType) {

        System.out.println("Calling  createFolder() method now");
        System.out.println("My JSon in payload is \n" +json);
        String myUrl = buildURL(urlType,"");
        System.out.println("Calling createFolder() method now");

        try {

            URL url = new URL(myUrl);

            // Open a connection to the endpoint
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            con.setRequestMethod("POST");

            // Add the api token to the Authorization header
            con.setRequestProperty("type", "apikey");
            con.setRequestProperty("description", "TTM4J API Key");
            con.setRequestProperty("Authorization", myToken);
            con.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            // Add the request body as a JSON string

            con.setDoOutput(true);

            System.out.println("Conn is  " +con);

            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(json);
            out.flush();
            out.close();

            // Send the request and get the response
            int status = con.getResponseCode();
            System.out.println("Response code is = " +status);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println(status);
            System.out.println(content);

        } catch (Exception ex) {
            System.out.println("Can't call createFolder() method " +ex.getMessage());
        }

    }

    public static void updateTestResult(String myToken,String json, String urlType) {

       /*

       DEMO-19211
       update test case
/v1/projects/{project-key}/test-cases/{key}

        Update an existing test run.
        Note: Any values you enter will override existing values in the test run.
        Body fields:
        testCategory (optional): The test run category of the test run ("Functional" or "NonFunctional").
        executedBy (optional): the username which the test run is excuted by.
        assignee (optional): the username which the test run will be assigned to.
        priority (optional): priority of the test run ("Highes","Low",etc..).
        status (optional): the status of the test run. Status of test runs is defined in JIRA under the admin page. Mandatory field.
        plannedStartDate (optional): the test run planned start date.
        plannedEndDate (optional): the test run planned end date.
        cycleId (optional): specify the cycle Id which the test runs will be under.
        components (optional): the test runs components.
        labels (optional): the test runs labels.
        steps (optional): list of steps of the test run. In case TestType is Automated, Steps will be ignore (Automated test run can't contain steps).
        status (mandatory): the status of the test run step.
        actualResult (optional): the actual result of the steps.
        comment (optional): the test run step's comment.
        description (optional): the test run step's description.
        expectedResult (optional): the test run step's expectedResult.
        */


        System.out.println("My JSon in payload is \n" +json);
        String myUrl = buildURL(urlType,"");
        System.out.println("Calling updateTestResult() method now");

        try {

            URL url = new URL(myUrl);

            // Open a connection to the endpoint
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            con.setRequestMethod("PUT");

            // Add the api token to the Authorization header
            con.setRequestProperty("type", "apikey");
            con.setRequestProperty("description", "TTM4J API Key");
            con.setRequestProperty("Authorization", myToken);
            con.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            // Add the request body as a JSON string
            //  String json = "{ \"branch\":\"master\",\"grid\":\"TESTIM-GRID\",\"parallel\":\"1\",\"retries\":\"0\",\"timeout\":\"600\",\"turboMode\":\"true\" }";

            con.setDoOutput(true);

            System.out.println("Conn is  " +con);

            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(json);
            out.flush();
            out.close();

            // Send the request and get the response
            int status = con.getResponseCode();
            System.out.println("Response code is = " +status);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            // Print the response
            System.out.println(status);
            System.out.println(content);

        } catch (Exception ex) {
            System.out.println("Can't call updateTestResult() method " +ex.getMessage());
        }
    }

    public static void createTests(String myToken,String json, String urlType) {

        /*

        Summary
        Description
        Priority
        Labels
        Test
        Type
        Precondition
        Folder
        Step
        Description
        Expected Result

         */
        // String myToken, String oppType, String urlType

        System.out.println("My JSon in payload is \n" +json);
        String myUrl = buildURL(urlType,"");
        System.out.println("Calling createTests() method now");

        try {

            URL url = new URL(myUrl);

            // Open a connection to the endpoint
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            con.setRequestMethod("POST");

            // Add the api token to the Authorization header
            con.setRequestProperty("type", "apikey");
            con.setRequestProperty("description", "TTM4J API Key");
            con.setRequestProperty("Authorization", myToken);
            con.setRequestProperty("Content-Type", "application/json; charset=utf-8");

            // Add the request body as a JSON string
            //  String json = "{ \"branch\":\"master\",\"grid\":\"TESTIM-GRID\",\"parallel\":\"1\",\"retries\":\"0\",\"timeout\":\"600\",\"turboMode\":\"true\" }";

            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(json);
            out.flush();
            out.close();

            // Send the request and get the response
            int status = con.getResponseCode();
            System.out.println("Response code is = " +status);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            // Print the response
          //  System.out.println(status);
            System.out.println("content is " +content);

        } catch (Exception ex) {
            System.out.println("Can't call createTests() method " +ex.getMessage());
        }
    }




}
