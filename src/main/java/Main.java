import java.util.Scanner;
public class Main {
    public static void binaryToDenary(){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an 8-bit binary number");
        String binary = input.nextLine();
        String value128 = binary.substring(0,1);
        String value64 = binary.substring(1,2);
        String value32 = binary.substring(2,3);
        String value16 = binary.substring(3,4);
        String value8 = binary.substring(4,5);
        String value4 = binary.substring(5,6);
        String value2 = binary.substring(6,7);
        String value1 = binary.substring(7,8);
        int total = 0;
        if (value128.equals("1")) {
            total = total + 128;
        }
        if (value64.equals("1")) {
            total = total + 64;
        }
        if (value32.equals("1")) {
            total = total + 32;
        }
        if (value16.equals("1")) {
            total = total + 16;
        }
        if (value8.equals("1")) {
            total = total + 8;
        }
        if (value4.equals("1")) {
            total = total + 4;
        }
        if (value2.equals("1")) {
            total = total + 2;
        }
        if (value1.equals("1")) {
            total = total + 1;
        }
        return total;
    }

    public static void main(String[] args) {
        /*Scanner input = new Scanner (System.in);
        System.out.println("What type are you converting from: Binary, Denary, or Hex?");
        String fromType = input.nextLine();
        if (fromType.equals("Binary")) {
            System.out.println("What type are you converting to: Denary or Hex?");
            String toType = input.nextLine();
        } else if (fromType.equals("Denary")) {
            System.out.println("What type are you converting to: Binary or Hex?");
            String toType = input.nextLine();
        } else {
            System.out.println("What type are you converting to: Binary or Denary?");
            String toType = input.nextLine();
        }*/
        System.out.println(binaryToDenary());
    }
}
