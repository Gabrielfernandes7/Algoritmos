#include <iostream>

// Algoritmo de Ordenação BubbleSort

// Pior caso O(n²)

void troca(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

void BubbleSort(int *v, int n){
    if (n < 1) return;

    int i;
    for(i=0; i < n; i++){
        if(v[i] > v[i+1]){
            troca(&v[i], &v[i+1]);
        }
    }
    BubbleSort(v, n-1);
}

int main(void)
{
    int tam, i, *v;

    std::cout << "Entre com o tamanho" << std::endl;
    std::cin >> tam;

    v = (int*)malloc(tam*sizeof(int));
    
    //Entre com o tamnho do vetor
    for ( i = 0; i < tam; i++){
        std::cin >> v[i];
    }
    
    BubbleSort(v, tam-1);
    
    for ( i = 0; i < tam; i++)
    {
        std::cout << v[i] << "\t";
    }
    
    getchar();
}
