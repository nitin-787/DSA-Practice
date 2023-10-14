#include <vector>
#include <iostream>
using namespace std;

// link : https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true


class BirthdayCakeCandles {
public:
    int birthdayCakeCandles(vector<int>& arr) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] > num) {
                num = arr[i];
                count = 1; // Reset the count if a larger number is found
            } else if (arr[i] == num) {
                count++; // Increment the count if the same largest number is found again
            }
        }
        return count;
    }
};

int main() {
    vector<int> arr = {3,1,2,3};
    BirthdayCakeCandles bc;
    std::cout << bc.birthdayCakeCandles(arr);
}