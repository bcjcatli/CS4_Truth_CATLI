package arraysexercise;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private int a, b;
  private ArrayList<Item> itemList = new ArrayList();
  private static ArrayList<Store> storeList = new ArrayList();
  
  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    earnings = 0;
    storeList.add(this);
    b++;
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index < 0 || index >= a) {
        System.out.println("There are only " + a + " items in " + name);
    } else {
        double earn = itemList.get(index).getCost();
        earnings += earn;
        System.out.println(name + " has earned " + earn + " from this transaction. Total earnings: " + earnings);
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    for (int count = 0; count < a; count++) {
        String itemName = itemList.get(count).getName();
        String storeName = storeList.get(b).getName();
        if (itemName == name) {
            double earn;
            earn = itemList.get(count).getCost();
            earnings += earn;
            System.out.println(storeName + " has earned " + earn + " from this transaction. Total earnings: " + earnings);
            break;
        } else if (count == a-1) {
            System.out.println(storeName + " does not sell the item " + name);
            
        }
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    for (int count = 0; count < a; count++) {
        if (i == itemList.get(count)) {
            double earn;
            earn = itemList.get(count).getCost();
            earnings += earn;
            System.out.println(name + " has earned " + earn + " from this transaction. Total earnings: " + earnings);
            break;
        } else if (count == a-1) {
            System.out.println(name + " does not sell the item " + itemList.get(count).getName());
    }
  }
}
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
    a++;
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println("Food items: ");
    for (int count = 0; count < a; count++) {
        String itemName = itemList.get(count).getName();
        if (type == itemList.get(count).getType()) {
            System.out.println(itemName);
        }
  }
  }
  
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    // loop over itemList and print all items with the specified type
    System.out.println();
    System.out.println("Cheap items:  ");

    for (int count = 0; count < a; count++) {
        String itemName = itemList.get(count).getName();
        if (maxCost >= itemList.get(count).getCost()) {
            System.out.println(itemName);
//        } else if (count == a-1) {
//            System.out.println();
        }
  }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.println();
    System.out.println("Expensive items:  ");

    for (int count = 0; count < a; count++) {
        String itemName = itemList.get(count).getName();
        if (minCost <= itemList.get(count).getCost()) {
            System.out.println(itemName);
        } 
  }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println();
    for (Store var : storeList) {
        System.out.println(var.getName() + ": " + var.getEarnings());
    }
  }
}
    