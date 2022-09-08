#include <iostream>

#define MAX 10

using namespace std;

class Vetor {

  private:

    int n;
    int V[MAX];

  public:

    Vetor();
    bool insere(int n);
    void print();

};

Vetor::Vetor(){
  n = 0;
}

bool Vetor::insere(int num){
  if(n >= MAX){
    return false;
  }
  int index;
  for(index = 0; index < n && V[index] <= num; index++);
  for(int i {n-1}; i >= index; i--){
    V[i + 1] = V[i];
  }
  V[index] = num;
  n++;
  return true;
}

void Vetor::print(){
  for(unsigned i {0}; i < n; i++){
    cout << i << ": " << V[i] << endl;
  }
  cout << endl;
}

int main(){
  Vetor v;
  int i {0};
  while(cin >> i){
    if(!v.insere(i)){break;}
    
  }
  v.print();
}