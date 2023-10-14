#include <iostream>
#include <vector>
using namespace std;

class TwoSum {
public:
    vector<int> twoSum(vector<int>& arr, int target) {
        int n = arr.size();
        vector<int> result(2, -1); // Initialize with default values size = 2, values -1, -1

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
};

int main() {
    TwoSum t;
    vector<int> arr = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = t.twoSum(arr, target);

    cout << result[0] << " " << result[1] << endl;

    return 0;
}
