import java.util.Scanner;

/**
 * class for Perishable tool.
 *
 * @author Emmanuella Boamah
 * @version Version 2
 */
public class Perishable extends Accessory
{
    // instance variables 
    protected boolean isIrritant;
    protected String useByDate;
    protected int volume;

    /**
     * Constructor for objects of class Perishable
     */
    public Perishable(boolean isIrritant, String useByDate, int volume)
    {
                         // initialise instance variables
         this.isIrritant=isIrritant;
         this.useByDate=useByDate;
         this.volume= volume;
    }
    
      public Perishable()
    {
                        // initialise instance variables
         isIrritant=true;
         useByDate="12-02-2023";
         volume= 578;
    }
    
    /**
     * 
     * @param getIsIrritant, getIsIrritant if the item is irritant
     */
    public void setIsIrritant(boolean isIrritant){
       this.isIrritant =isIrritant;
    }
    
    /**
     * 
     * @param useByDate, useByDate the deadline of the tool
     */
    public void setUseByDate(String useByDate){
        this.useByDate= useByDate;
    }
    
    /**
     * 
     * @param volume, volume of the tool
     */
    public void setVolume(int volume){
        this.volume=volume;
    }
    
    /**
     * 
     * @return isirritant, isirritant if the item is irritant
     */
    public boolean getIsIrritant(){
        return isIrritant;
    }
    
    /**
     * 
     * @return usebydate, deeadline of the tool
     */
    public String getUseByDate(){
        return useByDate;
    }
    
    /**
     * 
     * @return volume, volume of the tool
     */
    public int getVolume(){
        return volume;
    }
    //class to print out the details of the tool
    public void printDetails(){
        super.printDetails();
        System.out.println("; isIrritant "+ isIrritant+"; useByDate "+ useByDate+ "; volume "+ volume);
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
        
        super.readData1(scanner);//get name
        isIrritant=scanner.nextBoolean();
        useByDate=scanner.next();
        volume=scanner.nextInt();
    }

}