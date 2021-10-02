package Logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Book {
private String callNo;
private String name;
private String author;
private String publisher;
private int quantity;
private int issuedQuantity;
private Date addDate;
SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");

public Book(String callNo ,String name , String author , String publisher, int quantity,int issuedQuantity,String addDate){
    this.callNo=callNo;
    this.name=name;
    this.author=author;
    this.publisher=publisher;
    this.quantity=quantity;
    this.issuedQuantity=issuedQuantity;
    if(addDate.equals("null")){
    this.addDate = Calendar.getInstance().getTime();
    }
    else{
        try {
            this.addDate = formatter.parse(addDate);
        } catch (ParseException ex) {
        }
      
    }
}

public String getCallNo(){
    return callNo;
}

public String getBookName(){
    return name;
}
public String getAuthorName(){
return author ;
}

public String getPublisherName(){
    return publisher;
}

public int getQuantity(){
    return quantity;
}

public int getIssued(){
    return issuedQuantity;
}


public void setQuantity(int n){
    quantity=n;
}

public void setIssued(int n){
    issuedQuantity=n;
}

public Date getAddDate(){
    return addDate;
}

}