/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 * @author 3BROS COMPUTERZ
 */
public class AdminPanel extends LibraryManagementSystem {


    String user_name;
    int password;

    public void getdata(String user_name, int password) {

        this.user_name = user_name;

        this.password = password;

    }
}


