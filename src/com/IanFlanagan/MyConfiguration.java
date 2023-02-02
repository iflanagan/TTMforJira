package com.IanFlanagan;


/*
 Add various TTM for Jira configs here
 https://api.ttm4j.tricentis.com/
 */

public class MyConfiguration {

    /*

    new API key M2VlNTlkYTctZmI4ZC00OTQyLWFkMGMtZjE4ZThhMDc2ZDdhLTRkYWMzNTlhLWU2YzItNDQ3Yy1hMmRhLWFkMDJmZmZhOGRiZg==
     */

    public static final String[] myTests = {"19211","18143"};
    public static final String projectKey = "DEMO";
    public static final String myAPIKey = "MzVjY2Y1OTItNWZkYy00NDQ0LTllNDEtZmE0ZDYyOThjNWRkLTAzMTk2MWVkLWM1ODEtNGNhNS1iZWFhLTBkNDM1MDU3NDMxYQ==";
  // public static final String baseURL = "https://api.dev.ttm4j.tricentis.com";
    public static final String baseURL = "https://api.ttm4j.tricentis.com";

    // URLS

  //  public static final String testCasesURL = "/v1/projects/{project-key}/test-cases";
    public static final String testCasesURL = "/v1/projects/"+projectKey+ "/test-cases";
    public static final String updateTestAutoResult = "/v1/projects/"+projectKey+"/test-runs/"+projectKey+"-TR-11";
    public static final String projects = "/v1/projects";
    public static final String folders = "/v1/projects/"+projectKey+"/folders";

}
