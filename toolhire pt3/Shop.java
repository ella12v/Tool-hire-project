
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * stimulates a shop that lends tools.
 *
 * @author Emmanuella Boamah
 * @version Version 2
 */
public class Shop
{
    // instance variables - replace the example below with your own
    private List<ShopItem> shopList;
    private List<Customer> customerList;
    private List<ShopItemReservation> itemReservationMap;
    private Random randomGenerator = new Random();
    HashMap<String, List<Customer>> customerMap; 
    HashMap<String, List<ShopItem>> itemsMap; 
    private int reservationID=0;
    Diary diary=new Diary();;
    /**
     * Constructor for objects of class Shop
     */
    public Shop()
    {
        // initialise instance variables
        shopList = new ArrayList<>();
        customerList= new ArrayList<>();
        itemReservationMap= new ArrayList<>();
        customerMap =new HashMap<String, List<Customer>>();
        itemsMap =new HashMap<String, List<ShopItem>>();
       // new Diary();
    }
    
    /**
     * Adds shopItems to the arraylist
     *
     * @param  Shopitem, the shopitem to be added
     */
    public void storeItem(ShopItem shopItem)
    {
      shopList.add(shopItem);
    } 
    
    /**
     * Adds shopItemReservation to the arraylist and the dairy
     *
     * @param  shopItemReservation, the shopitemReservation to be added
     */
    public void storeItemReservation(ShopItemReservation shopItemReservation)
    {
      itemReservationMap.add(shopItemReservation);
      diary.addReservation(shopItemReservation);
    } 
    
    /**
     * Adds customr details to the hashmap 
     *
     * @param  ID, values,  ID the key and value to add to the hashmap
     */
    public void hashStoreCustomer(String ID, List<Customer> values){

        if(ID.equals("unknown")){
            ID=generateCustomerID("AB", 6);
            customerMap.put(ID,values);
        }
        else{
            customerMap.put(ID,values);
        } 
    }
    
    /**
     * Adds items details to the hashmap 
     *
     * @param  ID, values,  ID the key and value to add to the hashmap
     */
    public void hashStoreItems(String ID, List<ShopItem> values){

        if(ID.equals("unknown")){
            //  generateCustomerID("AB", 6);
            ID=generateCustomerID("AB", 6);//d equals a random number
            itemsMap.put(ID,values);
        }
        else{
            itemsMap.put(ID,values);
        } 
    }
    
    /**
     * returns the customer details based on the key inputted
     *
     * @param  customerID, key to find customer 
     */
    public void getCustomer(String customerID){
        List<Customer> myList = customerMap.get(customerID); // get the ArrayList for the current key

        if (myList != null) { // check if the ArrayList is not null
            for (Customer obj : myList) {
               
                obj.printDetails(); // call the printDetails() method for each object in the ArrayList
            }
        } else {
            System.out.println("No values found for key: " + customerID);
        }

    }
    
    /**
     * returns the items details based on the key inputted
     *
     * @param  itemCode, key to find item 
     */
    public void getItem(String ItemCode){
        List<ShopItem> myList = itemsMap.get(ItemCode); // get the ArrayList for the current key

        if (myList != null) { // check if the ArrayList is not null
            for (ShopItem obj : myList) {
              
                obj.printDetails(); // call the printDetails() method for each object in the ArrayList
            }
        } else {
            System.out.println("No values found for key: " + ItemCode);
        }

    }
    
    /**
     * adds customer details to customer list
     *
     * @param  customer of customer class(object)
     */
    public void storeCustomer(Customer customer){
        customerList.add(customer);
    }
    
    /**
     * prints out all the detils of the customers in the hashmap
     */
    public void getAllHashDets()
    {
        for (String key : customerMap.keySet()) 
        {  System.out.print("CustomerID: " + key+";");
           
            List<Customer> myList = customerMap.get(key); // get the ArrayList for the current key

            if (myList != null) { // check if the ArrayList is not null
                for (Customer obj : myList) {
                    obj.printDetails(); // call the printDetails() method for each object in the ArrayList
                }
            } else {
                System.out.println("No values found for key: " + key);
            }
        }
    }
    
    /**
     * prints out all the detils of the items in the hashmap
     */
    public void getAllHashDetsIT()
    {
        for (String key : itemsMap.keySet()) 
        {
           System.out.print("itemID: " + key+";");
            List<ShopItem> myList = itemsMap.get(key); // get the ArrayList for the current key

            if (myList != null) { // check if the ArrayList is not null
                for (ShopItem obj : myList) {
                    obj.printDetails(); // call the printDetails() method for each object in the ArrayList
                }
            } else {
                System.out.println("No values found for key: " + key);
            }
        }
    }

     /**
     * print out tools in tool list
     */
    // public void printAllTools()
    // {
    // for (ShopItem shopItem : shopList)
    // {
    // shopItem.printDetails();
    // System.out.println("");
    // }
    // }
     /**
     * print out customers in customer list
     */
    // public void printAllCustomers(){
    // for (Customer customer: customerList)
    // {
    // customer.printDetails();
    // System.out.println("");
    // }
    // }
    /**
     * generate a random id for customers
     * 
     * @param  prefix, nOfDigits , the prefix of the ID and the number of digits that u want the Id to be like
     */
    public String generateCustomerID(String pfix,int nOfDigits ){
        ArrayList<String> arListCheck = new ArrayList<String>();
        int numb = (int) Math.pow(10, nOfDigits - 1);
        int num =numb + randomGenerator.nextInt(9 * numb);  
        String str= (String) (pfix + num);
        //System.out.println(str); 
        if (!arListCheck.contains(str)) {
            arListCheck.add(str);

            return str;
        }
        else{

            return "AB-99999";

        }
    }
    
    /**
     * generate id number for reservations
     * 
     * returns the reservation number
     */
    public String generateReservationNo(){
      reservationID++;
      String reservationNumber = String.format("%06d", reservationID);
      return reservationNumber;
        
    }

   /**
     * get reservation details from the reservation list
     * 
     * @param reservationID, the Id of the reservation to be used to find the reservation the user is looking for
     */
    public void getItemReservation(String reservationID){
      //get info on item reservation
      for(ShopItemReservation shopItem: itemReservationMap)
        {
          if( shopItem.getReservationNo().equals(reservationID))
        {
             shopItem.printDetails();
        }
        }  
    }
    
    /**
     * class to make a reservation
     * 
     * @param customerID, itemID, startDate, noOfDays are all information needed to make a reservation 
     * @returns true if the user details were corect and was able to make the reservation ese return false
     */
    public boolean makeItemReservation(String customerID, String itemID, String startDate, int noOfDays){
       String genNumb= generateReservationNo();
        DateUtil dateCheck = new DateUtil();
 if(customerMap.keySet().contains(customerID) && itemsMap.keySet().contains(itemID) && dateCheck.isValidDateString(startDate) && noOfDays > 0) {// if customer i and item id actually exist and then check that the dste is valid
     Date date=dateCheck.convertStringToDate(startDate);
   for (int days = 0; days < noOfDays; days++) {
 ShopItemReservation[] newList= diary.getReservations(date);//create new list to hold the reservations in, based on the date given
  if (newList != null) {
  int sizes = newList. length;
   int position = 0;
  while (position < sizes) {
  ShopItemReservation sIreservation = newList[position] ;
  String ltemID = sIreservation.getItemID ();
  if (ltemID. equalsIgnoreCase(itemID) ){//if itemID already has the item id

  System.out.println("Sorry but the item is already reserved, try to input a different date or item.");
  return false;
  }
  position++;
  }
 }
 date = dateCheck. incrementDate (date, 1);
 }
                
     ShopItemReservation shopItemReservation=new ShopItemReservation(genNumb, itemID, customerID,startDate, noOfDays);
        storeItemReservation(shopItemReservation);
      return true;
        }
    else{
      System.out.println("Sorry try again ");
       
       return false;
    
    }
 }
 
  
  /**
     * write customers on a file
     * 
     * @param reservationID, the id of the reservation they wnt to delete
     */
    public void deleteItemReservation(String reservationID){
        List <ShopItemReservation> str= new ArrayList();//create a new list to add the reservation that the user wants deleted
             for(ShopItemReservation shopItem: itemReservationMap)
        {
          if( shopItem.getReservationNo().equals(reservationID))
        {
             diary.deleteReservation(shopItem);//remove reservation
             str.add(shopItem);//add reservation to lists to delete 
             System.out.println("reservation has been deleted");
             
        }
        else{
            System.out.println("sorry but the ID entered does not exist");
        }  
       
    }
    for(ShopItemReservation resvDelete: str){// delete the reservations in the new list created
           itemReservationMap.remove(resvDelete);
       }
   }
   
    
    /**
     * print out all the reservations in the list
     */
     public void printItemleReservationData(){
    
    {
    for (ShopItemReservation shopItem : itemReservationMap)
    {
    shopItem.printDetails();
    System.out.println("");
    }
    if(itemReservationMap.size()==0){//if reservation is empty then print out that there are no rservations
         System.out.println("No reservations made");
    }
    }
   }
   
   
   /**
     *  print out all the reservations in the diary   
     * 
     * @param entryDate, the start date that the user wants to look from,  endDate,  end date that the user wants to stop looking at
     */
    public void printDiaryEntries(String entryDate, String endDate){
        DateUtil date= new DateUtil();
        if(entryDate==endDate){
           diary.getReservations(date.convertStringToDate(entryDate));
        }
        else{
          diary.printEntries(date.convertStringToDate(entryDate), date.convertStringToDate(endDate));  
        }
   }
   
   
   /**
     * write reservations to a file
     * 
     * @param fileName, to input the name of the filename to write on
     */
    public void writeItemReservationData(String fileName)
       throws FileNotFoundException{
           PrintWriter pWriter= new PrintWriter(fileName);
      for(ShopItemReservation shopItem: itemReservationMap)
        {
        pWriter.println(shopItem.writeData());
        }
        pWriter.close();
   }
    
 
    /**
     * read out the reservations from a text file
     */
    public void readItemReservationData(){
       
     Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "open", FileDialog.LOAD);
        fileBox.setDirectory("C:\\Users\\ellab\\OneDrive - University of Salford\\Documents ");
        fileBox.setVisible(true);
        String fileName = fileBox.getFile();
        File file = new File(fileName);
         Scanner scanner = null;

        try
        {
            scanner = new Scanner(file);
        }
        catch (Exception e)
        {
            System.out.println("file can't be found. Double check and try again");
        }
        String lineOfText="" ;
        
        while (scanner.hasNext()){
            lineOfText = scanner.nextLine().trim();
            if (lineOfText.isEmpty() || lineOfText.startsWith("//") )
            { 
                continue;
            }

            else{

                Scanner scanner1 = new Scanner(lineOfText);
                scanner1.useDelimiter(("[ ]*[,][ ]*"));
               
                ShopItemReservation shopItemReservation = new ShopItemReservation();
                shopItemReservation.readData(scanner1);
               storeItemReservation(shopItemReservation);
            

            }
        } 
        
       printItemleReservationData();
        scanner.close();
        
    }
    
     /**
     * reads the data of the file usng fileDialog and adds them to the hashmap
     * 
     */
    public void readCustomerData(){
        Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "open", FileDialog.LOAD);
        fileBox.setDirectory("C:\\Users\\ellab\\OneDrive - University of Salford\\Documents ");
        fileBox.setVisible(true);
        String fileName = fileBox.getFile();
        File file = new File(fileName);
        Scanner scanner = null;

        try
        {
            scanner = new Scanner(file);
        }
        catch (Exception e)
        {
            System.out.println("file can't be found. Double check and try again");
        }
        String lineOfText="" ;
        String ID2="";
        while (scanner.hasNext()){
            lineOfText = scanner.nextLine().trim();
            if (lineOfText.isEmpty() || lineOfText.startsWith("//") )
            { 
                continue;
            }

            else{

                Scanner scanner1 = new Scanner(lineOfText);
                scanner1.useDelimiter(("[ ]*[,][ ]*"));
                ID2=scanner1.next();
                Customer customer = new Customer();
                customer.readData(scanner1);
                storeCustomer(customer);
                hashStoreCustomer(ID2, Collections.singletonList(customer));

            }
        } 
        //printAllCustomers();
        getAllHashDets();
        scanner.close();
    }
    
    /**
     * write customers on a file
     * 
     * @param fileName, to input the name of the filename to write on
     */
    public void writeCustomerData(String fileName)
    throws FileNotFoundException
    {PrintWriter pWriter= new PrintWriter(fileName);
        // for(Customer customer: customerList)
        // {
        // String lineOfText=customer.writeData();
        // pWriter.println(lineOfText);
        // }
        for (String key : customerMap.keySet()) 
        {
            pWriter.println("Key: " + key);
            List<Customer> myList = customerMap.get(key); // get the ArrayList for the current key

            if (myList != null) { // check if the ArrayList is not null
                for (Customer obj : myList) {
                    String lineOfText=obj.writeData(); // call the printDetails() method for each object in the ArrayList
                    pWriter.println(lineOfText);
                }
            } else {
                System.out.println("No values found for key: " + key);
            }
        }
        pWriter.close();
    }

    /**
     * Reads data from a files to create shopitems in the ShopItem arraylist
     */
    public void readToolData()
    {
        Frame frame = null;
        FileDialog fileBox = new FileDialog(frame, "open", FileDialog.LOAD);
        fileBox.setDirectory("C:\\Users\\ellab\\OneDrive - University of Salford\\Documents ");
        fileBox.setVisible(true);
        String fileName = fileBox.getFile();
        File file = new File(fileName);
        Scanner scanner = null;

        try
        {
            scanner = new Scanner(file);
        }
        catch (Exception e)
        {
            System.out.println("file can't be found. Double check and try again");
        }
        String lineOfText="" ;
        String toolType="";
        while (scanner.hasNext()){   
            lineOfText = scanner.nextLine().trim();
            if (!lineOfText.isEmpty() && !lineOfText.startsWith("//") )//|| lineOfText.startsWith("["))
            {
                if(lineOfText.startsWith("[")){
                    toolType = lineOfText;
                }
                else{
                    Scanner scanner1 = new Scanner(lineOfText);
                    scanner1.useDelimiter("[ ]*[,][ ]*");
                    ShopItem shopItem= null;
                    if(toolType.equalsIgnoreCase(new String("[ElectricTool Data]"))){
                        shopItem = new ElectricTool();
                        shopItem.readToolName(scanner1);//store the itemName
                        String ID2=scanner1.next();//store the itemCode
                        shopItem.readData(scanner1);//store the other items
                        storeItem(shopItem);
                        hashStoreItems(ID2, Collections.singletonList(shopItem));
                        // System.out.println(toolType);
                    }
                    else if(toolType.equalsIgnoreCase(new String("[HandTool Data]"))){
                        shopItem = new HandTool();
                        shopItem.readToolName(scanner1);//store the itemName
                        String ID2=scanner1.next();//store the itemCode
                        shopItem.readData(scanner1);//store the other items.readData(scanner1);
                        storeItem(shopItem);
                        hashStoreItems(ID2, Collections.singletonList(shopItem));
                        // System.out.println(toolType);
                    }
                    else if(toolType.equalsIgnoreCase(new String("[Perishable data]"))){
                        shopItem = new Perishable();
                        shopItem.readData1(scanner1);//store recycle and itemName
                        String ID2=scanner1.next();//store id
                        shopItem.readData(scanner1);//store the other items.readData(scanner1);
                        storeItem(shopItem);
                        hashStoreItems(ID2, Collections.singletonList(shopItem));
                        // System.out.println(toolType);
                    }
                    else if(toolType.equalsIgnoreCase(new String("[Workwear data]"))){
                        shopItem = new Workwear();
                        shopItem.readData1(scanner1);//store recycle and itemName
                        String ID2=scanner1.next();//store id
                        shopItem.readData(scanner1);//store the other items.readData(scanner1);
                        storeItem(shopItem);
                        hashStoreItems(ID2, Collections.singletonList(shopItem));
                        // System.out.println(toolType);
                    }

                    else{
                        System.out.println("tooltype "+ toolType+ " doesnt work, please try gain");
                    }
                }
            }
        }

        getAllHashDetsIT();
        scanner.close();
    }

}

