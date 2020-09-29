import java.util.ArrayList;
import java.util.Arrays;

//I'm giving it up for now

/**
 * You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 *
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 *
 * Example
 *
 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
public class Kata3SortOdd {

    public static void main(String[] args) {
        int[] arr = {1,5,6,3,8,9,1};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] array) {
        int[] newarr = Arrays.stream(array).filter(v -> ( (v % 2) != 0 )).sorted().toArray();
        for (int element : array){
            if ((element % 2) == 0) {

            }
        }
        ArrayList list = new ArrayList(Arrays.asList(newarr));
        list.add(2,6);
        list.add(4, 8);
        return newarr;
    }
}
