/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

 import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  // to make a table in the database
import java.sql.SQLException;
import java.util.Scanner;

public class StudentPortal extends LibraryManagementSystem {
   


    public void readData(){
        Connection connection = CRUDStudentInformation.dbConnection();
        System.out.println("Enter ID : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `adminpanel` WHERE id ="+ id+"");
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                System.out.println("---------------------------------------------");
                System.out.println("book : " + rs.getString("book"));
                System.out.println("id : " + rs.getInt("id") );
                System.out.println("name : " + rs.getString("name"));
                System.out.println("semester : " + rs.getString("semester"));
                System.out.println("---------------------------------------------");
            }
    } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}


