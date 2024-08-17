# Cinema Room Manager

A simple program that automates cinema theatre management.


![img.png](img.png)

Photo by unknown on [Hyperskill](https://hyperskill.org/projects/133/stages/709/implement).

## Stage 1/5: Print seats


In this stage, some seat arrangement schemes is printed out to the console.
The output should contain 9 lines, the title "Cinema:" - 1 line and room size - 8 lines.

Stage implementation: [SeatPrinter.java ](src/cinema/SeatPrinter.java)

**Example:**

    Cinema:
    1 2 3 4 5 6 7 8
    1 S S S S S S S S
    2 S S S S S S S S
    3 S S S S S S S S
    4 S S S S S S S S
    5 S S S S S S S S
    6 S S S S S S S S
    7 S S S S S S S S

## Stage 2/5: Calculate the profit

In this stage, two positive integer numbers are read from the input: the number of rows, and the number of seats in each row. 

The ticket price is determined by the following rules:

- If the total number of seats in the screen room is not more than `60`, then the 
price of each ticket is `10` dollars.
- In a larger room, the tickets are `10` dollars for the front half of the rows and `8` dollars for the back half. 
- For odd number of rows, for example 9,  the first half is the first 4 rows, and the second half is the other 5 rows.

The calculated profits from the sold tickets and number of seats is printed at the end.

Stage implementation: [ProfitsCalculator.java ](src/cinema/ProfitsCalculator.java)

**Example:**


    Enter the number of rows:
    > 8
    Enter the number of seats in each row:
    > 9
    Total income:
    $648