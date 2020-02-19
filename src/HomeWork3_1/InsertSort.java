package HomeWork3_1;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {

        int[]array = {2,6,9,12,34,46,1,7,5,9};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length ; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            } array[i + 1] = value;
        } System.out.println(Arrays.toString(array));
    }
}
