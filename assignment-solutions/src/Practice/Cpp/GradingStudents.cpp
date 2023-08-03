#include <iostream>
#include <vector>
using namespace std;

class GradingStudents {
public:
    vector<int> gradingStudents(vector<int> grades) {
        vector<int> result;
        for (int i : grades) {
            int multiple_of_5 = (i / 5 + 1) * 5;
            if (multiple_of_5 - i < 3 && i >= 38) {
                result.push_back(multiple_of_5);
            } else {
                result.push_back(i);
            }
        }
        return result;
    }
};

int main() {
    vector<int> marks = {73, 67, 38, 33};
    GradingStudents gs;
    vector<int> roundedGrades = gs.gradingStudents(marks);
    for (int grade : roundedGrades) {
        cout << grade << " ";
    }
    return 0;
}
