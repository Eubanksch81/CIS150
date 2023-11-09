/** 
 * Assignment:    Assignment H-EC
 * 
 * Program Name:  ce_Assignment_EC.cpp 
 * 
 * Purpose:       The purpose of this program is to write a program that reads input from a file that contains customer data,
 *                and then using that data displays a bill report that contains multiple billing statements.
 *                The display is outputted to another .txt file. 
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       July 2, 2022
 */

#include <iostream>
#include <ctime> 
#include <iomanip>
#include <fstream>
#include<string.h>
using namespace std;

void getCustomerData();
int printCustomerData(int, int, int, int, int, double, double, double, double, int, int, int, int, bool);
ofstream outFile("ce_CustomerBilling.txt");
ifstream inFile("ce_CustomerData.txt");

int main() 
{
    
    getCustomerData();
    //cout << "FINISHED PRINTING" << endl;
    
    outFile.close();
    inFile.close();
    return 0;
}

void getCustomerData()
{
    /*
        Defines customer number, Last month's reading, current reading, water bill, sewage bill, meter number, water usage, total bill.
        Gets input in this order: Customer Number, Meter Number, Last Months Reading, Current Reading.
        NOTE: Input file will be in this order: 30, 35, 40, 45, OVER200, NEG, 50, 55, 60, 65, 70, 75, NEG, OVER200, NEG, 80, 85, 90, 95, 100.
    */
   int customerNumber = 0;
   int lastMonthReading;
   int currentReading;
   double totalBill; //Water bill + sewage bill.
   double waterBill;
   double sewageBill;
   int meterNumber;
   int waterUsage; //Current reading - last month's reading.
   double totalCharge = 0.00; //Keeps a total of all bills, and then adds them.
   bool dataValid = true; //Whether or not customerNumber is sentinel value.
   int validBills = 0; //Keeps track of all valid bills.
   int invalidBills = 0; //Keeps track of all invalid bills.
   int totalAmountOfBills = 0; //valid bills + invalid bills.
   int pageNumber = 0; //Page 1 is title page.

   while (customerNumber != 99999) 
   {
        inFile >> customerNumber >> meterNumber >> lastMonthReading >> currentReading;
        
        if (totalAmountOfBills % 4 == 0) //Checks page number at the end of each print.
        {
            pageNumber += 1;
            outFile << "PAGE: " << pageNumber << endl;
            outFile << "-------------------------------------------------------------------- " << endl;
        }
        
        if (customerNumber == 99999)
        {
            //Ends input, goes to outputting summary statement.
            break;
        }
        
       waterUsage = currentReading - lastMonthReading;
       if (waterUsage > 3) 
       {
            waterBill = ((waterUsage - 3) * 3.55) + 16;
       }
       else 
       {
            waterBill = 16.00;
       }
       sewageBill = waterUsage * .35;
       totalBill = waterBill + sewageBill;

       /* CALCULATION TESTING 
        cout << waterUsage << endl;
        cout << waterBill << endl;
        cout << sewageBill << endl;
        cout << totalBill << endl;
        cout << endl; */
        
        dataValid = true; //Redefines dataValid for multiple loop renditions.
        if (waterUsage > 200 || waterUsage < 0) 
        {
            dataValid = false;
            invalidBills += 1;
            totalAmountOfBills += 1;
        }
        else 
        {
            totalCharge = totalCharge + totalBill; //Only adds totalCharge if bill is valid.
            validBills += 1;
            totalAmountOfBills += 1;
        }

        printCustomerData(customerNumber, meterNumber, lastMonthReading, currentReading, waterUsage, totalCharge, waterBill, sewageBill, totalBill, 
                    validBills, invalidBills, totalAmountOfBills, pageNumber, dataValid); //Prints out all gathered input.
   }    
   
   printCustomerData(customerNumber, meterNumber, lastMonthReading, currentReading, waterUsage, totalCharge, waterBill, sewageBill, totalBill, 
                    validBills, invalidBills, totalAmountOfBills, pageNumber, dataValid); //Runs the summary.
}

int printCustomerData(int customerNumber, int meterNumber, int prevReading, int currReading, 
                        int waterUsage, double totalCharge, double waterBill, double sewageBill, double totalBill,
                         int validBills, int invalidBills, int totalAmountOfBills, int pageNumber, bool dataValid) 
                         //For future reference, is this amount of variables for a function call acceptable? It feels wrong. 
{
    time_t currTime; //Lines 136-141 get current date.
    tm* currTm;
    char dateStr[100];
    time(&currTime);
    currTm = localtime(&currTime);
    strftime(dateStr, 50, "%B %d, %Y", currTm);

    if (customerNumber == 99999) //If input is finished. This runs the summary statement.
    {   
        outFile << setw(46) << right << "Daly Water Company" << endl;
        outFile << setw(45) << right << dateStr << endl;
        outFile << endl;

        outFile << setw(45) << right << "Summary Statement" << endl;
        outFile << endl;

        outFile << "Valid Bills Processed" << setw(12) << right << validBills << endl;
        outFile << "Rejected Bills Processed" << setw(9) << right << invalidBills << endl;
        outFile << "                              ---" << endl;
        outFile << "TOTAL BILLS PROCESSED" << setw(12) << right << totalAmountOfBills;
        outFile << setw(22) << right << "TOTAL USAGE CHARGES";
        outFile << " $" << setw(10) << right << fixed << setprecision(2) << totalCharge << endl;
        outFile << "--------------------------------------------------------------------" << endl;

        return 0; //Exits output function, which exits input function, which ends program.
    }

    outFile << setw(46) << right << "Daly Water Company" << endl;
    outFile << setw(45) << right << dateStr << endl;
    outFile << endl;

    outFile << setw(15) << right << "CUSTOMER";
    outFile << setw(8) << " "; //Whitespace
    outFile << setfill('0') << setw(5) << customerNumber;//Fills any number that starts with 0
    outFile << setfill(' '); //Makes sure all whitespace isn't replaced with 0s.
    outFile << setw(26) << right << "METER NUMBER";
    outFile << setw(7) << " "; //Whitespace
    outFile << setfill('0') << setw(5) << meterNumber << endl;//Fills any number that starts with 0
    outFile << setfill(' '); //Makes sure all whitespace isn't replaced with 0s.
    outFile << endl;

    outFile << setw(15) << right << "NEW READING";
    outFile << setw(8) << " "; //Whitespace
    outFile << setfill('0') << setw(5) << currReading << endl; //Fills any number that starts with 0
    outFile << setfill(' '); //Makes sure all whitespace isn't replaced with 0s.
    outFile << setw(15) << right << "OLD READING";
    outFile << setw(8) << " "; //Whitespace
    outFile << setfill('0') << setw(5) << prevReading << endl;//Fills any number that starts with 0
    outFile << setfill(' '); //Makes sure all whitespace isn't replaced with 0s.
    outFile << "                       -----" << endl;
    outFile << setw(15) << right << "WATER USAGE";
    outFile << setw(13) << right << waterUsage << endl;

    if (dataValid == true)
    {
        outFile << setw(54) << right << "WATER CHARGE";
        outFile << "  $" << setw(9) << right << fixed << setprecision(2) << waterBill << endl;
        outFile << setw(54) << right << "SEWAGE CHARGE";
        outFile << "  $" << setw(9) << right << fixed << setprecision(2) << sewageBill << endl;
        outFile << "                                                        -----------" << endl;
        outFile << setw(54) << right << "TOTAL DUE";
        outFile << "  $" << setw(9) << right << fixed << setprecision(2) << totalBill << "  ---" << endl;
        outFile << "-----------------------------------------------------------------" << endl;

    }
    else
    {
        outFile << setw(54) << right << "WATER CHARGE";
        outFile << "  -- REJECTED -- " << endl;
        outFile << setw(54) << right << "SEWAGE CHARGE";
        outFile << "  -- REJECTED --" << endl;
        outFile << "-------------------------------------------------------------------- " << endl;
    }

    return 0; //Goes back to while loop inside input function for the next bill.
}