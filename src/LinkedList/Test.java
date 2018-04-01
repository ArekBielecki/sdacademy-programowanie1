package LinkedList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        Scanner input = new Scanner(System.in);
        String index;

        while (true) {
            System.out.print("1 - Wyświetl listę\n2 - Dodaj element\n3 - Usuń element\n4 - Wyświetl element na podstawie indeksu\n" +
                    "Inny numer - wyjście\n");
            switch (Integer.parseInt(input.nextLine())) {
                case 1:
                    list.printList();
                    System.out.println("Rozmiar listy: " + list.getSize());
                    System.out.println("--------------");
                    break;
                case 2:
                    System.out.println("Wpisz text: ");
                    String text = input.nextLine();
                    System.out.println("Podaj index lub wciśnij ENTER, aby dodać na końcu listy");
                    index = input.nextLine();
                    if (index.equals("")) {
                        list.add(text);
                    } else {
                        list.add(text, Integer.parseInt(index));
                    }
                    break;
                case 3:
                    System.out.println("Podaj index: ");
                    index = input.nextLine();
                    list.remove(Integer.parseInt(index));
                    break;
                case 4:
                    System.out.println("Podaj index: ");
                    index = input.nextLine();
                    if(index.equals("")){
                        break;
                    }
                    else{
                        System.out.println(list.get(Integer.parseInt(index)));
                        break;
                    }

                default:
                    System.out.println("Koniec");
                    return;
            }
        }

    }

}
