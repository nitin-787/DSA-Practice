#include <iostream>
#include <vector>
using namespace std;

class PlusOne {
public:
    vector<int> plusOne(vector<int>& arr) {
        int n = arr.size();
        for (int i = n - 1; i >= 0; i--) {
        if (arr[i] < 9) {
            arr[i] = arr[i] + 1;
            return arr;
        } else {
            arr[i] = 0;
        }
    }
    
    vector<int> ans(n + 1, 0);
    ans[0] = 1;
    return ans;
    }
};

int main () {
    vector<int> arr = {1,1,9};
    PlusOne PlusOne;
    vector<int> ans = PlusOne.plusOne(arr);
    for (int i = 0; i < ans.size(); i++) {
        cout << ans[i] << " ";
    }
    return 0;
}