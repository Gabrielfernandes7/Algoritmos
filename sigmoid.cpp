#include <iostream>
#include <cmath>
#include <locale>
#define e 2.718281828

int main(void)
{
	setlocale(LC_ALL, "portuguese");
	/*
		Isto é a função sigmoide

		f(x) = 1 / (1 - e^(-y))

	*/
	
	float Sigmoid;
	float y;
	
	std::cout << "Entre com o valor para calcular a função sigmóide " << "\n";
	
	std::cin >> y;
	
	
	Sigmoid = 1/(1-pow(e,-y));
	
	std::cout << "Sigmoid(" << y << ") = " << Sigmoid;
	
	getchar();
}
/*
float Sigmoid(float x){
	
	
	float sigmoide_x;
	float y;
	
	std::cout << "Entre com o valor para calcular a função sigmóide ";
	
	std::cin >> y;
	
	std::cout << "Sigmoid(" << y <<")";
	
	sigmoide_x = 1/(1-pow(e,-y));
	
	return sigmoide_x;
}
*/

/*float Sigmoid(float x);
	float input, output;
	
	std::cout << "Funcao sigmoide" << std::endl;
	std::cin >> input;
	fflush(stdin);
	
	output = Sigmoid(input);
	
	std::cout << "Sigmf(" << input << ") = " << output;
	
	std::cout << "\n";
*/
