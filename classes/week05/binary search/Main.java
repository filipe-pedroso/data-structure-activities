import java.util.Arrays;
import java.util.Random;

public class Main {

    static int [] criaVetor(int n){
        int x[] = new int[n];

        Random r = new Random();
        for (int i=0; i<n; i++){
            x[i] = r.nextInt() % 1000;
        }
        return x;
    }

    static void imprime(int v[]){
        for (int i : v) {
            System.out.printf("%d", i);
        }
        System.out.println();
    }

    static int buscaLinear(int v[], int el){
        for (int i=0; i<v.length; i++){
            if (v[i] == el){
                return i;
            }
        }
        return -1;
    }

    static int buscaBinariaRec(int v[], int i, int f, int el) {
        if(i>f){
            return -1;
        }
        int p = (i+f)/2;
        if (el<v[p]) {
            return buscaBinariaRec(v, i, p-1, el);
        }else if (el>v[p]) {
            return buscaBinariaRec(v, i, p-1, el);
        }else {
            return p;
        }
    }

    static int buscaBinaria(int v[], int el){
        int i=0;
        int f=v.length-1;

        while (i<=f) {
            int p = (i+f)/2;
            if (el>v[p]) {
                i = p+1;
            }else if (el<v[p]) {
                f = p-1;
            }else {
                return p;          
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        for (int n=10000;n<10000000;n+=10000){
            int v[] = criaVetor(n);
            Arrays.sort(v);

            long inicio = System.nanoTime();
            int aa = buscaLinear(v, 750);
            long linearStep = System.nanoTime();
            int bb = buscaBinaria(v, 750);
            long binariaStep = System.nanoTime();
            int c = aa*bb;
            System.out.printf("%d\t%d\t%d\n", n, linearStep-inicio, binariaStep-linearStep);
            //imprime(v);
        }
    }
}