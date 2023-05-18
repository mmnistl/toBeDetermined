# toBeDetermined

## Project Overview:

Determine the effect that paying back a college loan would have on a college graduate’s budget after school. One could use this information to understand how much of a loan a person should take out to go to school. 

Utilizing user input of high school standardized testing scores, the program will recommend majors to them based on their academic strengths. Since there is a correlation between students from lower income households and lower testing scores, this program would be especially helpful to students from lower income households in letting them know what student loans they can afford and to give them an idea of their future salary. 

## Formula to determine monthly payments:

 Payment =    ( r_) * ____Loan Amount______
                      	 12          1   -     __1___
			                	    (1 + r/12)n                                               
                           
  r = interest rate (expressed as a decimal.  (Ex. 3.5% = .035)
	n = loan length expressed in months. (Ex. a ten-year loan = 120 months)

 Calculate the monthly loan amount for various lengths of loans:
       5 years; 10 years; 15 years; 20 years; 30 years

 Find interest rates and amounts for various private and government loans for college.

Use the loan and the salary information to determine what percentage of any  particular college graduate’s salary would go towards their loan repayments. 

Divide the salary by 12 to get monthly amount, then the percentage of the loan relative to one’s salary = (monthly loan payment)/(monthly salary) * 100.  
Flow of Program:

## Pseudocode for program:
Prompt for major → 

prompt for job title →
 
prompt for loan amount → 

prompt for interest rate → 

prompt for term of loan → 

output: major, job, salary, term of loan, amount of loan, interest rate, monthly loan payment → 

display graphic


## Example output:

This is an interactive program that prompts the user to choose a major from a four-year university, then choose a corresponding job title. The user will input information about their student loan to determine if their average salary will be able to cover their monthly loan payments. This is applicable to universities in the United States only.
//could attempt to store all data into one file (need to ensure we keep track of key names e.g. Major)
Name of major? Pizza 

Please choose a major from the following list:
A
Anthropology
Astrophysics
B
Biology
Business
…
// accommodate for upper/lower case
// use error (string vs int vs double)

New output:
That is not the name of a listed major. Please check your spelling and try again.

Name of major? Biology

Please choose a major from the following list:
A
Anthropology
Astrophysics
B
Biology
Business
…

New output:
Name of job title? 3.5

Jobs you can get with a four-year Biology degree:
Biologist
Teacher
Technician
…

New output:
That is not the name of a listed job title. Please check your spelling and try again.

Name of job title? Teacher

Jobs you can get with a four-year Biology degree:
Biologist
Teacher
Technician
…

New output:
The national average yearly salary for a Teacher is $45,000.

Student loan amount (no more than six digits)? $100000

Interest rate on loan(as a percentage)? 4.5

Term of loan(in years)? 20

Final output: 
Chosen major: Biology
Chosen job: Teacher
Average yearly salary: $45,000
Loan amount: $100,000
Interest rate: 4.5%
Term of loan: 20 years
Monthly loan payment: $632
Percentage of monthly salary going toward loan: 17%

## Graphics:
The lower the percentage of your monthly salary going toward loan, the lower (greener) the meter and vise versa. Green would mean <=10%, yellow 10% to <=15%, orange 15% to <=20%, and red >20%.

## Resources: 
The following is a database of the various jobs nationwide, how many people are in each occupation, and the median and mean salaries of each profession:
Link to Bureau of Labor Statistics
https://www.bls.gov/oes/current/oes_nat.htm#00-0000

## Member's Contribution/Role
Madeline: Creating file
	obtaining and communicating with major/loan personel to properly format file for Scanner use

Amanda: File/major information
	Scanning for user input and file based on resonse of user. Store information on career choice and major which will be used by loan personel.

Jasmine: File/loan information
	Based on career choice loan information will be processes using data from file. Program will be created using math operations, scanner, printstream and potentially arrays.

Ryan: Graphic design 
	Based on final information on final loan rate.

