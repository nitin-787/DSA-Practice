#include <iostream>
#include <sstream>
#include <iomanip>

#include <bits/stdc++.h>
using namespace std;

string convertToMilitaryTime(string time) {
    int hours, minutes, seconds;
    char period;
    stringstream ss(time);
    char colon;

    ss >> hours >> colon >> minutes >> colon >> seconds >> period;

    if (period == 'P' || period == 'p') {
        if (hours != 12)
            hours += 12;
    } else if (period == 'A' || period == 'a') {
        if (hours == 12)
            hours = 0;
    }

    stringstream militaryTime;
    militaryTime << setfill('0') << setw(2) << hours << ":"
                 << setfill('0') << setw(2) << minutes << ":"
                 << setfill('0') << setw(2) << seconds;

    return militaryTime.str();
}

int main() {
    string timeAM = "09:15:23AM";
    string timePM = "03:45:37PM";

    string militaryTimeAM = convertToMilitaryTime(timeAM);
    string militaryTimePM = convertToMilitaryTime(timePM);

    cout << "AM Time in military format: " << militaryTimeAM << endl;
    cout << "PM Time in military format: " << militaryTimePM << endl;

    return 0;
}
