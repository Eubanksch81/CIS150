/** 
 * Assignment:    Assignment H07
 * 
 * Program Name:  ce_Assignment_07.cpp 
 * 
 * Purpose:       The purpose of this program is to create an array using pointer notation based off of inputs taken from the user, 
 *                and then sorting and outputting the resulting array. It also prints the average.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       July 20, 2022
 */

#include <iostream>
#include <iomanip>
#include <string.h>
#include <algorithm>
using namespace std;

void average(double*, int);
bool defineArray(double*, int);
void sortArray(double*, int);

int main() 
{

    int arraySize;
    double *arrayPtr;
    bool validInput;

    cout << "Welcome to Find the Average Program" << endl;
    cout << "-----------------------------------" << endl << endl;
    cout << "In this program, you enter test scores for your students" << endl 
         << "and will display the scores entered and their average. " << endl << endl;
         
    cout << "Enter the number of Scores: " << endl;
    cin >> arraySize;
    
    arrayPtr = new double[arraySize]; //Initialize array

    validInput = defineArray(arrayPtr, arraySize);
    if (validInput)
    {
        sortArray(arrayPtr, arraySize);
        average(arrayPtr, arraySize);

        delete [] arrayPtr;
        arrayPtr = NULL;
    }
}

void average(double *arrayPtr, int arraySize)
{
    double total = 0;
    for (int i = 0; i < arraySize; ++i)
    {
        total += *(arrayPtr + i);
    }
    total = total / arraySize;
    cout << "The class average for this test is: " << fixed << setprecision(1) << total << endl;
}

bool defineArray(double *arrayPtr, int arraySize)
{
    bool validInput = true;
    double *ptr = arrayPtr;     // Beginning of the array

    cout << "Enter each of the " << arraySize << " test scores separated by space: " << endl;
    for (int i = 0; i < arraySize; i++) //Define array contents
    {
        cin >> *arrayPtr;
        if (*arrayPtr < 0)
        {
            cout << "ERROR: You may not use negative scores. Please restart the program." << endl;
            delete [] arrayPtr; //Deleting the array prematurely forces the program to terminate.
            validInput = false;
            break;
        }
        arrayPtr++;
    }
    if (validInput)
    {
        arrayPtr = ptr;
        cout << "======================================" << endl;
        cout << "| The following scores were entered  |" << endl;
        cout << "======================================" << endl;
        for (int i = 0; i < arraySize; i++) 
        {
            cout << *arrayPtr << "  ";
            arrayPtr++;
        }
        cout << endl << endl;

    }

    return validInput;
}
void sortArray(double *arrayPtr, int arraySize)
{
    sort(arrayPtr, (arrayPtr + arraySize));
    cout << "======================================" << endl;
    cout << "| The sorted scores are listed below |" << endl;
    cout << "======================================" << endl;
    for (int i = 0; i < arraySize; ++i) 
    {
        cout << *(arrayPtr + i) << "  ";
    }
    cout << endl << endl;
}