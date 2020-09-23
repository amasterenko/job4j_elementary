package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        if (source >= array.length || source < 0 || dest >= array.length || dest < 0) {
            return new int[]{};
        }
        int[] output = array.clone();
        int temp = output[source];
        output[source] = output[dest];
        output[dest] = temp;
        return output;
    }

    public static String[] swap(String[] array, int source, int dest) {
        if (source >= array.length || source < 0 || dest >= array.length || dest < 0) {
            return new String[]{};
        }
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
