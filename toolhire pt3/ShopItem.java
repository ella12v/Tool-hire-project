
import java.util.Scanner;
import java.util.ArrayList;
/**
 * class for all ShopItems.
 *
 * @author Emmanuella Boamah
 * @version Version 2
 */
public class ShopItem
{
    // instance variables
    protected String toolName;
    // protected String itemCode;
    protected int cost;

    /**
     * Constructor for objects of class ShopItem
     */
    public ShopItem(String toolName, String itemCode, int cost)
    {
        // initialise instance variables
        this.toolName = toolName;
        //  this.itemCode = itemCode;
        this.cost = cost;

    }

    /**
     * Constructor for objects of class ShopItem
     */
    public ShopItem(){
        toolName="machine";
        //  itemCode="tt45";
        cost=567;

    }

    /**
     *
     * @param  toolName, toolName of tool
     */
    public void setToolName(String toolName){
        this.toolName=toolName;
    }

    /**
     *
     * @param  cost, cost of tool
     */
    public void setCost(int cost){
        this.cost=cost;
    }

    /**
     *
     * @return the tool name of the tool
     */
    public String getToolName(){
        return toolName;
    }

    /**
     *
     * @return the cost of the tool
     */
    public int getCost(){
        return cost;
    }
    //class to print  details of the tool
    public void printDetails()
    {
        System.out.print( " Tool name: " + toolName /* ", code " + itemCode*/+ "; cost "+cost );
    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readToolName(Scanner scanner){
        toolName = scanner.next();
    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData(Scanner scanner)
    {
        // toolName = scanner.next();
        //  itemCode = scanner.next();
        cost = scanner.nextInt();

    }

    /**
     * 
     * @param scanner, scanner object to read the file
     */
    public void readData1(Scanner scanner)
    {

    }

}
