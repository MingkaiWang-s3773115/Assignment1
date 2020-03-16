# SOFTWARE ENGINEERING FUNDAMENTALS Lab #1: Git 

**Time:** 30 minutes

**Weighting:** 13.5 points

This assessment is part of the _individual assessments_ of the course. There are 5 of them, but we only count the _best 4 out of 5_. That means that the worst result won't be taken into account.

Also, you cannot sit the assessment twice: you must sit for the assessment during your corresponding tutorial class.


<br />

## Introduction
This assessment evaluates the following CLOs:

- CLO 1: Explain and apply the main aspects of software engineering.
- CLO 5: communicate effectively with others, especially regarding the progress of the system development and the content of the design by means of reports and presentations.

The following topics are assessed:

- Basic Git Use.


<br />


## PART 0: Initial Setup
Open your git console, and perform the following commands to complete the set up for the lab. You have 5 minutes to do this.


#### Mac Users
You can complete this using regular console, or _Git Bash_. In any case, do the following before doing anything else.

1. Open a console and type the following:
```
history -c
exit
```

2. Open a _new_ console and perform the following. **You must use your RMIT University email account ONLY.**

```
git config --global user.name “[firstname lastname studentID]”
git config –global user.email “student.email@student.rmit.edu.au”
git config –global color.ui auto
```


#### Windows Users
You must use _Git Bash_ **only** to complete this assigment.

1. Create a new folder that you are going to use for the assigment.
3. Open _Git Bash_ on that location, by doing `Right Click -> Git Bash Here`
2. Perform the following commands. **You must use your RMIT University email account ONLY.**

```
history -c
git config --global user.name “[firstname lastname studentID]”
git config –global user.email “student.email@student.rmit.edu.au”
git config –global color.ui auto
```




<br />



## PART 1: Work and Solve It!

`clone` the assigment repo to your computer. Make sure all branches are downloaded.

In this repository, somebody made changes to the `updatingcode` branch, while somebody else worked on the `master` branch. During this exercise, you will merge both branches.

**Everything needs to be solved using command console _only_ (which console you use depends on your operative system). Evidence will be submitted in the last part. If you don't use console, you won't pass the assignment**.

While you solve the exercise, you will be required to use some extra commands to answer questions. This will increase your mark. 
- The question labeled "Basic Exercise" will grant you a PA if solved correctly with console log evidence.
- There is an "Extra Credit" question at the end. This is optional, but solving this correctly with appropriate console log evidence will grant you an HD (if everything else is perfectly correct).
- Questions labeled "Question N" (replace the N with a number) will increase your mark from PA to DI, if solved correctly. The answers must be drawn from using git commands; these commands must be present in the command console evidence.





<br />

### Questionnaire

**Question 0: Setup**

Create a `Answers.md` file in the root of your `master` branch. You must use some formatting in said file. For each question, copy the code given below, and type your answer replacing the placeholders.

Remember to add this file to Git, to save it when you are done answering questions (you can save multiple times) and to make sure it is uploaded in the remote repository.

<br />


**Question 1: Are there any untracked files in the `updatingcode` branch?** 

Answer with the following format. Replace the `??` in the copy-paste for the numbers you found.

```
# 1
- ??
```


<br />

**Basic Exercise: Perform the following steps.**

1. Create a new branch named `assignment`, deriving from the branch `updatingcode`.
2. Move to the new branch you created.
3. Check that there are no differences between your branch and `updatingcode` branch.
4. The changes that are present in the `master` branch must also be on your own branch. Solve any conflicts by keeping code modifications from both the `master` branch and your own branch (derived from `updatingcode`). _Note: if you do this by forcing the merge, you will get a "PA"_.
5. Commit the changes you just made on your own branch. The quality of your commit message will impact your marks.
6. Upload the changes you made to the remote repository.
7. Move back to the `master` branch.


<br />




**Extra Credit: Solve this excercise for an HD. It will only count if everything else is solved and correct**

1. There is a `.out` file in the `master` branch that has been erroneously committed. You need to remove the file from git, and ensure that it won't be pushed again.
2. Commit your changes on the `master` branch. The quality of your commit message will impact your marks.
3. Upload your changes to the `master` branch of the remote repository.



<br />


## PART 2: Console Log Evidence
You need to submit the evidence that you used the Git console to solve this. Submitting this is mandatory.

3.1 Make sure you are on the `master` branch.

3.2 Perform the following commands:

```
history > commands.txt
git add commands.txt
git checkout master
git commit -m "Adding command history"
git push origin master
```

<br />

## Rubric

The following is the rubric for the assignment.

| HD       | DI      | CR     |     PA   | F      |
| -------- | ------- | ------ | -------- | ------ |
| All questions answered and correct | All questions answered and correct | All questions answered, but some are incorrect. | Few or none questions answered. If submitted, most are incorrect or missing. | No questions answered. |
| Console log evidence submitted | Console log evidence submitted | Console log evidence submitted | Console log evidence submitted | No console log evidence | 
| Practical basic exercise solved correctly and submited. Consistently excellent commit message quality. | Practical basic exercise solved correctly and submited. Consistently excellent commit message quality. | Most practical exercises are correct, with some incorrect. Steps may be incorrect or not completely submitted. Few commits messages, or erratic quality (some are good, some are bad). | Basic exercise solving, without performing all required steps (guided by questions). No commit messages, or low quality messages. | Basic exercise not solved/incorrect, or not using the console. |
| Submitted extra exercise. Includes console log evidence, and must be correctly solved. | No extra exercise submitted. If it was submitted, there is no console log evidence, and/or is not correctly solved. | No extra exercise submitted. | No extra exercise submitted. | No extra exercise submitted. |
| This person follows the guide correctly, there are no more or less steps that required. Questions are solved correctly. Extra exercise is submitted and correct. | This person follows the guide correctly, there ar eno more or less steps that required. Questions are solved correctly. Extra exercise is not submitted, or is incorrect. | This person attempted to follow some steps, but some are incorrect or missing. Or they did extra steps to fix the error. | This person made the force merge, without answering questions or using all required commands. | |