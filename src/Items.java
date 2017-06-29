package Arrays;

import java.util.ArrayList;


public class Items {


    private ArrayList<String> al = new ArrayList<>();

    /**
     * @param itemName Method used to add items , if item already exist in list it will not ben added.
     */
    public void addItems(String itemName) {
        if (al.contains(itemName)) {
            System.out.println("Item exists , please add another one.\n");
        } else {
            al.add(itemName);
            System.out.println("Item added , please choose next option.\n");
        }
    }

    /**
     * @param itemNumber Method used to delete item by index , if user enter number 0 , less than 0 or bigger than
     *                   size of list item will not be deleted.
     */
    public void deleteItemByIndex(int itemNumber) {
        //checking to see if number is in arraylist range.
        if (itemNumber == 0 || itemNumber < 0 || itemNumber > al.size()) {
            System.out.println("You don't have item with that number , try other number\n");
        } else {
            al.remove(itemNumber - 1);
            System.out.println("Item removed , please choose next option.\n");
        }
    }

    /**
     * This method is used to remove all items from list.
     */
    public void removeAll() {
        if (al.isEmpty()) {
            System.out.println("Your list is already empty.\n");
        } else {
            al.clear();
            System.out.println("All item are removed , please chose next option.\n");
        }
    }

    /**
     * @param itemName This method is used to delete item by name , if user enter name that does not exist
     *                 item will not been deleted
     */
    public void deleteItemByName(String itemName) {
        if (al.contains(itemName)) {
            al.remove(itemName);
            System.out.println("Item removed , please choose next option.\n");
        } else {
            System.out.println("You don't have item with that name.\n");
        }
    }

    /**
     * Method used to print all items in list.
     */
    public void printItems() {
        if (al.isEmpty()) {
            System.out.println("Your list is empty.");
        } else {
            System.out.println("This is your list of items.\n");
            for (int i = 0; i < al.size(); i++) {
                System.out.println((i + 1) + "." + al.get(i));
            }
            System.out.println("");
        }
//          System.out.println("This is your list of items.\n");
//          al.forEach(System.out::println);
    }

    /**
     * @param currentName
     * @param newName     Method used to modify item , user need to enter item name that already exist and name that will be replaced.
     *                    if item doesn't exist item name will not been updated.
     */
    public void modifyItem(String currentName, String newName) {
        if (al.contains(currentName)) {
            int getItemIndex = al.indexOf(currentName); // getting index of old item name.
            al.set(getItemIndex, newName);
            System.out.println("Item name is updated.\n");
        } else {
            System.out.println("You don't have item with that name, please enter a valid item name.\n");
        }


    }


}