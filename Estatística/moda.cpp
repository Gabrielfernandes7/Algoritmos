#include <iostream>

//Moda para variáveis discretas

float moda_result(int observacoes)
{
  int n = 0;
	float moda[n] = {};
	int c[n];
	int i, j, m, cont, obs;
	
	cont = 0;
	
	std::cout << "Quantos números possui a lista " << std::endl;
	std::cin >> obs;
	
	for (i = 1; i <= obs; i++)
	{
		std::cout << "N[" << i << "] = ";
		std::cin >> moda[i];
		c[i] = 0;
	}
	for(i=1;i<=obs;i++){
		for(j=1;j<=obs;j++)
		{
			if((moda[i] == moda[j]) && (i != j))
				c[i] = c[i] + 1;
			if((c[i] == c[j]) && (i != j) && (moda[i] == moda[j]))
				c[i] = 0;
		}
	}
	for(i=1;i<=obs;i++)
	{
		if(c[i] == 0)
			moda[i] = 0;
	}
	for(i=1;i<=obs;i++)
	{
		if(moda[i] != 0)
			cont = cont + 1;
	}
	for (m = 1; m <= ((int)cont / 2);m++)
	{
		for(i=1;i<=obs;i++)
		{
			for(j=1;j<=obs;j++)
			{
				if((moda[i] == moda[j]) && (i != j))
					c[i] = c[i] + 1;
				if((c[i] == c[j]) && (i != j) && (moda[i] == moda[j]))
					c[i] = 0;
			}
			if(c[i] == 0)
				moda[i] = 0;
		}
	}
	for(i=1;i<=obs;i++)
	{
		if(moda[i] != 0)
			std::cout << "A moda = " << moda[i] << std::endl;
	}
	return moda[i];
}

int main(void)
{
	int obs_input;
	float moda_result(int observacoes);
	std::cin >> obs_input;
	std::cout << moda_result(obs_input);
	getchar();
}
