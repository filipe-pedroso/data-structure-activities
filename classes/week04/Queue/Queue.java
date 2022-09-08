interface IFila{
    boolean enfileira(int x);
    int desenfilera() throws Exception;
    boolean isEmpty();
}

class FilaEstCircular implements IFila{
    private int lista[];
    public int TAM;
    private int inicio, fim;

    public FilaEstCircular(int TAM){
        lista = new int [TAM+1];
        this.TAM = TAM+1;
    }

    public boolean enfileira(int x){
        if ((fim+1)%TAM == inicio) {
            return false;
        }
        lista[fim] = x;
        fim = (fim+1)%TAM;

        return true;
    }

    public int desenfilera() throws Exception{
        if (inicio == fim) {
            throw new Exception("PAN!!!");
        }
        int t = lista[inicio];
        inicio = (inicio+1)%TAM;

        return t;
    }

    @Override
    public boolean isEmpty() {
        return inicio == fim;
    }
}

public class Queue {
    public static void main(String[] args) throws Exception {
        IFila f = new FilaEstCircular(5);
        f.enfileira(5);
        f.enfileira(2);
        f.enfileira(7);
        f.enfileira(1);
        f.enfileira(3);
        f.enfileira(3);
        f.enfileira(3);
        f.enfileira(3);
        f.enfileira(3);
        while (!f.isEmpty() ){
            int x = f.desenfilera();
            System.out.println(x);
        }
    }
}
