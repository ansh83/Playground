#include<iostream>
using namespace std;

void cyclicSwap(int *a, int *b);

int main()
{
    int a, b;

    
    cin >> a >> b;

    cout << "Before swapping " <<"a= "<<a<<" and "<<"b="<<b;
    
    cyclicSwap(&a, &b);

    cout << "\nAfter swapping " <<"a= "<<a<<" and "<<"b="<<b;
 
    return 0;
}

void cyclicSwap(int *a, int *b)
{
    int temp;
    temp = *b;
    *b = *a;
    *a = temp;
   
}