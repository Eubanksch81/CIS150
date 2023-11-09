/** 
 * Assignment:    Assignment H08
 * 
 * Program Name:  ce_Assignment_8S.cpp 
 * 
 * Purpose:       The purpose of this program is to parse an XML file containing the top 100 Billboard Hits from 2015.
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       July 27, 2022
 */

#include <iostream>
#include <iomanip>
#include <fstream>
#include<string.h>
using namespace std;

string trim(string);
void filterNonPrint(string &);
void getData(string &, string &, string &, int &);
void outputData(string, string, string, int);

string RECORDS = "student_files8S/Records.xml";
ifstream inFile(RECORDS);

int main() 
{
    string songName;
    string songArtist;
    string songTime;
    int listNumber = 0;

    cout << "              *************************************************" << endl;
    cout << "              *** Listing of The Top 100 Pop Hits From 2015 ***" << endl;
    cout << "              *************************************************" << endl << endl;

    cout << "  #" << setw(25) << "Artist";
    cout << setw(34) << "Title";
    cout << setw(18) << "Length" << endl;
    cout << "---  ----------------------------------------  -------------------------  ------" << endl;

    while (listNumber < 100) //Iterates for the first two times. Change to 100 when program is done.
    {
        getData(songName, songArtist, songTime, listNumber);
    }
    
    inFile.close();
}

string trim(string inStr)
{
    // Trim Function – trims leading and trailing white space
    const char *typeOfWhitespaces = " \t\n\r\f\v";
    inStr.erase(inStr.find_last_not_of(typeOfWhitespaces) + 1);
    inStr.erase(0, inStr.find_first_not_of(typeOfWhitespaces));
    return inStr;
}

void filterNonPrint(string &userStr)
{
    // Filter Function – removes non-printable characters
    int i;
    string tempStr;
    // Loop through the string and if the character
    // is printable, append the character to the tempStr
    // string.
    for (i = 0; i < userStr.length(); i++)
        if (isprint(userStr[i]))
        tempStr += userStr[i];
        // Set userStr to the value of tempStr
        userStr = tempStr;
}

void getData(string &artist, string &name, string &time, int &listNum)
{
    int filePos;
    string currString;
    string tempString;
    int linePos;

    getline(inFile, currString); //Gets current line
    if (!inFile) //Check if file actually opened
    {  
        cout << "ERROR: FILE FAILED TO OPEN" << endl;
    }

    filePos = currString.find("Artist");
    if (filePos != string::npos) //Found location of "Artist".
    {
        listNum = listNum + 1; //Only increments when there is good input
        trim(currString); //Removes whitespace.
        filterNonPrint(currString); //Removes non-printable characters.

        linePos = currString.find('"'); //Uses substring to remove the quotations at beginning
        currString = currString.substr(linePos + 1);
        linePos = currString.find('"');
        currString = currString.substr(0, linePos); //Removes end quotation and arrow.
        artist = currString;
        //cout << artist << endl;

        getline(inFile, tempString);
        getline(inFile, tempString); //Skips two lines, uses tempString as a buffer.

        getline(inFile, name);
        name = trim(name); //Cleans songName of whitespace and nonprintables
        filterNonPrint(name);
        //cout << name << endl;

        getline(inFile, tempString);
        getline(inFile, tempString);

        getline(inFile, time);
        time = trim(time);
        filterNonPrint(time);
        //cout << time << endl;

        outputData(artist, name, time, listNum);
    }
}

void outputData(string artist, string name, string time, int listNum)
{
    cout << setw(3) << listNum << "  ";
    cout << setw(40) << left << artist << "  ";
    cout << setw(25) << left << name << "  ";
    cout << setw(6) << right << time << endl;
}