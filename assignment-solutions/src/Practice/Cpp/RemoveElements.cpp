#include <vector>
#include <iostream>
using namespace std;

// link:  https://leetcode.com/problems/remove-element/

class RemoveElements {
    public:
    int removeElements(vector<int>& arr, int val) {
        int k = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
};

int main() {
    vector<int> arr = {0,1,2,2,3,0,4,2};
    int val = 2;
    RemoveElements rm;
    std::cout << rm.removeElements(arr, val);
}