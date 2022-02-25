package veredasort;

/**
 * Este es un ejemplo
 * @author alopez
 */
public class veredasort {
    public static void veredasort(int A[], int izq, int der) {

        int pivote=A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i < j){
            while(A[i] <= pivote && i < j) i++;
            while(A[j] > pivote) j--;
            if (i < j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];
        A[j]=pivote;

        if(izq < j-1)
            veredasort(A,izq+1,j-1);
        if(j+1 < der)
            veredasort(A,j+1,der-1);

    }

    /**
     * Este metodo lo que hace es imprimir por pantalla

     * @author antonio lopez
     */
    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int array[] = {7, 5, 1, 2, 3, 6, 4};
        System.out.print("Unsorted Array: ");
        print(array);

        veredasort(array,0,array.length -1);
        System.out.print("Final Output veredasort: ");
        print(array);


        array = new int[]{17, 5, 7, 11, 13, 2, 3, 1, 19};
        System.out.print("Unsorted Array: ");
        print(array);

        veredasort(array,0,array.length -1);
        System.out.print("Final Output veredasort: ");
        print(array);
    }
}
