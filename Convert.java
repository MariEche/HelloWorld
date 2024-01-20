import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        System.out.println("Welcome to my Measurement Converter!");
        float amount;
        float unit;
        System.out.println("Here are the available conversions: [1:m to ft , 2:cm to in , 3:kg to lb , 4:mi to km ]" );
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a conversion from options 1-4 or enter '-1' to quit:");
        unit = scanner.nextInt();
        //System.out.println("Enter the amount:");//
        //amount = scanner.nextFloat();//

        //scanner.close();//



        while (unit > 0){
            if (unit == 1){
            System.out.println("Enter the amount:");
            amount = scanner.nextFloat();
            System.out.println(amount + " meters is equal to " + (amount * 3.281) + " feet.");
            System.out.println("Choose another conversion from options 1-4 or enter '-1' to quit:");
            unit = scanner.nextInt();
        }   if (unit == 2){
            System.out.println("Enter the amount:");
            amount = scanner.nextFloat();
            System.out.println(amount + " centimeters is equal to " + (amount / 2.54) + " inches.");
            System.out.println("Choose another conversion from options 1-4 or enter '-1' to quit:");
            unit = scanner.nextInt();
        }   if (unit == 3){
            System.out.println("Enter the amount:");
            amount = scanner.nextFloat();
            System.out.println(amount + " kilograms is equal to " + (amount * 2.205) + " pounds.");
            System.out.println("Choose another conversion from options 1-4 or enter '-1' to quit:");
            unit = scanner.nextInt();
        }   if (unit == 4){
            System.out.println("Enter the amount:");
            amount = scanner.nextFloat();
            System.out.println(amount + " miles is equal to " + (amount * 1.609) + " kilometers.");
            System.out.println("Choose another conversion from options 1-4 or enter '-1' to quit:");
            unit = scanner.nextInt();
        }   if (unit == -1){
            System.out.println("Okay, Goodbye!");
            break;
        }
    }
    
        scanner.close();

    }
    
}
