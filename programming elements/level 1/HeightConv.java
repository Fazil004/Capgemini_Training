import java.util.Scanner;
class HeightConv{
    public static void main(String[] args){
        float heightCm;
	Scanner input = new Scanner(System.in);
	System.out.print("enter height in cm :");
        heightCm = input.nextFloat();
	double heightInch = heightCm/2.54;
        double heightFt   = heightInch/12;
        System.out.println(" Your Height in cm is "+heightCm+" while in feet is "+heightFt+" and inches is "+heightInch);
    }
}

	

                