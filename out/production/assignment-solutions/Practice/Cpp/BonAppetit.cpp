#include <iostream>
#include <vector>
using namespace std;

// link: https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true         

void bonAppetit(const vector<int>& bill, int k, int b) {
    int totalBill = 0;
    for (int i = 0; i < bill.size(); i++) {
        if (i != k) {
            totalBill += bill[i];
        }
    }
        
    int annaPortion = totalBill / 2;
    if (b == annaPortion) {
        cout << "Bon Appetit" << endl;
    } else {
        int refundAmount = b - annaPortion;
        cout << refundAmount << endl;
    }
}

int main() {
    vector<int> list = {3, 10, 2, 9};
    int k = 4, b = 1;
    bonAppetit(list, k, b);
    return 0;
}
