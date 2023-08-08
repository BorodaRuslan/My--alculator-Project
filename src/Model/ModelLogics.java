package Model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ModelLogics {
    public static Scanner scanner = new Scanner(System.in);
   public static Map<String, IntStream> saveData = new HashMap<>();
    public static StringBuilder stringBuilder = new StringBuilder();








    public static String plus(ArrayList<Integer> numbers){
        IntStream resultSum = numbers.stream()
                .mapToInt(a -> a + a);
        String resultStr = numbers.stream()
                .map(Objects::toString)
                .collect(Collectors.joining(" +"));

        saveData.put(resultStr, resultSum);

        return stringBuilder.append(resultStr).append(" + ").append(" = ").append(resultSum).toString();


    }


}
