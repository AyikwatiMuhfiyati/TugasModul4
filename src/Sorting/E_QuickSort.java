package Sorting;

public class E_QuickSort {
    private static int partition(double[] A, int p, int r) {
        int i, j;
        double pivot;

        pivot = A[p];
        i = p - 1;
        j = r + 1;
        for (;;) {
            do {
                i++;
            } while (A[i] < pivot);
            do {
                j--;
            } while (A[j] > pivot);

            if (i < j) {
                int temp = (int) A[i];
                A[i] = A[j];
                A[j] = temp;
            } else {
                return j;
            }
        }
    }

    public static void quickSort(double[] A, int p, int r) {
        int q;
        if (p < r) {
            q = partition(A, p, r);
            quickSort(A, p, q);
            quickSort(A, q + 1, r);
        }
    }

    public static void tampil(double data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] E = {25, 7, 9, 13, 3};
        
        E_QuickSort.tampil(E);
        E_QuickSort.quickSort(E, 0, E.length-1);
        E_QuickSort.tampil(E);
        
        System.out.println();
        System.out.println("Ayikwati Muhfiyati");
    }
}
