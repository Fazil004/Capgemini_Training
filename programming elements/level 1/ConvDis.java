import java.util.Scanner;
public class ConvDis {
    public static void main(String[] args){
       double diskm;
       Scanner input = new Scanner(System.in);
       diskm = input.nextInt();
       double dismiles = (1/1.6) * diskm;
       System.out.println ("distance in miles from km: " + dismiles);
    }
}