/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example:
 *
 *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *
 *  persistence(4) == 0 // because 4 is already a one-digit number
 */
public class Kata5Persistence {

    public static void main(String[] args) {
        System.out.println(persistence(999)); //5*7 = 35, 3*5 = 15, 1*5=5
    }

    public static int persistence(long num) {
        int pers = 0;
        int insideproduct = 1;
        int outsideproduct = 11;

        if (num >= 10) {
            while (outsideproduct >= 10) {
                while (num != 0) {
                    insideproduct *= (num % 10);
                    num /= 10;
                }
                num = insideproduct;
                outsideproduct = insideproduct;
                insideproduct = 1;
                pers ++;
            }
        }
        else if (0 < num){
            return pers;
        }
        return pers;
    }
}
