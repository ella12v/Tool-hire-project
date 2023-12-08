import java.util.Scanner;

/**
 *  class for HandTool tools.
 *
 * @@author Emmanuella Boamah
 * @version Version 2
 */
public class HandTool extends Tool
{
    // instance variables 
    
    private boolean sharpenable;
    
    /**
     * Constructor for objects of class HandTool
     */
    public HandTool()
    {
        // initialise instance variables
        this.sharpenable=false;  

    }
    
     public HandTool(boolean sharpenable)
    {
        // initialise instance variables
        this.sharpenable=sharpenable;

    }
    
    //class to print the unique details of a hand tool 
    public void printDetails(){
         super.printDetails();
         System.out.println("; sharpenable " + sharpenable );
         System.out.println(" ");
    }
    
    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData(Scanner scanner)
    {  super.readData(scanner);
      sharpenable= scanner.nextBoolean();
     scanner.close();
    }
    

}
