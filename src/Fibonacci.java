import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Podaj index: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        System.out.println(fibonacci(index));
    }
    private static int fibonacci(int index){
        int firstDigit = 0;
        int secondDigit = 1;
        int finalDigit = 1;

        for(int i = 1; i <= index; i++){
                if( i>= 3){
                    finalDigit = firstDigit + secondDigit;
                    firstDigit = secondDigit;
                    secondDigit = finalDigit;
                }
            }
        if(index == 1){
            return 0;
        }
        else if(index == 2){
            return 1;
        }
        else{
            return finalDigit;
        }
    }
}
