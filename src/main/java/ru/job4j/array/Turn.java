package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        if (array == null) {
            array = new int[]{};
        }
        int length = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        return array;
    }
}
