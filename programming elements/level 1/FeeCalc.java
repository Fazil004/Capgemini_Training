import java.util.Scanner;
public class FeeCalc {
    public static void main (String[] args){
       int fee;
       double disper;
       double dis,totfee;
       Scanner input = new Scanner(System.in);
       System.out.print("enter fee: ");
       fee = input.nextInt();
       System.out.print("enter discount percent");
       disper = input.nextDouble();
       dis = disper * (fee)/100;
       totfee = fee - dis;
       System.out.println("The discount amount is INR "+ dis +" and final discounted fee is INR "+ totfee);
    }
}

       
       