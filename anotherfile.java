import java.util.List;
import java.util.LinkedList;

/**
 * Created by arnolf on 2017-05-04.
 */
public class anotherfile {
    //A comment
    List<Integer> list;

    public anotherfile() {
        list = new LinkedList<>();
    }

    private int[] sortList(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;

            for (j = i-1; j >= 0 && temp < list[j]; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp;
        }

        return list;
    }

    private void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    public static void main(String[] args) {
        anotherfile t = new anotherfile();
        int[] a = {5, 9, 5, 7, 8, 1, 4, 17, 9, 10, 2, 3, 6};

        System.out.println("A: \n");
        t.printArray(a);

        int[] b = t.sortList(a);

        System.out.println("\nB: \n");
        t.printArray(b);
    }
}