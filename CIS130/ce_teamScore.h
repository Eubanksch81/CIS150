#include <string.h>
#include <iostream> //get rid of iostream and iomanip later.
#include <iomanip> //Included these two for testing use.
#include <vector>
using namespace std;

class TeamScore
{
    private:
        //Include computePoints function later.
        string teamName;
        int wins;
        int ties;
        int losses;
        vector<string> historyLog;
        int entryNum;
        int computePoints()
        {
            int totalPoints;
            totalPoints = (wins * 3) + ties;
            return totalPoints;
        }
    public:
        TeamScore() //Default constructor
        {
            teamName = "";
            wins = 0;
            ties = 0;
            losses = 0;
            entryNum = 1;
        }
        TeamScore(string name) //Non-default constructor
        {
            teamName = name;
            wins = 0;
            ties = 0;
            losses = 0;
            entryNum = 1;
        }
        string getName()
        {
            return teamName;
        }
        int getWins()
        {
            return wins;
        }
        int getTies()
        {
            return ties;
        }
        int getLosses()
        {
            return losses;
        }
        void updateWins() //Original function increments value by 1
        {
            wins += 1;
            updateHistory();
        }
        void updateWins(int i) //Overload functions with int i decrement the value by 1.
        {
            if (wins > 0)
            {
                wins = wins - i;
                updateHistory();
            }
        }
        void updateTies()
        {
            ties = ties + 1;
            updateHistory();
        }
        void updateTies(int i) //i will always be 1.
        {
            if (ties > 0)
            {
                ties = ties - i;
                updateHistory();
            }
        }
        void updateLosses()
        {
            losses = losses + 1;
            updateHistory();
        }
        void updateLosses(int i)
        {
            if (losses > 0)
            {
            losses = losses - i;
            updateHistory();
            }
        }  
        void updateHistory()
        {
            char myLog[50];
            sprintf(myLog, " %4d   %4d    %4d     %4d", entryNum, wins, ties, losses);
            //cout << myLog << endl;
            historyLog.push_back(myLog);
            ++entryNum;
            
        }
        void displayReport()
        {
            cout << "------------------------------" << endl;
            cout << "Soccer Record for Team " << teamName << endl;
            cout << "------------------------------" << endl;
           
            cout << "Wins   Ties   Losses   Points " << endl;
            cout << "====   ====   ======   ====== " << endl;
            cout << setw(3) << wins << setw(7) << ties << setw(8) << losses;
            cout << setw(10) << computePoints() << " " << endl << endl;
            
            cout << "History of Entries Performed " << endl << endl;
            cout << "Entry   Wins    Ties   Losses " << endl;
            cout << "=====   ====   =====   ====== " << endl;
            
            for (int i = 0; i < historyLog.size(); ++i) 
            {
                cout << historyLog[i] << endl;
            }
            cout << endl;

        }
};