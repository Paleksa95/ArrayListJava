package Arrays;

import java.util.Scanner;

public class ArrayListTest {

    private static Scanner s = new Scanner(System.in);
    private static Items items = new Items();

    private static void printMenu() {
        System.out.println("Please choose one option from the list.");
        System.out.println("1. Print options");
        System.out.println("2. Add item.");
        System.out.println("3. Delete item by index.");
        System.out.println("4. Delete all items in your list.");
        System.out.println("5. Delete item by name.");
        System.out.println("6. Print your list with items.");
        System.out.println("7. Modify item by name.");
        System.out.println("8. EXIT.");
    }


    public static void main(String[] args) {

        boolean exit = true;
        int choice;

        printMenu();
        while (exit) {

            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    System.out.println("Enter item's name.");
                    items.addItems(s.nextLine());
                    printMenu();
                    break;
                case 3:
                    System.out.println("Enter items number to delete it.");
                    items.deleteItemByIndex(s.nextInt());
                    printMenu();
                    break;
                case 4:
                    items.removeAll();
                    printMenu();
                    break;
                case 5:
                    System.out.println("Enter items name");
                    items.deleteItemByName(s.nextLine());
                    printMenu();
                    break;
                case 6:
                    items.printItems();
                    printMenu();
                    break;
                case 7:
                    System.out.println("Enter current item name.");
                    String oldName = s.nextLine();
                    System.out.println("Enter new item name.");
                    String newName = s.nextLine();
                    items.modifyItem(oldName,newName);
                    printMenu();
                    break;
                default:
                    exit = false;
            }

        }


    }

}
