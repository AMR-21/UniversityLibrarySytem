package Logic;

public class  Libraian extends Person {
private String email;
private String address;
private String city;
private String contactNo;
/*public static ArrayList<Book> allBooks = new ArrayList<Book>();*/


public Libraian (String username,String password,String email,String city , String address ,String contactNo){
    super(username,password);
    this.email=email;
    this.address=address;
    this.city=city;
    this.contactNo=contactNo;
}
//Getters

public String getEmail(){
    return email;
}
public String getCity(){
    return city;
}
public String getAddress(){
    return address;
}
public String getContactNo(){
    return contactNo;
}


/*public ArrayList getAllBooks(){
    return allBooks;
}
public void addBookToLibrary(Book book){
    allBooks.add(book);
} 
public void issueBook(Book book , Student student){
    student.addBookToStudent(book);
}
public void returnBook(Book book , Student student){
    student.removeBookOfStudent(book);
}*/


}


