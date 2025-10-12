import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double num1 = myObj.nextDouble();
        
        System.out.print("Enter second Number: ");
        double num2 = myObj.nextDouble();

        System.out.printf("Addition: %.2f + %.2f = %.2f %n",num1,num2, num1+num2);
        System.out.printf("Subtraction: %.2f - %.2f = %.2f %n",num1,num2, num1-num2);
        System.out.printf("Multiplication: %.2f x %.2f = %.2f %n",num1,num2, num1*num2);
        System.out.printf("Division: %.2f / %.2f = %.2f %n",num1,num2, num1/num2);

        myObj.close();
    }
};
