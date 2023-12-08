import java.util.Scanner;
import java.util.ArrayList;
/**
 * Stimulates tools to be hired.
 *
 * @author Emmanuella Boamah
 * @version Version 2
 */
public class Tool extends ShopItem
{
    
    protected int timesBorrowed;
    protected boolean onLoan;
    protected int weight;
    /**
     * Constructor for objects of class Tool
     */
    public Tool(String toolName, String itemCode, int timesBorrowed, boolean onLoan, int cost, int weight)
    {
    
        super();
        this.timesBorrowed = timesBorrowed;
        this.onLoan = onLoan;
        this.weight = weight;
    }

    public Tool()
    {
        this.timesBorrowed = 98;
        this.onLoan = false;
        this.weight = 9;
    }

    /**
     *
     * @param  timesBorrowed, the number of times that the tools have been borrowed
     */
    public void setTimesBorrowed(int timesBorrowed)
    {
        this.timesBorrowed = timesBorrowed;
    }

    /**
     *
     * @param  onLoan, if the tool is on loan
     */
    public void setOnLoan(boolean onLoan)
    {
        this.onLoan = onLoan;
    }
   
    /**
     *
     * @param  weight, weight of the tool 
     */
    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    /**
     *
     * @return the number of times that the tool was borrowed
     */
    public int getTimesBorrowed()
    {
        return timesBorrowed;
    }

    /**
     *
     * @return true or falsedepending on wether the tool is on loan or not
     */
    public boolean getOnLoan()
    {
        return onLoan;
    }

    /**
     *
     * @return the weight of the tool 
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * class to print the main details of a tool
     */
    public void printDetails()
    {super.printDetails();
        System.out.print(" timesBorrowed: " + timesBorrowed + "; ");
        if (onLoan == true)
        {
            System.out.print(" onLoan: yes; cost: " + cost + "; weight: " + weight);
        }
        else
        {
            System.out.print(" onLoan: no; cost: " + cost + "; weight: " + weight);
        }

    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData(Scanner scanner)
    { 
        super.readData(scanner);
        timesBorrowed = scanner.nextInt();
        onLoan = scanner.nextBoolean();
        weight = scanner.nextInt();
    }
}
