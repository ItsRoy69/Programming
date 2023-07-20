#include <iostream>
using namespace std;

int main()
{
    int a[20] = {1, 2, 3, 5};
    // address using &
    cout << " ->" << &a[0] << endl;
    cout << &a << endl;
    cout << a << endl;

    // address using pointer
    int *p = &a[0];
    cout << p << endl;
    cout << *p << endl;
    cout << "-> " << &p << endl;

    //ERROR when you want to increase array or try to symbol table but we can use pointer
   //arr = arr+1;

    int *ptr = &arr[0];
    cout << ptr << endl;
    ptr = ptr + 1;
    cout << ptr << endl;

    return 0;
}