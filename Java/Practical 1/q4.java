import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = myObj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d %n",num,i,num*i);
        }
        myObj.close();
    }
};
