import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CodeExamination
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice = 0;
        System.out.println("--- Interactive ArrayList Demonstration ---");
        while (choice != 5)
        {
            System.out.println("\nCurrent List: " + list);
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Update element");
            System.out.println("3. Remove element");
            System.out.println("4. Print list using Iterator");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.nextLine();
                    list.add(elementToAdd);
                    System.out.println("'" + elementToAdd + "' was added.");
                    break;
                case 2:
                    System.out.print("Enter the index to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToUpdate >= 0 && indexToUpdate < list.size())
                    {
                        System.out.print("Enter the new element: ");
                        String newElement = scanner.nextLine();
                        list.set(indexToUpdate, newElement);
                        System.out.println("Index " + indexToUpdate + " was updated.");
                    }
                    else
                    {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToRemove >= 0 && indexToRemove < list.size())
                    {
                        list.remove(indexToRemove);
                        System.out.println("Element at index " + indexToRemove + " was removed.");
                    }
                    else
                    {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:
                    System.out.println("--- Printing with Iterator ---");
                    Iterator<String> it = list.iterator();
                    if (!it.hasNext())
                    {
                        System.out.println("The list is empty.");
                    }
                    else
                    {
                        while (it.hasNext())
                        {
                            System.out.println("- " + it.next());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}