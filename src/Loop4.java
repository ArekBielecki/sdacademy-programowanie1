import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wielkość X: ");
        int size = input.nextInt();
        for (int i = 0; i <= size-1; i++) {
            for (int j = 0; j <= size-1; j++){
                if(j==i||j==size-1-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
