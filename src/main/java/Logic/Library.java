/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Amr
 */
public class Library {
    private Person [] admins;
    private Libraian [] libraians;
    private Student [] students;
    private Book [] books;
    private Book [] issuedBooks;
    private int adminsCount;
    private int libraiansCount;
    private int studentsCount;
    private int booksCount;
    private String filePath;
    
    public Library(){}
    
    public Library(Person [] admins, Libraian [] libraians, Student [] students, Book [] books){
        this.admins=admins;
        this.libraians=libraians;
        this.students=students;
        this.books=books;
    }
    
    public Person [] getAdmins(){
        return admins;
    }
    
    public Libraian [] getLibraians(){
        return libraians;
    }
     
    public Student [] getStudents(){
        return students;
    }
      
    public Book [] getBooks(){
        return books;
    }
       
    public void setAdminsCount(int count){
        adminsCount=count;
    }
    
    public int getAdminsCount(){
        return adminsCount;
    }
    
    public void setLibraiansCount(int count){
        libraiansCount=count;
    }
    
    public int getLibraiansCount(){
        return libraiansCount;
    }
    
    public void setStudentsCount(int count){
        studentsCount=count;
    }
    
    public int getStudentsCount(){
        return studentsCount;
    }
    
    public void setBooksCount(int count){
        booksCount=count;
    }
    
    public int getBooksCount(){
        return booksCount;
    }
    
    public void setPath(String s){
        filePath=s;
    }
    
    public String getPath(){
        return filePath;
    }
}
