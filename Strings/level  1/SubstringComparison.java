
import java.util.Scanner;

class SubstringComparison {

    public static String createSubstringCharAt(String text, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            return "";
        }

        StringBuilder substring = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.next();

        System.out.print("Enter the start index: ");
        int startIndex = sc.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = sc.nextInt();

        String charAtSubstring = createSubstringCharAt(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);

        if (compareStrings(charAtSubstring, builtInSubstring)) {
            System.out.println("The substrings are equal.");
        } else {
            System.out.println("The substrings are not equal.");
        }

        sc.close();
    }
}

