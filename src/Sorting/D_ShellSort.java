package Sorting;

public class D_ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int jarak, i, j;
        boolean Sudah;
        int temp;
        jarak = n;

        while (jarak >=1 ){
            jarak = jarak /2;
            Sudah = true;
            while(Sudah){
                Sudah = false;
                for(j=0; j<n-jarak; j++){
                    i=j+jarak;
                    if (arr[j]>arr[i]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        Sudah = true;
                    }
                }
            }
        }

    }
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] D = {25,7,9,13,3};
        D_ShellSort.tampil(D);
        D_ShellSort.shellSort(D);
        D_ShellSort.tampil(D);
        
        System.out.println();
        System.out.println("Ayikwati Muhfiyati");
    }
}

