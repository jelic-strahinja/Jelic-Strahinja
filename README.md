Hello! I am writing here what code does and how to run it as you said.

I wrote code in java/selenium/chrome webdriver + reading input from Excel file;
I deleted use cases that were created by automatic tests so if it is necessary for them do be present on the website, u can run tests first.

As you said on github I should use my credentials to login and create Use cases, I chose to put login steps in '@BeforeMethod' before every test; 
I could have added a cookie (which might be better) but i think the change is not significant, and I hope I followed instructions as you intended;


First test confirms 
-that 'Title' field wont throw erroe message with lower boung of 5 characters
-that 'Description' wont throw error message without any imput 
-that 'Expected Result' will throw error message with input of 4 characters (1 less than minimum requirement of 5)
-that 'YES/NO' will not throw error if i leave it on NO
-that 'Use case step 1' wont throw error if i have only one step with 1 character input
-that Use case will be created after i change 'Expected result' to 5 characters which is minimum;

Secon test confirms
-that all fields can only be number inputs
-that 'Title' will throw error with only 4 character input (1 less that min requirement)
-that 'Description' wont throw error if it has 256 (which is 1 more than upper bound for other fields)
-that 'Expected result' wont throw error if it has 255 characters (the upper limit)
-that Toggle button works
-that there can be more than 1 use case step (10 in this case) and that 1 can be empty (if other have values)
-that use case will be created with 'Title' having 255 characters (which is upper bound)

Third test confirms
-that 'Expected result' will throw error with 256 long character input (1 more than upper limit)
-that 'Use case step' can have 255 which is the upper limit
-that use case will be created when i lower the length of expected results

Forth test confirms
-that 'Title' will throw error when i insert 256 characters 
-that fields can have special characters
-that case will be created when title is in the bounds of allowed length

Fifth method transforms input fields to the sentence that says how long was previous input
It does so, when i get to page with created use cases, i pick them in a list.
then i initiate for loop where i will go through each created use case(in this case 4)
i made method that have webelement parameter and it pick up length of sentence and form new sentence
i send each element to that method, and when i get to the use case steps, i initiate new nested for loop
so that i can get each of the use case step;
method that i wrote for text transformation also asserts that transformation was successful


*Little disclaimer, I wanted to write more methods but I was working on a field and I was not in Novi Sad (where my computer is)
and i practically didnt have time and computer was low on spec (it was hard to run bot eclipse and chrome) I was doing this for two day
and I hope that you will considere that. 

also, i had trouble with creating issue reports (didn't want to accept submit button), and i know it was not in my task, but i noticed when i login it tells me that password is wrong
for specific mail (with is security issue) because message should say something like (email or password is wrong) not password for that mail is frong (one step closer to getting in illegaly)


