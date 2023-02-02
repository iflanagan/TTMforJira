package com.IanFlanagan;

import java.io.File;

public class GeneralFunctions {




    public static boolean fileCheck(String file) {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        boolean fileExists = false;

        try
        {
            // Getting the file by creating object of File class
            File f = new File(file);

            // Checking if the specified file exists and is not empty
            if ( (f.exists() && (f.length() !=0) ) ) {

                // Show if the file exists
                System.out.println(file+ " Exists");
                fileExists = true;
            }

            else {

                // Show if the file does not exists
                System.out.println(file+ " Does not Exist or is empty");
            }

        } catch (Exception ex) {
            System.out.println("Can't call fileCheck() method " +ex.getMessage());
        }

        return fileExists;

    }


    public static boolean fileExists(File file) {

        boolean fileExists = false;

        try {

            file = new File(String.valueOf(file));
            fileExists = file.exists();
            if ( (file.length() == 0) && (fileExists) ) {

                System.out.println("File is empty and or doesn't exist");
            }
             else
            {
                System.out.println("File is not empty and the File exists");
            }

        } catch (Exception ex) {
            System.out.println("Can't run fileExists() method " +ex.getMessage());
        }

        return fileExists;
    }
}
