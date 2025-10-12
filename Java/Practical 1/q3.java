import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = myObj.nextInt();
        if ((num&1) == 0) {
            System.out.printf("%d is Even.", num);
        }
        else{
            System.out.printf("%d is Odd.", num);
        }
        myObj.close();
    }
};
