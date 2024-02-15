import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(5);
            list1.add(7);
            System.out.println(StreamMethods.getAverage(list1));

            List<String> list2 = new ArrayList<>();
            list2.add("aAA");
            list2.add("bbbb");
            list2.add("cC");
            list2.add("d");
            List<String> list2_1;
            list2_1 = StreamMethods.toUpperAndNew(list2);
            StreamMethods.printList(list2_1);
            System.out.println('\n');
            StreamMethods.toUpperNew(list2);
            StreamMethods.printList(list2);
            System.out.println('\n');

            List<Double> list3 = new ArrayList<>();
            list3.add(4.0);
            list3.add(3.0);
            list3.add(2.0);
            list3.add(2.0);
            StreamMethods.printList(StreamMethods.nonRepeatedSquaresSum(list3));
            System.out.println('\n');

            List<String> list4 = new ArrayList<>();
            List<String> li;
            list4.add("foo");
            list4.add("loo");
            list4.add("laop");
            list4.add("lzd");
            li = StreamMethods.findAndSort(list4, 'l');
            StreamMethods.printList(li);
            System.out.println('\n');

            List<Double> list5 = new ArrayList<>();
            list5.add(4.0);
            list5.add(1.7);
            System.out.println(StreamMethods.getLast(list5));

            int[] arr1 = {1, 5, 3};
            System.out.println(StreamMethods.getEvenSum(arr1));
            int[] arr2 = {2, 4, 6, 7};
            System.out.println(StreamMethods.getEvenSum(arr2));

            List<String> list6 = new ArrayList<>();
            list6.add("apple");
            list6.add("iron");
            list6.add("car");
            Map<Character, String> res = StreamMethods.strToMap(list6);
            StreamMethods.printMap(res);
        } catch (TechException e) {
            System.err.println(e.getMessage());
        }
    }
}