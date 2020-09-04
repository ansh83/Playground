#include <iostream>
using namespace std;

int main()
{
int number1, number2, smallest ;

cin>>number1;

cin>>number2;
    
if(number1<number2)
{
smallest=number1;
}
else
{
smallest=number2;
}
cout<<smallest<<" is smallest number";
return 0;
}