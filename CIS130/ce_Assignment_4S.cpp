/** 
 * Assignment:    Assignment 4S 
 * 
 * Program Name:  ce_Assignment_4S.cpp 
 * 
 * Purpose:       The purpose of this program is to write a program that asks the user to enter a 10-character telephone number
 *                in the format XXX-XXX-XXXX.  The application should display the telephone number with any 
 *                alphabetic characters that appeared in the original translated to their numeric equivalent.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       June 30, 2022
 */

#include <iostream>
#include <iomanip>
#include <string.h>
#include <cctype>
using namespace std;

bool isNumberGood(string, bool);
string numbersToLetters(string, int);
string getUserInput();

int main()
{
    int i = 0;
    string phoneNumber;
    string oldNumber;
    bool userInput = true;

    cout << "Welcome to the Alphabetic Telephone Number Translator." << endl << endl;
    cout << "This program will translate phone numbers with alphabetic" << endl << "to its numeric equivalent. " << endl;

    while (userInput == true)
    {    
        phoneNumber = getUserInput();
        oldNumber = phoneNumber;

        if(phoneNumber[0] == 'x' || phoneNumber[0] == 'X') //Program exit letter
        {
            if (phoneNumber.length() == 1) //Makes sure it's not a phone number that starts with X
            {   
                cout << "EXIT LETTER" << endl;
                break;
            }
        }

        for (int i = 0; i < phoneNumber.length(); ++i)
        {
            //TRANSLATE DATA HERE
            phoneNumber = numbersToLetters(phoneNumber, i);
            
        }
        cout << "The phone number [" << oldNumber << "] is " << phoneNumber << endl;
    }
    
}

string getUserInput()
{
    string phoneNumber;
    bool badNumberData = false;

    cout << "Enter the telephone number in the format XXX-XXX-XXXX (x or X to exit): " << endl;
    cin >> phoneNumber;
    cout << endl;

    if (phoneNumber[0] == 'X' || phoneNumber[0] == 'x')
        {
            return phoneNumber;            
        }

    badNumberData = isNumberGood(phoneNumber, badNumberData); //MUST RETURN A FALSE TO RUN PROGRAM
    while (badNumberData == true) //DATA VALIDATION
    {
        cout << "Incorrect data" << endl;
        cout << "Enter the telephone number in the format XXX-XXX-XXXX (x or X to exit): " << endl;
        cin >> phoneNumber;

        if (phoneNumber[0] == 'X' || phoneNumber[0] == 'x') //So program can exit even with bad input
        {
            break;            
        }

        badNumberData = isNumberGood(phoneNumber, badNumberData);
    }
    
    return phoneNumber;
}

bool isNumberGood(string phoneNumber, bool badData)
{
    badData = false;
        
    if (phoneNumber.length() != 12)
    {
       badData = true;
    }

    if (phoneNumber[3] != '-' || phoneNumber[7] != '-')
    {
        badData = true;
    }

    return badData;
}

string numbersToLetters(string Number, int i) //Changed to include lower case
{
    if (Number[i] == 'A' || Number[i] == 'a' || Number[i] == 'B' || Number[i] == 'b' || Number[i] == 'C' || Number[i] == 'c') 
    {
        Number[i] = '2';
    }

    if (Number[i] == 'D' || Number[i] == 'd' || Number[i] == 'E' || Number[i] == 'e' || Number[i] == 'F' || Number[i] == 'f') 
    {
        Number[i] = '3';
    }

    if (Number[i] == 'G' || Number[i] == 'g' || Number[i] == 'H' || Number[i] == 'h' || Number[i] == 'I' || Number[i] == 'i') 
    {
        Number[i] = '4';
    }

    if (Number[i] == 'J' || Number[i] == 'j' || Number[i] == 'K' || Number[i] == 'k' || Number[i] == 'L' || Number[i] == 'l') 
    {
        Number[i] = '5';
    }

    if (Number[i] == 'M' || Number[i] == 'm' || Number[i] == 'N' || Number[i] == 'n' || Number[i] == 'O' || Number[i] == 'o') 
    {
        Number[i] = '6';
    }

    if (Number[i] == 'P' || Number[i] == 'p' || Number[i] == 'Q' || Number[i] == 'q' || Number[i] == 'R' || Number[i] == 'r' || Number[i] == 'S' || Number[i] == 's') 
    {
        Number[i] = '7';
    }

    if (Number[i] == 'T' || Number[i] == 't' || Number[i] == 'U' || Number[i] == 'u' || Number[i] == 'V' || Number[i] == 'v') 
    {
        Number[i] = '8';
    }

    if (Number[i] == 'W' || Number[i] == 'w' || Number[i] == 'X' || Number[i] == 'x' || Number[i] == 'Y' || Number[i] == 'y' || Number[i] == 'Z' || Number[i] == 'z') 
    {
        Number[i] = '9';
    }

    //cout << Number << endl;
    return Number;
}