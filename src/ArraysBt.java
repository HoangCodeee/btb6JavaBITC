import java.util.ArrayList;
import java.util.Scanner;

public class ArraysBt {

    public int SumArraysBt1(int[] array)
    {
        int sum = 0;
        for (int number : array)
        {
            if (number % 2 == 0)
            sum+=number;
        }
        return sum;
    }
    public int maxInArray(int[] array)
    {
        int max = array[0];
        for (int number : array)
        {
            if (number > max)
            {
                max=number;
            }
        }
        return max;
    }
    public int CountOccurrences(int[] array,int elementTofind)
    {
        int count = 0;
        for (int number : array)
        {
            if (number == elementTofind)
            {
                count++;
            }
        }
        return count;
    }
    public int SumOfSquaresElements(ArrayList<Integer> arrayList) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter numbers to add to the ArrayList (enter 'n' to stop):");

            while (true) {
                String input = scanner.next();
                if (input.equalsIgnoreCase("n")) {
                    break;
                }
                try {
                    int number = Integer.parseInt(input);
                    arrayList.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'n' to stop.");
                }
            }
        } finally {
            scanner.close();
        }

        int sumOfSquares = 0;
        for (int number : arrayList) {
            sumOfSquares += number * number;
        }
        return sumOfSquares;
    }

}