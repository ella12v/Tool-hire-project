import java.util.Scanner;
/**
 *  class for Accessory tool.
 *
 * @author Emanuella Boamah
 * @version Version 2
 */
public class Accessory extends ShopItem
{
    // instance variables 
    protected boolean isRecyclable;

    /**
     * Constructor for objects of class Accessory
     */
    public Accessory(boolean isRecyclable)
    {
        // initialise instance variables
        this.isRecyclable=isRecyclable;
    }

    public Accessory()
    {
        // initialise instance variables
        this.isRecyclable=true;
    }
    
    /**
     * 
     * @param isRecyclable, isRecyclable if the tool is recyclable
     */
    public void getIsRecyclable(boolean isRecyclable){
        this.isRecyclable=isRecyclable;
    }
    
    public boolean setIsRecyclable(){
        return isRecyclable;
    }
    //class to print the details of the tool
    public void printDetails(){

        System.out.print(" isRecyclable "+ isRecyclable+";");
        super.printDetails();
    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData(Scanner scanner){
        isRecyclable=scanner.nextBoolean();  
        super.readToolName(scanner);
        //super.readData(scanner);
    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData1(Scanner scanner){
        super.readData(scanner);
    }

}
