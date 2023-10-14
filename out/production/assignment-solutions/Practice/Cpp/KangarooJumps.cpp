#include <iostream>
using namespace std;

class Kangaroo {
    public:
     string kangarooJumps(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
           return "NO";
       }
       if ((x2 - x1) % (v1 - v2) == 0) {
           return "YES";
       } else {
           return "NO";
       }
     }
};

int main () {
    int x1 = 0, v1 = 2, x2 = 3, v2 = 5;
    Kangaroo k;
    cout << k.kangarooJumps(x1,v1,x2,v2);
    return 0;
}