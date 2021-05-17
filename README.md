# CashRegisterProject

## Overview

The best little cash register simulator in this whole repo. Designed to perform the basic logic of a checkout counter change machine. Takes the item price and compares against the amount paid and outputs accordingly.

### Technologies Used:

 -Java
 -Conditionals
 -Looping
 -Input validation
 -Data type conversion

### How to Run

Type in the desired price and the amount the customer paid in cash. If the amounts are the same, the transaction ends. If the amount paid is less than the price, the amount still owed by the customer is shown and the option to add more money from the customer is given. Once the price is paid in full either the transaction ends or, if change is due, the amount in bills and coins is given.

### Lessons Learned

I was curious how to do the calculation without using modulo (although I think in a production environment, that's definitely what I would use!) and figured that just replicating what it does using a loop and continue would be the simplest solution. I also found that having someone else beta test is great for quickly finding areas to improve, like verifying inputs. Lastly, adding another loop to update the amount paid until it was enough seemed like something obvious to add that would greatly improve the user experience in real life, which I only discovered through reloading the app many times during testing.
