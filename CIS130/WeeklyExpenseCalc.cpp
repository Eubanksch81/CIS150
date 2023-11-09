/** 
 * Program Name:  WeeklyExpenseCalc.cpp
 * 
 * Purpose:       The purpose of this program is to calculate how many weeks I have left until I run out of spending money.
 *                This program does not account for any expenses made between the current time and personal bankruptcy.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        None
 * 
 * Created:       August 16, 2022
 */

#include <iostream>
#include <iomanip>
#include<string.h>
using namespace std;

int main ()
{
    int currWeek = 0;
    int initialAmount;
    int weekCost;
    int weekGain = 30;

    cout << "Enter initial amount: " << endl;
    cin >> initialAmount;

    while (initialAmount >= 0)
    {
        currWeek += 1;
        if (currWeek % 2 == 0) //Even number
        {
            if (currWeek == 2)
            {
                weekCost = 30;
            }
            else
            {
                weekCost = 40;
            }
        }
        else
        {
            weekCost = 30;
        }
        initialAmount -= weekCost;
        initialAmount += weekGain;
        cout << "Week: " << currWeek << "   Money: " << initialAmount << endl;
    }
    cout << endl << currWeek << " weeks left till personal bankruptcy." << endl;

}