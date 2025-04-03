
import java.util.Scanner;

class StringComparison {

   public static boolean compareStringsCharAt(String str1, String str2) {
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

       System.out.print("Enter the first string: ");
       String str1 = sc.next();

       System.out.print("Enter the second string: ");
       String str2 = sc.next();

       boolean charAtResult = compareStringsCharAt(str1, str2);
       boolean equalsResult = str1.equals(str2);

       System.out.println("Result using charAt(): " + charAtResult);
       System.out.println("Result using equals(): " + equalsResult);

       if (charAtResult == equalsResult) {
           System.out.println("Results from charAt() and equals() are the same.");
       } else {
           System.out.println("Results from charAt() and equals() are different.");
       }

       sc.close();
   }
}

