import java.util.Date;
import java.util.Scanner;

/**
 * Write a description of class ShopItemReservation here.
 *
 * @author Emmanuella Boamah
 * @version 3
 */
public class ShopItemReservation
{
    // instance variables - replace the example below with your own
    private String reservationNo;
    private String itemID;
    private String customerID;
    private Date startDate;
    private int noOfDays;
    DateUtil dateUtil= new DateUtil();
    
    /**
     * Constructor for objects of class ShopItemReservation
     */
    public ShopItemReservation(String reservationNo, String itemID, String customerID, String startDate, int noOfDays )
    {
        // initialise instance variables
        this.reservationNo=reservationNo;
        this.itemID=itemID;
        this.customerID=customerID;
        this.startDate=dateUtil.convertStringToDate(startDate);
        this.noOfDays=noOfDays;
    }
    
    public ShopItemReservation()
    {
        // initialise instance variables
        this.reservationNo="007";
        this.itemID="009";
        this.customerID="0-09";
        this.startDate= dateUtil.convertStringToDate("20-12-2023");
        this.noOfDays=5;
    }
    
     /**
     *
     * @return the reservation Number 
     */
    public String getReservationNo(){
         return reservationNo;
    }
    
     /**
     *
     * @return the item  iD
     */
    public String getItemID(){
        return itemID;
    }
    
     /**
     *
     * @return the customer ID
     */
    public String getCustomerID(){
        return customerID;
    }
    
     /**
     *
     * @return the start Date
     */
    public Date getStartDate(){
      return  startDate;
    }
    
     /**
     *
     * @return the no Of Days
     */
    public int getNoOfDays(){
        return noOfDays;
    }
    
    
     /**
     *
     * @param  reservationNo, the reservation number
     */
    public void setReservationNo(String reservationNo)
    {
        this.reservationNo = reservationNo;
    }
    
    /**
     *
     * @param  itemID, the id of the item 
     */
    public void setItemID(String itemID)
    {
        this.itemID = itemID;
    }
    
    
    /**
     *
     * @param  customerID, the id of the customer
     */
    public void setCustomerID(String customerID)
    {
        this.customerID = customerID;
    }
    
    /**
     *
     * @param  startDate, the start date of the reservation
     */
    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }
    
    /**
     *
     * @param  noOfDays, the duration of the resevation
     */
    public void setNoOfDays(int noOfDays)
    {
        this.noOfDays = noOfDays;
    }
    
    
    public void printDetails(){
        System.out.println("reservationNo: "+ reservationNo + " itemID " + itemID + " customerID " + customerID + " startDate " + startDate + " noOfDays " + noOfDays);
    }
    
    public String writeData(){
      return reservationNo +", "+ itemID +", "+ customerID+", " + startDate+", " + noOfDays;
    }
    
    /**
     *to read data from a scanner file
     * @param scanner, scanner object to read the file

     */
    public void readData(Scanner scanner){
        this.reservationNo=scanner.next();
        this.itemID=scanner.next();
        this.customerID=scanner.next();
        String startDate1=scanner.next(); 
        this.startDate=dateUtil.convertStringToDate(startDate1);
        this.noOfDays=scanner.nextInt();
    }
    
     public String toString(){
         return "reservationNo: "+ reservationNo + " itemID " + itemID + " customerID " + customerID ;
     }
}
