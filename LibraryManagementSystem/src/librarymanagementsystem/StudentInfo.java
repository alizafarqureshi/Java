/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author 3BROS COMPUTERZ
 */

    
  public class StudentInfo extends LibraryManagementSystem {
     private int id;
    private String book;
    private String name;
    private int semester;
    private String issuedate;
    private String returndate;

   


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getBook() {
        return book;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getReturndate() {
        return returndate;
    }

}
