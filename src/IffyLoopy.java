/*
Loopy
Create ONE string variable to store the output of 5 words that a user will enter at random.

Iffy
Set a boolean value called redEyes.

The value will depend on the value entered by the user for the question "Are your eyes red?"


Create an application that will ask,

"Are your eyes red?"

If the response is 'y', Or 'yes' (regardless of case), then your application should print out:
"Get some sleep!"


Otherwise your application should print out "You look great!"

Use the value of redEyes to determine whether the user should be complimented or not.

Iffy Loop
Make sure after the application asks the question the first time, you get a prompt asking,
"Do you want to try again?"
Your application should continue until the user enters 'n' as an answer.
 */

import java.util.Scanner;

public class IffyLoopy {
    public static void main(String [] args) {
        String storedString;
        boolean redEyes = true;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Are your eyes red? ");
            storedString = sc.next();
            storedString.toLowerCase();
            if(storedString.equals("yes") || storedString.equals("y"))
                System.out.println("Get some sleep!");
            else
                System.out.println("You look great!");

            System.out.print("Do you want to try again? ");
            storedString = sc.next();
            if(storedString.toLowerCase().equals("n"))
                redEyes = false;
        } while(redEyes == true);

    }
}
