import java.util.Scanner;
public class Studentgradecalculator{
    public static void main(String[]args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter The Number Of Subjects :");
        int numsubjects = SC.nextInt();
        int totalmarks = 0;
        for(int i =1; i<=numsubjects; i++){
            System.out.println("Enter Marks Obtained In Subjects"+i+"(out of 100):");
            int marks = SC.nextInt();
            totalmarks += marks;
        }
        double averagepercentage = (double) totalmarks/numsubjects;
        char Grade;
        if(averagepercentage >=90){
            Grade = 'A';
        }else if(averagepercentage >=75){
            Grade = 'B';  
        }else if(averagepercentage >=60){
            Grade = 'C';    
        }else if(averagepercentage >=45){
            Grade = 'D';
        }else if(averagepercentage >=30){
            Grade = 'E';
        }else{
            Grade = 'F';
        }
        System.out.println("\nTotal Marks :"+totalmarks);
        System.out.println("Average Percentage :"+averagepercentage);
        System.out.println("Grade :"+Grade);
        SC.close();

    }
}