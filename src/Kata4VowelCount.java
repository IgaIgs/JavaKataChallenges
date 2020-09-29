/**
 * Return the number (count) of vowels in the given string.
 *
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 *
 * The input string will only consist of lower case letters and/or spaces.
 */
public class Kata4VowelCount {

    public static void main(String[] args) {
        System.out.println(getCount("techie delight"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] chars = str.toCharArray();
        for (char c:chars){
            if ((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u')){
                vowelsCount ++; }
        }
        return vowelsCount;
    }
}
