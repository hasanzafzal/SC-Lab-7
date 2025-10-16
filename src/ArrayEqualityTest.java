import java.util.Scanner;
import java.util.Arrays;

public class ArrayEqualityTest
{
    public static boolean areArraysEqual(int[] arr1, int[] arr2)
    {
        if (arr1.length != arr2.length)
        {
            return false;
        }
        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Enter First Array ---");
        System.out.print("Enter the number of elements: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size1; i++)
        {
            array1[i] = scanner.nextInt();
        }
        System.out.println("\n--- Enter Second Array ---");
        System.out.print("Enter the number of elements: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size2; i++)
        {
            array2[i] = scanner.nextInt();
        }
        System.out.println("\nFirst Array: " + Arrays.toString(array1));
        System.out.println("Second Array: " + Arrays.toString(array2));
        if (areArraysEqual(array1, array2))
        {
            System.out.println("Result: The arrays are equal.");
        }
        else
        {
            System.out.println("Result: The arrays are not equal.");
        }
        scanner.close();
    }
}