#include <iostream>
unsigned int Fibonacci(unsigned int n){
	int antes = -1;
	int resultado = 1;
	unsigned int i = 0;
	for(i = 0; i <= n; ++i){
		int const soma = antes + resultado;
		antes = resultado;
		resultado = soma;
	}
	return resultado;
}
int main(int argc, char **argv)
{
	unsigned int n;
	std::cin >> n;
	std::cout << Fibonacci(n);
	getchar();
}

