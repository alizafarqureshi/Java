/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;


import java.sql.Connection;    //libraries added for database
import java.sql.DriverManager; //
import java.sql.SQLException;  //
import java.util.Scanner;  // for user input


public class LibraryManagementSystem {


    public static Connection conn = null;

    public static void main(String[] args) throws SQLException {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementsystem", "root", "");


        Scanner info = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String name;
        int pass;
        String username;

        int choice = 0;
        char continuee = 'a';
        do {

            System.out.println("Welcome to Library Management System");

            System.out.println("Enter 1 - Admin Panel \n Enter 2 - Student Portal \n Enter 3 - Exit");
            choice = info.nextInt();

            if (choice == 1) {

                System.out.println("Enter user name:");
                username = info.next();

                System.out.println("Enter Password");
                pass = info.nextInt();
                if (pass == 12345) {
                    System.out.println("1.Write Data\n2.Read Data\n3.Update Data \n4.Delete Data");
                    choice = info.nextInt();

                    if (choice == 1) {
                        CRUDStudentInformation crud = new CRUDStudentInformation();
                        crud.Write();

                    } else if (choice == 2) {
                        CRUDStudentInformation crud = new CRUDStudentInformation();
                        crud.Read();
                    } else if (choice == 3) {
                        CRUDStudentInformation crud = new CRUDStudentInformation();
                        crud.Update();
                    } else if (choice == 4) {
                        CRUDStudentInformation crud = new CRUDStudentInformation();
                        crud.Delete();
                    }

                } else {
                    System.out.println("Invalid Username or Password ! ");

//             System.out.println("Do you want to continue? y/n");
//            Scanner sc1 = new Scanner(System.in);
//            continuee = sc1.nextLine().charAt(0);
                }

            } else if (choice == 2) {

                StudentPortal sp = new StudentPortal();
                sp.readData();

            } else if (choice == 3) {
                System.out.println("Thank you for using Library Management System");
                System.exit(0);
            } else if (choice > 3 || choice < 0) {
                System.out.println("Invalid Input ! ");
            }
            System.out.println("Do you want to continue? y/n");
            Scanner sc1 = new Scanner(System.in);
            continuee = sc1.nextLine().charAt(0);

        } while (continuee == 'y');

    }

}