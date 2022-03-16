/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.sql.*;
import java.util.Scanner;

public class CRUDStudentInformation extends LibraryManagementSystem { //inheritance

    public static Connection dbConnection(){
        Connection conn = null; 
        try { //to define a block of code to be tested for errors while it is being executed.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystem", "root", "");
        }catch (Exception e){e.printStackTrace();} //to define a block of code to be executed, if an error occurs in the try block.
        return conn; //to exit the method
    }
    
    
  
    
    
    public void Write(){
        Books obj3 = new Books(); 

        Connection connection = CRUDStudentInformation.dbConnection();
        try {
            
            StudentInfo info = new StudentInfo();
            Scanner sc = new Scanner(System.in);
           
            System.out.println("Enter id:");
            int id = sc.nextInt();  //scan int and take to next

            System.out.println("Enter Name:");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.nextLine(); //scan string and take to next

            System.out.println("Enter semester:");
            String semester = sc.next(); //scan string and take to next
            System.out.println("Enter issue date:");
            String issuedate=sc.next();  //scan string and take to next
            System.out.println("Enter return date:");
            String returndate=sc.next();  //scan string and take to next2
            
            System.out.println("These books are available");
             
        System.out.println("1.Chemistry \n2.Physics \n3.Biology\n4.History\n5.Computer Sciences\n6.BusinessManagement\n7.Mass Communication");
        System.out.println("Your Choice : ");
        Scanner obj = new Scanner(System.in);
        int choice = obj.nextInt();
        
        if (choice == 1) {
            obj3.Chemistry();
        } else if (choice == 2) {
            obj3.Physics();
        } else if (choice == 3) {
            obj3.Biology();
        } else if (choice == 4){
            obj3.History();
        }else if (choice == 5){
            obj3.ComputerScience();     
        }else if (choice == 6){
            obj3.BusinessManagement();
        }else if (choice ==7){
            obj3.MassCommunication();
        }
       System.out.println("Enter Book:");
       Scanner sc2 = new Scanner(System.in);
            String book = sc2.nextLine();
            
       
       
            
            String queryInsert = "INSERT INTO `adminpanel`(`id`, `name`, `semester`, `book`,`issuedate`,`returndate`) VALUES('"+ id + "','" +
                    name + "','" + semester + "','" + book + "','"+issuedate +"','"+returndate+"')";
            Statement statement = connection.prepareStatement(queryInsert);
            statement.executeUpdate(queryInsert);
            System.out.println("Data INSERTED ");
        }   catch (SQLException e) { // exception handling
            e.printStackTrace();   
        }
    }



    public void Read() {
        Connection connection = CRUDStudentInformation.dbConnection();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `adminpanel`");
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                System.out.println("---------------------------------------------");
                System.out.println("id : " + rs.getInt("id") );
                System.out.println("name : " + rs.getString("name"));
                System.out.println("semester : " + rs.getString("semester"));
                System.out.println("book : " + rs.getString("book"));
                System.out.println("---------------------------------------------");
                System.out.println("issuedate:"+rs.getString("issuedate"));
                System.out.println("returndate:"+rs.getString("returndate"));
                System.out.println("---------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void Update(){
         Connection connection = CRUDStudentInformation.dbConnection();
        try{
            StudentInfo info = new StudentInfo();
            Scanner sc3 = new Scanner(System.in);

            System.out.println("Enter Previous Id");
            int previous_id = sc3.nextInt(); //to take int input

           
            
            String book = sc3.nextLine();

            System.out.println("Enter new id");
            int id = sc3.nextInt();

            System.out.println("Enter Name");
            Scanner sc4 = new Scanner(System.in);
            String name = sc4.nextLine();

            System.out.println("Enter semester");
            String semester = sc3.next();
            
            System.out.println("Enter Book");
             book = sc4.nextLine();
             System.out.println("Enter issue date:");
             String issuedate=sc3.next();
             System.out.println("Enter return date:");
             String returndate=sc3.next();
            
            String queryUpdate = "UPDATE `adminpanel` SET`id`='"+ id + "',`name`='" +
                    name + "',`semester`='" + semester + "',`book`='" + book + "',`issuedate`='"+issuedate 
                    +"',`returndate`='"+returndate+"' where id ='"+previous_id+"'";
            
            
             
            

            Statement statement = connection.prepareStatement(queryUpdate);

            int rowsUpdated = statement.executeUpdate(queryUpdate);
            if (rowsUpdated > 0) {  // if there is no row of data the data cannot be updated
                System.out.println("Data Updated");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void Delete(){
        Connection connection = CRUDStudentInformation.dbConnection();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id");
            int id = sc.nextInt();
            String queryDelete = "DELETE FROM `adminpanel` WHERE `id` = "+ id+";";
            PreparedStatement statement  = connection.prepareStatement(queryDelete);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) { // if there is no row of data the data cannot be deleted
                System.out.println("Deleted!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
