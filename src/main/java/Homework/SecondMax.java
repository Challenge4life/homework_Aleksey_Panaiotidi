package Homework;

public class SecondMax {
    public static void main(String[] args){
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        Integer secondMax = findSecondMaxElement(arr);

        if (secondMax != null) {
            System.out.println("Второй по величине элемент: " + secondMax);
        }
    }
    public static Integer findSecondMaxElement(int[] arr) {

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == max) {
            return null;
        } else {
            return secondMax;
        }
    }
}