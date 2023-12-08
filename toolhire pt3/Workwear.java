
import java.util.Scanner;

/**
 * class for Workwear tool.
 *
 * @author Emmanuella Boamah
 * @version Version 2
 */
public class Workwear extends Accessory
{
    // instance variables 
    private String manufacturingStandard;
    private String colour;
    private String size;

    /**
     * Constructor for objects of class Workwear
     */
    public Workwear( String manufacturingStandard, String colour, String size)
    {
        // initialise instance variables
      this.manufacturingStandard=manufacturingStandard;
      this.colour=colour;
      this.size=size;
    }
    
     public Workwear( )
    {
        // initialise instance variables
      manufacturingStandard="true ones";
      colour="red";
      size="M";
    }
    /**
     * 
     * @param manufacturingStandard, manufacturingStandard the manufacture of item
     */
    public void setManufacturingStandard(String manufacturingStandard){
       this.manufacturingStandard =manufacturingStandard;
    }
    
    /**
     * 
      * @param colour, colour the color of the tool
     */
    public void setColour(String colour){
        this.colour= colour;
    }
    
    /**
     * 
     * @param size, size of the tool
     */
    public void setSize(String size){
        this.size=size;
    }
    
    /**
     * 
     * @return isirritant, isirritant if the item is irritant
     */
    public String getManufacturingStandard(){
        return manufacturingStandard;
    }
    
    /**
     * 
     * @return size, size of the tool
     */
    public String getSize(){
        return size;
     }
    
    /**
     * 
     * @return colour, colour of the tool
     */
    public String getColour(){
        return colour;
    }
    //class to print out the details of the tool
    public void printDetails(){
        super.printDetails();
        System.out.println("; manufacturing Standard"+ manufacturingStandard +"; colour "+ colour+"; size "+ size );
        System.out.println(" ");
    }
    
    /**
     * 
     * @param scanner, scanner object to read the file
     */
      public void readData1(Scanner scanner){
       super.readData(scanner);
    }
    
    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData(Scanner scanner){
        super.readData1(scanner);
        manufacturingStandard=scanner.next();
        colour=scanner.next();
        size=scanner.next();
        scanner.close();
    }
   
}