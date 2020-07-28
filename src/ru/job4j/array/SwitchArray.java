package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        boolean sourceFault = source >= array.length || source < 0;
        boolean destFault = dest >= array.length || dest < 0;

        if (sourceFault || destFault) {
            return null;
        }

        int[] resultArray = array.clone();

        int temp = resultArray[source];
        resultArray[source] = resultArray[dest];
        resultArray[dest] = temp;

        return resultArray;
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
