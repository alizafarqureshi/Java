/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import java.util.Scanner;

public class Books extends LibraryManagementSystem {

    public void Chemistry() {
        Scanner obj = new Scanner(System.in);
        int choice = 0;
        {
            System.out.println("The books available in chemistry department are as follow:");
            System.out.println("");
            String chem[] = {"Organic Chemistry", "Bio chemistry", "Polymer chemistry"};

            for (int i = 0; i < chem.length; i++) {
                System.out.println(chem[i]);
            }


        }
    }


    public void Physics() {
        System.out.println("The books available in physics department are as follow ");
        System.out.println("");
        String phy[] = {"Quantum Physics", "Applied Physics", "Nuclear and Partile Physics"};


        for (int j = 0; j < phy.length; j++) {

            System.out.println(phy[j]);
        }

    }


    public void Biology() {
        System.out.println("The books available in biology depaartment are as follow");
        System.out.println("");
        String bio[] = {"Zoology", "Botany", "Elementary Biology"};

        for (int k = 0; k < bio.length; k++) {

            System.out.println(bio[k]);
        }

    }

    public void History() {
        System.out.println("The books available in history department are as follow");
        System.out.println("");
        String his[] = {"History of the World", "The history of Islam", "Pakistan History"};

        for (int l = 0; l < his.length; l++) {
            System.out.println(his[l]);
        }
    }

    public void ComputerScience() {
        System.out.println("The books available in computersciences department are as follow");
        System.out.println("");
        String comp[] = {"Introduction to Computer", "Fundamental of Computers", "Computer Engineering"};

        for (int c = 0; c < comp.length; c++) {
            System.out.println(comp[c]);
        }
    }

    public void BusinessManagement() {
        System.out.println("The books available in BusinessMangement department are as follow");
        System.out.println("");
        String bm[] = {"International Business Management", "Principles of Business Management", "Forest Business Management"};

        for (int b = 0; b < bm.length; b++) {
            System.out.println(bm[b]);
        }


    }

    public void MassCommunication() {
        System.out.println("the books available in MassCommunication department are as follow");
        System.out.println("");
        String mc[] = {"Introduction to Mass Communication", "Journalism and Mass Communication", "Responsibility in mass communication"};

        for (int m = 0; m < mc.length; m++) {
            System.out.println(mc[m]);
        }

    }
}