package com.IanFlanagan;


/*
 Add various TTM for Jira configs here
 https://api.ttm4j.tricentis.com/
 */

public class MyConfiguration {


    public static final String[] myTests = {"19211","18143"};
    public static final String projectKey = "DEMO";
    public static final String myAPIKey = "<key>";
  // public static final String baseURL = "https://api.dev.ttm4j.tricentis.com";
    public static final String baseURL = "https://api.ttm4j.tricentis.com";

    // URLS

  //  public static final String testCasesURL = "/v1/projects/{project-key}/test-cases";
    public static final String testCasesURL = "/v1/projects/"+projectKey+ "/test-cases";
    public static final String updateTestAutoResult = "/v1/projects/"+projectKey+"/test-runs/"+projectKey+"-TR-11";
    public static final String projects = "/v1/projects";
    public static final String folders = "/v1/projects/"+projectKey+"/folders";

}
