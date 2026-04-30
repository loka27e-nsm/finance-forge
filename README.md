# Finance Forge
Welcome to the Finance Forge, a gamified financial tracker that turns personal budgeting and savings into an adventure! 
## Program Overview
Users complete virtual quests (ex: saving money, tracking expenses, and hitting financial milestones/goals to earn rewards and unlock levels or items in an adventure map). This idea was mainly inspired by an interest in combining financial literacy, a skill of growing importance, with interactive gamification, counteracting shortened attention spans to help students or young adults who want to develop financial literacy while preventing boredom or procrastination. The program will use a Java FX based GUI system to display dashboards, quest lists, and visual feedback, providing immediate, easily accessible/interpretable responses to user actions (buttons pressed, dollar amounts entered, etc.). Completing the basic quests laid out shows the benefits of budgeting and mindful money management to a broader audience.

## User Guide
### 📥 Installation & Setup
* On Oracle, download JDK23 
* Open a code editor like VS Code
* Grab the necessary Java extensions
* Clone the repository in VS Code using the Ctrl Shift P pallette
* Locate the main entry point file Main.java and run it using your editor's "Run" command.

### 🎮 How to Play
* Once the application launches, follow this workflow to explore the features:
* Use the Start button to enter or Quit to exit.
* The Quest System:
* Navigate from the Dashboard to the Quest tab.
* Select Quest 1 to begin.
* Note: Once a quest is completed, it becomes locked for the remainder of the session.
* If a quest requires a recorded statement, use the button on the Dashboard or the table in the Right Tab
  
## Features
- Users can remove their logged expenses
- Users can log their expenses
- Users can track their progress in quests
- Users can browse quests
- Users can set budget goals (ie. save $200 by end of month)
- Users can track their progress in goals
- Users log in revenue (salary, wage, paycheck,grant, etc.)

## Interface
- Piechart now shows when no expense is logged
- The program outputs a message based on user dollar input-- slightly modified. Instead of a message, we have a table that updates
- A dashboard showing the above to make the experience appealing
- The program ensures valid inputs to ensure it functions correctly

## Bugs/Limitations to be fixed
- Currently only works when you download the file and run it in a IDE like VSCode
- When creating a log statement, if you put a negative value in the amount category, it can mess up the pie chart on the dashboard and some progress logic
- For the first four quests, they must be completed in order, but the others are less restricted. Only exception is Quest 7 MUST be completed before Quest 8
- For Quests 7 and 9, with 9 completing a budgeting goal from 7, there is no current code stopping someone from clicking on 9 first for points
- Plan to add database to ensure Users have saved data. Will be local until I am unable to make it persistent
- Plan to do a complete overhaul of the code for the quest to ensure natural progression
- Plan: Quest 1-5 will get the User familiar with the app and is in order, Quest 6-10 will be persistent per month and involves challenges to ensure healthy financial habits

