package classes.week03;

class No {
    public int valor;
    public No anterior;
    public No proximo;
}

interface ILista {
    boolean insere(int valor);
    boolean remove(int idx);
    void imprime();
    void imprimeReverso();
    int busca(int valor);
}

class Ldde implements ILista {
    private No primeiro = null;
    private No ultimo = null;
    private int n = 0;

    
    public boolean insere(int valor) {
        
        No novo = new No();
        novo.valor = valor;
        novo.anterior = null;
        novo.proximo = null;

        No anterior = null;
        No atual = primeiro;

        while(atual != null && atual.valor < valor && atual != anterior){
            anterior = atual;
            atual = atual.proximo;
        }

        if (anterior != null){
            anterior.proximo = novo;
        }
        else{
            primeiro = novo;
        }

        novo.anterior = anterior;
        novo.proximo = atual;

        if(atual != null){
            atual.anterior = novo;
        }
        else{
            ultimo = novo;
        }

        return false;

    }

    
    public boolean remove(int idx) {
        No atual = this.primeiro;
        No anterior = null;
        int i;
        for(i = 0; atual != null && i != idx; i++ ){
        anterior = atual;
        atual = atual.proximo;
        }
        if (atual == null) {
        return false;
        }
        
        No proximo = atual.proximo;
        if(anterior != null){
        anterior.proximo = proximo;
        } else{
        primeiro = proximo;
        }
        if (proximo != null){
        proximo.anterior = anterior;
        } else{
        ultimo = anterior;
        }
        
        return true;
    }

    
    public void imprime() {
        No atual = primeiro;
        while(atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    
    public void imprimeReverso() {
        No atual = ultimo;
        while(atual != null) {
            System.out.println(atual.valor);
            atual = atual.anterior;
        }
    }

    
    public int busca(int valor) {
        No atual = primeiro;
        for (int indice=0; atual != null; indice++){
            if (valor == atual.valor){
                return indice;
            }else{
                atual = atual.proximo;
            }
        }
        return -1;
    }


}


public class LDDE {
    public static void imprime(ILista l) {
        l.imprime();
    }
    public static void main(String[] args) {
        ILista l = new Ldde();
        l.insere(37);
        l.insere(25);
        l.insere(1);
        l.insere(55);
        l.insere(777);
        imprime(l);
    }
}
