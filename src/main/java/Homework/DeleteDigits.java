package Homework;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class DeleteDigits {
    public static void main(String[] args){
    int[] inst = {1,2,2,3,4,5,5,6,7,8,8,9};
    getDistinctNumbers(inst);
    }
    public static void getDistinctNumbers(int[] ints) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : ints) {
            set.add(num);
        }
        int[] distinctInts = set.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(distinctInts));
    }
}
