/** 
 * Assignment:    Assignment 3S 
 * 
 * Program Name:  ce_Assignment_3S.cpp 
 * 
 * Purpose:       The purpose of this program is to write a program that will create 
 *                an invoice for a customer who purchased Girl Scout cookies. The program should continually loop on customers.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       June 29, 2022
 */


#include <iostream>
#include <ctime> 
#include <iomanip>
#include <fstream>
#include<string.h>
using namespace std;

void getCookies(int, int);
void printHeader(string, string, string, int);
void printInfo(string, int, double);
ofstream outFile("ce_orders.txt");

int main () 
{
    cout << "***********************************************" << endl;
    cout << "*** Welcome to Girl Scout Cookie Order Form ***" << endl;
    cout << "***********************************************" << endl;
    cout << endl;
    cout << "We promise to deliver excellent cookies to your doorstep." << endl;
    cout << endl;
    
    const int MIN_ORDER = 0;
    const int MAX_ORDER = 10;
    string customerName = "";
    string customerAddress;
    string customerCityStateZip;
    int i = 1;
    
    while (customerName != "q") 
    {
        cout << "Order number "  << i << ": " << endl;
        cout << "Enter the customer's first and last name (or q to quit): " << endl;
         getline(cin, customerName);

        if (customerName == "q") 
        {
            break; //Ends loop before order begins
        }

        cout << "Enter " << customerName << "'s address: " << endl;
         getline(cin, customerAddress);
        cout << "Enter " << customerName << "'s city, state and zip code: " << endl;
         getline(cin, customerCityStateZip);

    printHeader(customerName, customerAddress, customerCityStateZip, i); //It looked too ugly for main
    getCookies(MIN_ORDER, MAX_ORDER);
    
    ++i;
    }
    outFile.close();
    return 0;
}

void getCookies(int min, int max)
{
    double totalCost = 0;
    int cookieAmount = -1;
    double cookiePrice;
    string cookieName;

    //THIN MINTS
    cookieName = "Thin Mints";
    cout << "Enter the number of Thin Mints (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of Thin Mints (0-10): " << endl;
        cin >> cookieAmount;
    }

    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //LEMON-UPS
    cookieName = "Lemon-ups";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //LEMONADES
    cookieName = "Lemonades";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //SAMOAS
    cookieName = "Samoas";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //TAGALONGS
    cookieName = "Tagalongs";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //DO-SI-DOS
    cookieName = "Do-si-dos";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //TREFOILS
    cookieName = "Trefoils";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //THANKS-A-LOT
    cookieName = "Thanks-A-Lot";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);
    
    //TOFFEE-TASTIC
    cookieName = "Toffee-tastic";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //CARAMEL CHOCOLATE CHIP
    cookieName = "Caramel Chocolate Chip";
    cout << "Enter the number of " << cookieName << " (0-10): " << endl;
    cin >> cookieAmount;
    cin.ignore();

    while (cookieAmount < min || cookieAmount > max) 
    {
        cout << "Error: input number must be between 0 - 10" << endl;
        cout << "Enter the number of " << cookieName << " (0-10): " << endl;
        cin >> cookieAmount;
    }
    
    cookiePrice = 5.0 * cookieAmount;
    totalCost += cookiePrice;

    printInfo(cookieName, cookieAmount, cookiePrice);

    //TOTALS
    outFile << "------------------------------------------------- " << endl;
    outFile << "|                       Total Due:  | $  " << fixed << setprecision(2) << totalCost << " | " << endl;
    outFile << "------------------------------------------------- " << endl;
    outFile << endl;

}

void printHeader(string name, string address, string cityStateZip, int i)
{
    string dateStr;

    outFile << "=================================" << endl;
    outFile << "=== Girl Scout Cookie Invoice ===" << endl;
    outFile << "=================================" << endl;
    outFile << endl;
     
    time_t result = time(NULL); 
    dateStr = ctime(&result);
    outFile << dateStr;
    outFile << endl;

    outFile << name << endl << address << endl << cityStateZip << endl;
    outFile << endl;
    outFile << "Order number: " << i << endl;
    outFile << endl;
    outFile << "Dear " << name << ": " << endl;
    outFile << endl;
    outFile << "Your Girl Scout Cookie order has arrived." << endl << "Your order consists of the following: " << endl;

    outFile << "------------------------------------------------- " << endl;
    outFile << "|        Cookie          | Quantity |   Cost    | " << endl;
    outFile << "------------------------------------------------- " << endl;

}

void printInfo(string name, int amount, double price) 
{
    outFile << "| " << setw(22) << left << name << " |";
    outFile << setw(9) << right << amount << " |";
    outFile << setw(10) << fixed << setprecision(2) << price << " |"; 
    outFile << endl; //Output for cookie info
}