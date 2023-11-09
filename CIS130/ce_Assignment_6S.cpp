/** 
 * Assignment:    Assignment H06
 * 
 * Program Name:  ce_Assignment_06.cpp 
 * 
 * Purpose:       The purpose of this program is to let the user enter a charge account number. The program should 
                  determine if the number is valid by checking for it within a specific array.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       July 18, 2022
 */

#include <iostream>
#include <iomanip>
#include<string.h>
using namespace std;

int main() 
{
    const int ACCOUNTSIZE = 18;
    int account[ACCOUNTSIZE] = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 
                                8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 
                                1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
                                
    //{18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1}; Simplified list for testing

    int swapCount = 1;
    int accountInput;
    int smallElement;
    bool found;

    while (swapCount != 0) //Bubble Sort
    {
        swapCount = 0;
        for (int i = 0; i < ACCOUNTSIZE; i++) 
        {
                if (i != ACCOUNTSIZE - 1)
                {
                    if (account[i] > account[i + 1])
                    {
                        swapCount += 1;
                        smallElement = account[i];
                        account[i] = account[i + 1]; //Swaps positions
                        account[i + 1] = smallElement;
                    }
                }
        }
    }

    for (int j = 0; j < ACCOUNTSIZE; ++j) 
        cout << "\t" << account[j] << endl;
    cout << endl;

    cout << "Welcome to Charge Account Validation" << endl << endl;


    while (accountInput != 9999999) 
    {
        cout << "Please enter a 7-digit account number (Enter 9999999 to exit): ";
        cin >> accountInput;
        cout << endl;
        
        found = false;
        for (int i = 0; i < ACCOUNTSIZE; i++) //Linear search (I gave up)
        {
            if (account[i] == accountInput)
            {
                cout << "Account number: " << accountInput << " is valid." << endl;
                found = true;
                break;
            }
        }
        
        //int low = 0;
        //int high = ACCOUNTSIZE;
        //int mid = (low + high) / 2;
        //int num = 0;
        
        /*while (low < high) //Binary Search (Doesnt work for the required list, works for simplified list??)
        {
            if (account[mid] == accountInput) //Dead center
            {
                cout << "Account number: " << accountInput << " is valid." << endl;
                found = true;
                break;
            }
            if (account[mid] > accountInput) //Left side
            {
                high = mid;
                mid = ((low + high) / 2 );
                //cout << "Left side" << endl;
            }
            if (account[mid] < accountInput) //Right side
            {
                low = mid;
                mid = ((low + high) / 2);
                //cout << "Right side" << endl;
                if (accountInput > high) 
                {
                    break;
                }
            }
        }*/
        if (found == false) 
        {
            cout << "Account number: " << accountInput << " is INVALID." << endl;
        }

    }   
    cout << "\nThank you for using the charge account validation." << endl;
}

/*
    List is:
    5658845     4520125     7895122     8777541     8451277     1302850 
    8080152     4562555     5552012     5050552     7825877     1250255 
    1005231     6545231     3852085     7576651     7881200     4581002 
*/