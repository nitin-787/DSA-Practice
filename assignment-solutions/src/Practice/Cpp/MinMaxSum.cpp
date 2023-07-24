#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// link: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true

void miniMaxSum(vector<int>& arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    sort(arr, arr-5);
    cout << (sum - arr[4]) << " " << (sum - arr[0]) << endl;
}

int main() {
    vector<int> arr = {1, 2, 3, 4, 5};
    miniMaxSum(arr);
    return 0;
}
