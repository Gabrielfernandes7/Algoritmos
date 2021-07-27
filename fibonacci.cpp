#include <iostream>

//Saber o valor do termo correspondente na sequencia de fibonacci

int Fib(int n){
	if (n < 2){
		return n;
	}
	else{
		return (Fib(n-1) + Fib(n-2));
	}
}

int main(void)
{
	int Fib(int n);
    int termos;
    std::cout << "Entre com a quantidade de termos" << "\n";
    std::cin >> termos;
    
    std::cout << "\n";
    
    if(termos < 0){
		std::cout << "A quantidade de termos não pode ser negativa";
	}
	else{
		std::cout << "O termo " << termos << " e o " << Fib(termos) << " na sequencia"<< std::endl;
	}

    getchar();
}


