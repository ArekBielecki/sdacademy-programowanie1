package Zadania;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercise8 {
    private static Random random = new Random();
    private static Integer[] array;

    public static void main(String[] args) {
        array = new Integer[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        Map<Integer, Long> counts =
                Arrays.asList(array)
                        .stream()
                        .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        int sum = counts
                .values()
                .stream()
                .mapToInt(Long::intValue)
                .sum();
        Map<Integer, Integer> counts2 = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(counts2.containsKey(array[i])){
                counts2.put(array[i], counts2.get(array[i]) + 1);
            }else{
                counts2.put(array[i], 1);
            }
        }
        System.out.println(counts);
        System.out.println(counts2);
        int sum2 = 0;
        for(Integer value : counts2.values()){ //jak to zrobić za pomocą streama
            sum2 +=value;
        }
        System.out.println(sum);
        System.out.println(sum2);

    }
}
