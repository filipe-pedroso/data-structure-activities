#include <iostream>
using namespace std;
#define MAX 10

class Lista{
  private:
    int v[MAX];
    int n;

  public:
    Lista(){
      n = 0;
    }

    bool insere(int num){
      // dá para inserir?
      if ( n >= MAX ){
        return false;
      }
      //qual posição?
      int k=0;
      for(k=0; k < n && v[k] <= num; k++);
      //desloca elementos
      for (int i=n-1; i >= k ; i-- ){
        v[i+1] = v[i];
      }
      //insere
      v[k] = num;
      //n++
      n++;
      return true;
    }
    
    void imprimeTudo(){
      for(int i=0; i<n; i++){
        cout << v[i] << " ";
      }
    }
};


int main() {
  Lista l;
  int i=0;
  l.insere(1);
  l.insere(5);
  l.insere(7);
  l.insere(9);
  l.insere(6);
  l.imprimeTudo();
}