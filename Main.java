//import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        create inventory object
        Inventory inventory = new Inventory();
//        instead of just inputting items based on code, user can input instead
//        scanner for input system
        Scanner scanner = new Scanner(System.in);
//        to initialize input
        String input;

        System.out.println("Inventory System");
//        for loop
        while (true) {
//        what user can do
//        I am not sure why I added _ for these
            System.out.println("add_item, remove_item, display_inventory, display_no_of_items, exit");
            System.out.print("Enter choice: ");
//        to read input, erase whitespaces, and make everything lower case.
//        trim() and toLowerCase() are to lower probability of error input
//        just because of spaces and capitals
            input = scanner.nextLine().trim().toLowerCase();

//        if  conditions for user inputs
//        I could have used switch, but still not sure why I used if-statements instead
//        adding item
            if (input.equals("add_item")) {
                System.out.print("What you want to put into your inventory? ");
// read the input string as item to be added
                String item_to_Add = scanner.nextLine();

//           object of item created or inputted
                Item added_Item = new Item(item_to_Add);
//            adds the item to the inventory
                inventory.addItem(added_Item);
//            feedback that the added item has been successfully been added
//            the code below is redundant due to it having the feedback already in the Inventory.java
//            System.out.println("Item added: " + added_Item.getName());
            }
//        next if statement, removing item
//        if user input choice is = "remove", then initiate
            else if (input.equals("remove_item")) {
                System.out.print("Item to be removed: ");
//            get user input of item name for the item to be removed
                String removing_Item = scanner.nextLine();
//            item to be remove object
                Item item_removed = new Item(removing_Item);
//            removes item from inventory
                inventory.removeItem(item_removed);
            }
//        display inventory if condition
            else if (input.equals("display_inventory")) {
//            displays all items in inventory
                inventory.displayItems();

            }
//        display no of items in invetory
            else if (input.equals("display_no_of_items")) {
//get no of items through inventory.getItemCount()
                System.out.println("Total items in inventory: " + inventory.getItemCount());
            }
//        exits the program
            else if (input.equals("exit")) {
//            Message of exiting program
                System.out.println("Exiting Inventory System program");
//                forgot to add break
                break;
            }
//        if wrong choice or choice not found from list of possible options
            else {
//            error handling
                System.out.println("User input choice is not part of the options list. Please input a valid choice.");
            }
        }
//exit/close scanner
            scanner.close();

    }
}