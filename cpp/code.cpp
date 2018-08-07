 #include <iostream>

using std::cout;
using std::cin;

//function declaration
int factorial();
int fibonacci();

int main()
{

  int answer;

  cout << "Menu:" << "\n";
  cout << "1. Factorial Calculator" << "\n";
  cout << "2. Fibonacci Calculator" << "\n";
  cin >> answer;

  if (answer == 1)
    {
      factorial();
    }
  if (answer == 2)
    {
      fibonacci();
    }


  return 0;
}


int factorial()
{
   int x;
  long factorial = 1;

  cout << "Please Enter a Positive Integer: ";
  cin >> x;

  for (int i = 1; i <= x; i++)
  {
    factorial *= i;
  }

  cout << "The Factorial of " << x << " = " << factorial << "\n" ;

  return 0;
}

int fibonacci()
{
  int n, x, t1 = 0, t2 = 1, nextTerm = 0;

  cout << "Enter the Number of Terms You Wish to See: ";
  cin >> n;

  cout << "Fibonacci Series: ";

  for (x = 0; x < n; x++)
    {
      if (x <= 1)
	{
	  nextTerm = x;
	}
      else 
	{
	  nextTerm = t1 + t2;
	  t1 = t2;
	  t2 = nextTerm;
	}
      

      cout << nextTerm << " ";
      
    }

  return 0;
}
