import java.util.Scanner;
import java.util.Arrays;
class stringCharacter{
    public static char [] stringToCharArray(String text){
        if(text==null){
            return new char[0];
        }
        char [] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++){
            chars [i] = text.charAt(i);
        }
        return chars;
    }
    public static boolean comparearray ( char [] a1, char [] a2){
        if (a1 == null || a2 == null){
            return a1 == a2;
        }
        if (a1.length != a2.length){
            return false;
        }
        for (int i = 0; i < a1.length; i++){
            if (a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.nextLine();
        char [] userdefined = stringToCharArray(text);
        char [] inbuilt = text.toCharArray();
        System.out.println("User-defined char array: " + Arrays.toString(userdefined));
        System.out.println("Built-in char array: " + Arrays.toString(inbuilt));

        if (comparearray(userdefined, inbuilt) == true) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

        sc.close();
    }
}
