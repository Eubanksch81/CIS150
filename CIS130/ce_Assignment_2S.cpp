/** 
 * Assignment:    Assignment 2S 
 * 
 * Program Name:  ce_Assignment_2S.cpp 
 * 
 * Purpose:       The purpose of this program is to survey the inputter about things about them, and then display that information.
 *                 It also calculates the pizza's total after the initial is given.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       June 20, 2022
 */

#include <iostream>
#include<string.h>
#include <iomanip>
using namespace std;

int main()
{
    //Variables
    string name;
    string music;
    string musicGroup;
    string petName;
    string city;
    string sport;
    string sMedia;
    double siblings;
    string car;
    string color;
    string food;
    double pizzaInitial;
    double salesTax = 0.0775;
    double taxAmount;
    double pizzaTotal;
    
    //Inputs
    cout << "Question: What is your first and last name?" << endl;
     getline(cin, name);
    cout << "Question: What type of music do you enjoy?" << endl;
     getline(cin, music);
    cout << "Question: Who is your favorite musical group?" << endl;
     getline(cin, musicGroup);
    cout << "Question: What is your pets name (enter the name or none)?" << endl;
     getline(cin, petName);
    cout << "Question: What city were you born?" << endl;
     getline(cin, city);
    cout << "Question: What is your favorite sport?" << endl;
     getline(cin, sport);
    cout << "Question: What is your favorite social media?" << endl;
     getline(cin, sMedia);
    cout << "Question: How many brothers and sisters do you have?" << endl;
     cin >> siblings;
     cin.ignore();
    cout << "Question: What is your favorite car?" << endl;
     getline(cin, car);
    cout << "Question: What is your favorite color?" << endl;
     getline(cin, color);
    cout << "Question: What is your favorite food?" << endl;
     getline(cin, food);
    cout << "Question: If you order pizza, about how much would you pay before taxes?" << endl;
     cin >> pizzaInitial;
    cout << endl; //For extra space between input and output

    taxAmount = pizzaInitial * salesTax; //Calculate Totals
    pizzaTotal = pizzaInitial + taxAmount;

    //Outputs
    cout << "Welcome to Your Favorite Survey Program" << endl;
    cout << endl;
    cout << "Today we surveyed " << name  << ". Here are the results: "<< endl;
    cout << endl;

    cout << " 1. Favorite music:   " << music << endl;
    cout << " 2. Favorite group:   " << musicGroup << endl;
    cout << " 3. Pets name:        " << petName << endl;
    cout << " 4. Birth City:       " << city << endl;
    cout << " 5. Favorite Sport:   " << sport << endl;
    cout << " 6. Favorite Media:   " << sMedia << endl;
    cout << " 7. Total Siblings:   " << siblings << endl;
    cout << " 8. Favorite Car:     " << car << endl;
    cout << " 9. Favorite Color:   " << color << endl;
    cout << "10. Favorite Food:    " << food << endl;
    cout << endl;

    cout << "11. Pizza cost:       $          " << fixed << setprecision(2) << pizzaInitial << endl;
    cout << "     State Tax:       $           " << fixed << setprecision(2) << taxAmount << endl;
    cout << "                       ---------------" << endl;
    cout << "    Pizza Total:      $          " << fixed << setprecision(2) << pizzaTotal << endl;

    return 0;
}