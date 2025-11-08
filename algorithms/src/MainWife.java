import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainWife {
    public static void main(String[] args) {
//        System.out.println(sumOfNumbers(new ArrayList<>(List.of(3,5,1))));
//        System.out.println("Length: " + lengthOfList(new ArrayList<>(List.of(1,1,2, 3,5,1,4))));

        System.out.println("Quick Sort: " + quicksort(Arrays.asList(10, 5, 2, 3)));
    }

    private static List<Integer> quicksort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            Integer pivot = array.get(0);

            List<Integer> less = array.stream()
                    .filter(el -> el < pivot)
                    .toList();

            List<Integer> greater = array.stream()
                    .filter(el -> el > pivot)
                    .toList();

            List<Integer> t =  new ArrayList<>();
            t.addAll(quicksort(less));
            t.add(pivot);
            t.addAll(quicksort(greater));

            return t;
        }
    }









// [ 1 + 5 + 3]
    // [1, 1, 5, 6] = 4
    public static int sumOfNumbers(ArrayList<Integer> number){
        if(number.isEmpty()){
            return 0;
        } else {
            int prevNum = number.get(0);
            number.remove(0);

            return prevNum + sumOfNumbers(number);
        }
    }

    public static int lengthOfList(ArrayList<Integer> number){
        if(number.isEmpty()){
            return 0;
        } else {
            int prevNum = 1;
            number.remove(0);

            var result = lengthOfList(number);

            return prevNum + result;
        }
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder out = new StringBuilder("");
        int currentChar = 0;

        while(true) {
            for(String s : strs) {
                for(int i = 0; i < s.toCharArray().length && i <= currentChar; i++) {
//                    out.toString().toCharArray()[currentChar]
                }
            }

        }

    }
}
