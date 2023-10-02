// Author: Sai Krishna Anuga

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        
        char letterGrade;
        
        System.out.println(" Please enter your grade: ");

        Scanner scan =  new Scanner(System.in);

        int grade = scan.nextInt();

        if (grade <= 100  && grade >= 90 )
            letterGrade = 'A';

        else if(grade >= 80)
            letterGrade = 'B';

        else if(grade >= 70)
            letterGrade = 'C';

        else if(grade >= 60)
            letterGrade = 'D';

        else
            letterGrade = 'F';

            System.out.println("the letterGrade for " + grade + " is " + letterGrade);

            scan.close();
        
    }
    
}    

