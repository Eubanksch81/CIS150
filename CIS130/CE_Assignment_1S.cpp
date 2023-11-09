/** 
 * Assignment:    Assignment 1S 
 * 
 * Program Name:  CE_Assignment_1S.cpp 
 * 
 * Purpose:       The purpose of this program is to display the current average
 *                 temperatures of three cities, and then calculate the new average
 *                 temperatures with a percentage gathered from user input.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       June 15, 2022
 */

#include <iostream>
using namespace std;

int main()
{
    double newYork = 85.0; //Define variables
    double denver = 88.0;
    double phoenix = 106.0;
    double percentage;
    double percentCalc;
    
    cout << "Average High Temperatures" << endl;
    cout << endl; //New line

    cout << "The current high average temperatures are as follows: " << endl;
    cout << "New York " << newYork << endl;
    cout << "Denver " << denver << endl;
    cout << "Phoenix " << phoenix << endl;
    cout << "" << endl;

    cout << "Enter the percent increase in temperature: " << endl;
    cin >> percentage; //Gets percentage from input

    cout << "Increasing the temperature by " << percentage << " will result in the following: " << endl;

    percentage = percentage / 100;
    percentCalc = newYork * percentage;
    newYork = newYork + percentCalc;

    percentCalc = denver * percentage;
    denver = denver + percentCalc;

    percentCalc = phoenix * percentage;
    phoenix = phoenix + percentCalc;

    cout << "New York " << newYork << endl;
    cout << "Denver " << denver << endl;
    cout << "Phoenix " << phoenix << endl;
    
    return 0;
}