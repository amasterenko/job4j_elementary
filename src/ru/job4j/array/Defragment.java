package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                int notNullIndex = index;
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int j = index + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        notNullIndex = j;
                        break;
                    }
                }
                SwitchArray.swap(array, point, notNullIndex);
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
