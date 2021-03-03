package com.LearningJSON;

import com.dbcon.DBConnection;
import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.io.File;

public class Main {

    public static void main(String[] args) {

        /*Student newStudent = new Student();
        newStudent.setInfo();*/

        Gson json = new Gson();

        Student user1;

        try {
            Connection con = DBConnection.getInstance().getDBConnection();
            Statement stmt = con.createStatement();
            //ResultSet rs = stmt.executeQuery("select * from user where username = '"+username+"'");
            ResultSet rs = stmt.executeQuery("select * from mist");
            while (rs.next()) {
                user1 = createProfile(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
                System.out.println(json.toJson(user1));
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println("Error occurred while connecting to database");
        }

       /* String jsonFormat = json.toJson(newStudent);

        System.out.println(jsonFormat);*/

        /*int number = 0;
        String fileName= "file" + number;
        File myFile = new File(fileName + ".json");
        while(true) {
            if (myFile.exists()) {
                ++number;
                fileName = "file" + number;
                myFile = new File(fileName + ".json");
            }
            else
                break;
        }
        fileName = fileName + ".json";

        JsonFile file01 = new JsonFile();

        file01.createFile(fileName);
        file01.writeToFile(jsonFormat, fileName);
        file01.fileInfo(fileName);
        file01.readFromFile(fileName);
*/
    }

    public static Student createProfile(String fullName, String userName, String password, String phone, String email, String street, String city, String area, String country) {
        Student user = new Student();
        user.setFullName(fullName);
        user.setUserName(userName);
        user.setPassword(password);
        user.setPhone(phone);
        user.setEmail(email);
        user.setAddress(street,city,area,country);
        return user;
    }
}
