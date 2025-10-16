import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestSmallest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n < 2)
        {
            System.out.println("Error: Array must contain at least two elements.");
            scanner.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Input Array: " + Arrays.toString(numbers));
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int number : numbers)
        {
            if (number > largest)
            {
                secondLargest = largest;
                largest = number;
            }
            else if (number > secondLargest && number != largest)
            {
                secondLargest = number;
            }
            if (number < smallest)
            {
                secondSmallest = smallest;
                smallest = number;
            }
            else if (number < secondSmallest && number != smallest)
            {
                secondSmallest = number;
            }
        }
        System.out.println("Second Smallest Element: " + secondSmallest);
        System.out.println("Second Largest Element: " + secondLargest);
        scanner.close();
    }
}