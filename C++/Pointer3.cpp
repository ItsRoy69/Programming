#include <iostream>
using namespace std;

int main()
{
    int arr[10] = {23, 122, 41, 67};

    cout << "Address of first block is" << arr << endl;
    cout << arr[0] << endl; // value of 0th index
    cout << "Address of array is" << &arr[0] << endl;

    cout << "1st value of array :" << *arr << endl;         // walue of 0th location
    cout << "Value of 0th index + 1 :" << *arr + 1 << endl; // here it will be 3
    cout << "Value of 1st location :" << *(arr + 1) << endl;
    cout << "Value of oth location + 1 :" << (*arr) + 1 << endl;
    cout << "Value of 2nd indexed array  :" << arr[2] << endl;
    cout << "Value of 2nd indexed array  :" << *(arr + 2) << endl;

    return 0;
}