import java.util.Arrays;

public class DizilerdeTekrarEdenCiftSayi {

    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i==value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {3, 7, 3, 61, 6, 61, 2, 58, 36, 12, 5, 35, 6, 12, 28, 36, 48};
        int[] duplicate = new int[array.length];
        int startIndex=0;
        for (int i=0; i<array.length;i++) {
            for (int j=0; j<array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    if ((array[j] % 2 ==0 ) && !isFind(duplicate, array[i])) {
                        duplicate[startIndex++]=array[j];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));}}







