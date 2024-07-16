import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArraysBt arraysbt = new ArraysBt();
        int[] array = {1,3,6,7,9,12,15,18,20,12};
        //bt1
        // int sumArrayEven = arraysbt.SumArraysBt1(array);
        // System.out.println("Sum of even numbers in array is: " + sumArrayEven);
        // //bt2
        // int maxNumber = arraysbt.maxInArray(array);
        // System.out.println("Max number in array is: " + maxNumber);
        // //bt3
        // int elementTofind = 12;
        // int countOccurrences = arraysbt.CountOccurrences(array, elementTofind);
        // System.out.println("Element " + elementTofind + " appears" + countOccurrences +" times in the array");
        //bt4
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sumOfSquares = arraysbt.SumOfSquaresElements(arrayList);
        System.out.println("Sum of squares of elements in ArrayList is: " + sumOfSquares);
    }
}
