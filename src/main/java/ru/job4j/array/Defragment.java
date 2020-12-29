package ru.job4j.array;

    public class Defragment {
        public static String[] compress(String[] array) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                    for (int j = index + 1; j < array.length; j++) {
                        if (array[j] != null) {
                            SwitchArray.swapStringArray(array, j, index);
                            break;
                        }
                    }
                }
            }
            return array;
        }

        public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (String s : compressed) {
                System.out.print(s + " ");
            }
        }

}
