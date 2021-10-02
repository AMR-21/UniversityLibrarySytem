package Logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Student extends Person {

    private String email;
    private String address;
    private String city;
    private String contactNo;
    private int id;
    private String[] issuedBooks = new String[3];
    private Date[] issueDate = new Date[3];
    private Date[] returnDate = new Date[3];
    private int issued;
    private int i;
    private double latePenalty;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");

    public Student(String username, String password, String email, String city, int id, String address, String contactNo, int issued,double penalty) {
        super(username, password);
        this.email = email;
        this.address = address;
        this.city = city;
        this.id = id;
        this.contactNo = contactNo;
        this.issued = issued;
        latePenalty=penalty;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public int getIssued() {
        return issued;
    }

    public int getId() {
        return id;
    }

    public String[] getIssuedBooks() {
        return issuedBooks;
    }

    public Date[] getIssueDates() {
        return issueDate;
    }

    public Date[] getReturnDates() {
        return returnDate;
    }

    public void updateIssued(int n) {
        issued = n;
    }
    
    public double getPenalty(){
        return latePenalty;
    }
    
    public void setPenalty(double n){
        latePenalty = n;
    }
    
    public void setI(){
        i--;
    }

    public void setIssuedCalls(String callNo, String date, String rDate) {
        issuedBooks[i] = callNo;
        if (date.equals("null")) {
            issueDate[i] = Calendar.getInstance().getTime();
        } else {
            try {
                issueDate[i] = formatter.parse(date);
            } catch (ParseException ex) {
            }
        }
        if (rDate.equals("null")) {
            returnDate[i] = Calendar.getInstance().getTime();
        } else {
            try {
                returnDate[i] = formatter.parse(rDate);
            } catch (ParseException ex) {
            }
        }
        i++;
    }

}
