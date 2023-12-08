
import java.util.Scanner;
import java.util.ArrayList;
/**
 * class for ElectricTools.
 *
 * @author Emmanuella Boamah
 * @version Version 2
 */
public class ElectricTool extends Tool //Electrictool inherits from Tool
{
    // instance variables 
    private boolean rechargable;
    private String power;

    /**
     * Constructor for objects of class ElectricTool
     */
    public ElectricTool(boolean rechargable, String power)
    {
        // initialise instance variables
        super(); //call to the superclass constructer
        this.rechargable= rechargable;
        this.power=power;
    }

    public ElectricTool(){
        super();
        rechargable= true;
        power="sw2"; 
    }

    public void setRechargable(boolean rechargable){
        this.rechargable=rechargable;
    }

    public void setPower(String power){
        this.power=power;
    }

    public boolean getRechargable(){
        return rechargable;
    }

    public String getPower(){
        return power;
     }
    //class to print out the details of the electric tool 
    public void printDetails(){
        super.printDetails();//call to the superclass's class printdetails to print
        System.out.println("; rechargeable " + rechargable + "; power "+ power );
        System.out.println(" ");
    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData(Scanner scanner)
    { 
        super.readData(scanner);//call to readData of the super class and passing scanner as a paremeter
        rechargable= scanner.nextBoolean();
        power = scanner.next();
        scanner.close();
    }

}
