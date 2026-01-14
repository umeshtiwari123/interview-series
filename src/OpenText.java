import java.util.Scanner;

public class OpenText {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 50000");

        int n = scanner.nextInt();

        if(n>=1 && n<=50000) {
            int sum = sumOfDigits(n);

            while (true) {
                int sum1 = sumOfDigits(++n);

                if (sum == sum1) {
                    System.out.println(n);
                    break;
                }
            }
        }else{
            System.out.println("Invalid Input");
        }
    }

    static int sumOfDigits(int num) {

        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum = sum + rem;
            num = num / 10;
        }
        return  sum;
    }

}
