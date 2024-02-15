import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void printList(List<?> list) throws TechException {
        try {
            list.forEach(n -> System.out.print(n + " "));
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }
    public static void printMap(Map<?, ?> map) throws TechException {
        try {
            map.forEach((key, value) -> System.out.print(key + " " + value + " "));
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }
    public static double getAverage(List<Integer> list) throws TechException {
        try {
            return (double) list.stream().reduce((x, y) -> x + y).get() / list.size();
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }
    // первая реализация приведения строк
    public static List<String> toUpperAndNew(List<String> list) throws TechException {
        try {
            return list.stream().map(n -> "_new_" + n.toUpperCase()).collect(Collectors.toList());
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }
    // вторая реализация приведения строк
    public static void toUpperNew(List<String> list) throws TechException {
        try {
            List<String> term= new ArrayList<>();
            term.addAll(list);
            list.clear();
            list.addAll(term.stream().map(n -> "_new_" + n.toUpperCase()).toList());
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }
    public static List<Double> nonRepeatedSquaresSum(List<Double> list) throws TechException {
        try {
            Map<Double, Long> count = list.stream().collect(Collectors.groupingBy(n -> n,
                    Collectors.counting()));
            return count.entrySet().stream().filter(entry -> entry.getValue() == 1)
                    .map(Map.Entry::getKey).map(x -> x * x).toList();
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }

    public static List<String> findAndSort(List<String> list, char letter) throws TechException {
        try {
            return list.stream().filter(n -> n.toCharArray()[0] == letter).sorted().toList();
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }

    public static <T> T getLast(List<T> list) throws TechException {
        try {
            return list.stream().reduce((x,y) -> y).get();
        } catch (Exception e) {
            throw new TechException("Collection is empty");
        }
    }

    public static int getEvenSum(int[] arr) throws TechException {
        try {
            return Arrays.stream(arr).filter(n -> n % 2 == 0).reduce((x,y) -> x+y).getAsInt();
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    public static Map<Character, String> strToMap(List<String> list) throws TechException {
        try {
            return list.stream().collect(Collectors.toMap(n -> n.toCharArray()[0], n -> n.substring(1)));
        } catch (Exception e) {
            throw new TechException("Something went wrong" + e.getMessage());
        }
    }
}
