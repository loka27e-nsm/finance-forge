# Finance Forge
## Program Overview
Welcome to the Finance Forge, a gamified financial tracker that turns personal budgeting and savings into an adventure! Users complete virtual quests (ex: saving money, tracking expenses, and hitting financial milestones/goals to earn rewards and unlock levels or items in an adventure map). This idea was mainly inspired by an interest in combining financial literacy, a skill of growing importance, with interactive gamification, counteracting shortened attention spans to help students or young adults who want to develop financial literacy while preventing boredom or procrastination. The program will use a Java FX based GUI system to display dashboards, quest lists, and visual feedback, providing immediate, easily accessible/interpretable responses to user actions (buttons pressed, dollar amounts entered, etc.). Completing the basic quests laid out shows the benefits of budgeting and mindful money management to a broader audience.

## User Guide
1. Download the JavaJDK 23 from Oracle's website.
2. Run it in any code editor
3. Click “Start” to start the game, or "Quit" to exit the game
4. Browse around the menu to get familiar with the UI
5. Move from dashboard to quest
6. Click on 1
7. Do what it says. If it involves recording a statement, either use the button in the dashboard or go to the table in the right tab.
8. If a quest is completed, you will no longer be able to access it for the duration of the game
9. Complete all the quests. Some involve questions, some involve budgeting, and some involve learning about the app.
10. In dashboard, hover over points and balance to see how much you have.
11. Use the quest progress bar to track your progress towards the 10 quests
12. If you log an expense, a pie chart in the dashboard will appear
  
## Features
- Users can remove their logged expenses
- Piechart now shows when no expense is logged
- Users can log their expenses
- Users can track their progress in quests
- Users can browse quests
- Users can set budget goals (ie. save $200 by end of month)
- Users can track their progress in goals
- The program outputs a message based on user dollar input-- slightly modified. Instead of a message, we have a table that updates
- Users log in revenue (salary, wage, paycheck,grant, etc.)
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

