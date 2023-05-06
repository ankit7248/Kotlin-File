#include <bits/stdc++.h>
using namespace std;

int main()
{
    int key;
    cout << "key : ";
    cin >> key;
    int l = 0;
    int size;
    cout << "Size of array :";
    cin >> size;
    int h = size - 1;
    int arr[size];
    for (int i = 0; i < size; i++)
    {
        cout << " ";
        cin >> arr[i];
    }

    sort(arr, arr + size);

    while (l <= h)
    {
        int mid = (l + h) / 2;
        if (arr[mid] == key)
        {
            cout << "key founded : ";
            cout<< mid;
        }
        else if (arr[mid] > key)
        {
            l = mid + 1;
        }
        else
        {
            h = mid - 1;
        }
    }
    return 0;
}