import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wielkość kwadratu: ");
        int size = input.nextInt();
        for (int i = 1; i <= size; i++) {
                if(i==1||i==size){
                    for (int j = 1; j <=size; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");

                }
                else{
                    for (int j = 1; j <= size ; j++) {
                        if(j==1||j==size){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println("");

                }
        }
    }
}
