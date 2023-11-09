/** 
 * Assignment:    Assignment 5S 
 * 
 * Program Name:  ce_Assignment_5S.cpp 
 * 
 * Purpose:       The purpose of this program is to write a program that uses a class to update the team wins, ties and losses.  
 *                 The class will also have a member function that reports how well the team has performed. 
 * 
 * Author:        Charles Eubanks
 * 
 * Course:        221CIS130.950 
 * 
 * Created:       July 11, 2022
 */

#include <iostream>
#include <iomanip>
#include <string.h>
#include "ce_teamScore.h"
using namespace std;

string inputTeamName();
void outputMenu(TeamScore);
int getMenuChoice();
void executeMenu(int, TeamScore &);

int main()
{
    string teamName;
    int menuChoice = 0;

    teamName = inputTeamName();
    TeamScore team(teamName); //Class initialization

    while (menuChoice != 8) 
    {
    outputMenu(team);
    menuChoice = getMenuChoice();
    executeMenu(menuChoice, team);
    }

    return 0;
}

string inputTeamName() //returns teamName
{
    string teamName;
    cout << "Enter your soccer team name: " << endl;
     getline(cin, teamName);
    return teamName;
}

void outputMenu(TeamScore team) //outputs menu
{
    cout << "Soccer stats for " << team.getName() << endl << endl;
    cout << "1 - Update Wins  " << endl;
    cout << "2 - Update Ties  " << endl;
    cout << "3 - Update Losses  " << endl;
    cout << "4 - Display Report  " << endl;
    cout << "5 - Reset Wins by -1  " << endl;
    cout << "6 - Reset Ties by -1  " << endl;
    cout << "7 - Reset Losses by -1  " << endl;
    cout << "8 - Exit  " << endl;
    cout << ">>> Enter your menu choice (1-8):" << endl << endl; 
}

int getMenuChoice() //gets and validates menuChoice
{
    int menuChoice;
    cin >> menuChoice;
    while (menuChoice < 1 || menuChoice > 8) 
    {
        cout << "Your choice must be from 1 to 8. " << endl;
        cout << "Please re-enter your menu choice. " << endl << endl;
        cout << ">>> Enter your menu choice (1-8): " << endl;
        cin >> menuChoice;
        cin.clear();
        cin.ignore();
    }

    return menuChoice;
}

void executeMenu(int menuChoice, TeamScore &team) //takes menuChoice as a parameter and executes menu
{
    if (menuChoice == 1)
    {
        team.updateWins();
        //cout << "GET WINS" << endl;
    }
    else if (menuChoice == 2)
    {
        team.updateTies();
        //cout << "GET TIES" << endl;
    }
    else if (menuChoice == 3)
    {
        team.updateLosses();
        //cout << "GET LOSSES" << endl;
    }
    else if (menuChoice == 4)
    {
        team.displayReport();
        //cout << "DISPLAY REPORT" << endl;
    }
    else if (menuChoice == 5)
    {
        team.updateWins(1);
        //cout << "RESET WINS" << endl;
    }
    else if (menuChoice == 6)
    {
        team.updateTies(1);
        //cout << "RESET TIES" << endl;
    }
    else if (menuChoice == 7)
    {
        team.updateLosses(1);
        //cout << "RESET LOSSES" << endl;
    }

}