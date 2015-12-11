package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */

    public static String vowels = "aeiou";

    public static String abbreviate(String string) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            if (isVowel(letter)){
                string = string.replace("" + letter, "");
            }
        }
        return string;
    }

    public static boolean isVowel(char letter){
        return vowels.contains("" + letter);
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
