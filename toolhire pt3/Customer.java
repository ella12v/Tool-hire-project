import java.util.Scanner;

/**
 * Write a description of class Customer here.
 *
 * @author Emmanuella Boamah
 * @version (a version number or a date)
 */
public class Customer
{
         // instance variables 
    // public String customerID;
    public String surname;
    public String firstName;
    private String otherInitials;
    private String title;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String surname, String firstName, String otherInitials, String title)
    {
        // initialise instance variables
        // customerID="unknown";
        this.surname=surname;
        this.firstName= firstName;
        this.otherInitials=otherInitials;
        this.title=title;
    }

    public Customer(){
        // customerID="unknown";
        surname="Boamah";
        firstName="Emma";
        otherInitials="MRs";
        title="miss";
    }

    // public void setCustomerID(String cusomerID)
    // {
    // this.customerID = customerID;
    // }

    /**
     *
     * @param  surname, surname of the customer
     */
    public void setSurname(String surname)
    {
        this.surname=surname;
    }

    /**
     *
     * @param  firstName, firstName of the customer 
     */
    public void setFirstName(String firstName)
    {
        this.firstName= firstName;
    }

    /**
     *
     * @param  otherInitials, otherInitials of the customer
     */
    public void setOtherInitials(String otherInitials)
    {
        this.otherInitials=otherInitials;
    }

    /**
     *
     * @param  title, titleof the customer 
     */
    public void setTitle(String title)
    {
        this.title=title;
    }

    // public String getCustomerID()
    // {
    // return customerID;
    // }

    /**
     *
     * @return the surname of the customer
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     *
     * @return the first name of the customer
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return the other initials of the customer
     */
    public String getOtherInitials()
    {
        return otherInitials;
    }

    /**
     *
     * @return the title of the custumer
     */
    public String geTtitle()
    {
        return title;
    }

    /**
     *print out the details of the customer
     */ 
    public void printDetails()
    {
        System.out.println(/*" customerID: " + customerID + ";" + */" surname "+ surname+";  firstName: "+ firstName+ " ; other initials: "+ otherInitials+"; title: "+ title);
        System.out.println(" ");
    }

    /**
     *store the data from the file
     */
    public void readData(Scanner scanner)
    { 
        // customerID  = scanner.next();
        surname = scanner.next();
        firstName = scanner.next();
        otherInitials = scanner.next();
        title = scanner.next();
        scanner.close();
    }

    /**
     * returns the data of the customers
     */
    public String writeData(){
        return  /* customerID + ";" +*/ surname+"; "+ firstName+ ";"+ otherInitials+"; "+ title;

    }

}
