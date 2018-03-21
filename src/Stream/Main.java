package Stream;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "5 series", "White", 100));
        cars.add(new Car("Opel", "Vectra", "Black", 83));
        cars.add(new Car("Mercedes", "C-class", "Red", 61));
        cars.add(new Car("Porsche", "Cayman", "Blue", 125));

        cars.stream()
                .sorted(Comparator.comparing(car -> car.getColor().toString()))
                .forEach(System.out::println);
        System.out.println("-------------");

        List<Car> listOfBlackCars = cars.stream()
                .filter(car -> car.getColor().equals("Black"))
                .collect(Collectors.toList());
        listOfBlackCars.forEach(System.out::println);

        System.out.println("-----------");

        Map<Car, String> mapOfCars = cars.stream().filter(car ->
            car.getModel().toLowerCase().contains("m")
            || car.getMake().toLowerCase().contains("m"))
                .collect(Collectors.toMap(
                        car -> car,
                        car -> car.getColor()));

        System.out.println(mapOfCars);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2012);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
}
}
