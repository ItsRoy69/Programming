#include <iostream>
using namespace std;

int main()
{

    int temp[10] = {1, 2};
    cout << " Size of first located in array : " << sizeof(temp) << endl;
    cout << " Size of value of first located in array : " << sizeof(*temp) << endl;
    cout << " Size of value of first located in array using & :" << sizeof(&temp) << endl;

    int *ptr = &temp[0];
    cout << " Size of  array after declaring pointer : " << sizeof(ptr) << endl;
    cout << " Size of value inside array after declaring pointer : " << sizeof(*ptr) << endl;
    cout << " Size of value first located  after declaring pointer : "  << sizeof(&ptr) << endl;

    return 0;
}