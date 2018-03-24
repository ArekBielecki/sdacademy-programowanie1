package Zadania;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        String number;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Podaj PESEL: ");
            try{
                number = numberValidator(input.nextLine());
            }
            catch (NumberFormatException e){
                continue;
            }
            break;
        }
        int[]array = createArrayOfPeselDigits(number);
        if(peselValidator(array)){
            System.out.println("Numer poprawny");
        }
        else{
            System.out.println("Numer niepoprawny");
        }
    }
    private static boolean peselValidator(int [] array){
        int sum = 0;
        int factor = 1;
        for (int i = 0; i < 10; i++) {
            sum += array[i]*factor;
            factor = (factor+2)%10;
            if(factor == 5){
                factor = (factor+2)%10;
            }
        }
        sum %= 10;
        if(sum!=0){
            sum = 10 - sum;
        }
        if(sum == array[10]){
            return true;
        }
        else{
            return false;
        }
    }


    private static int[] createArrayOfPeselDigits(String number){
        int[] array = new int[number.length()];
            long peselNumber = Long.parseLong(number);
            for(int i = number.length() - 1; i >= 0; i--){
                array[i] = (int)(peselNumber % 10);
                peselNumber = peselNumber/10;
            }
            return array;
    }


    private static String numberValidator(String number){
        if(number.length()!=11){
            System.out.println("Numer PESEL musi zawierać 11 cyfr");
            throw new NumberFormatException();
        }
        if(number.matches("[0-9]+")){
            return number;
        }
        else{
            System.out.println("Numer musi zawierać wyłącznie cyfry");
            throw new NumberFormatException();
        }
    }
}
