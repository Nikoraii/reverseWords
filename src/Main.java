public class Main {
    public static void main(String[] args)
    {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWord(s));
    }

    public static String reverseWord(String s) {
        String[] words = s.split("((?<= )|(?= ))");
        String output = "";
        for (String word: words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            output += sb.toString();
        }
        return output;
    }
}