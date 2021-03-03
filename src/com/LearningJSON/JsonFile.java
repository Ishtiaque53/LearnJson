package com.LearningJSON;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class JsonFile {

    private String fileName;


        public void createFile(String fileName) {
            this.fileName=fileName;
            File myFile = new File(fileName);
            try {
                if (myFile.createNewFile())
                    System.out.println("File created");
                else
                    System.out.println("File not created. File with same name may already exist");
            } catch (Exception error) {
                System.out.println("Error occurred");
                error.printStackTrace();
            }
        }

        public void fileInfo(String fileName){
            this.fileName=fileName;
            File myFile = new File(fileName);
            if (myFile.exists()) {
                System.out.println(myFile.getName() + " exists");
                System.out.println("The file is " + myFile.length() + " bytes long");
                if (myFile.canRead())
                    System.out.println(" ok to read");
                else
                    System.out.println(" not ok to read");
                if (myFile.canWrite())
                    System.out.println(" ok to write");
                else
                    System.out.println(" not ok to write");
                System.out.println("path: " +myFile.getAbsolutePath());
                System.out.println("File Name: "+ myFile.getName());
                System.out.println("File Size: "+ myFile.length() + " bytes");
            } else
                System.out.println("File does not exist");
        }

    public void readFromFile(String fileName){
        this.fileName=fileName;
        File myFile = new File(fileName);
        try{
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println("Reading from file: \n" + data);
            }
            scanner.close();
        }
        catch (Exception error){
            System.out.println("Error occurred to read file");
            error.printStackTrace();
        }
    }
    public void writeToFile(String S, String fileName) {

            this.fileName=fileName;
        File myFile = new File(fileName);
        try{
            if(fileName.isEmpty())
                System.out.println("No File was selected.");
            else {
                FileWriter myWriter = new FileWriter(myFile);
                myWriter.write(S);
                myWriter.close();
            }
        }
        catch (Exception error){
            System.out.println("Error occurred while writing to the file");
            error.printStackTrace();
        }

    }

}

