package skoolperformance;

import java.util.Scanner;
public class SkoolPerformance {

    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Enter TestOne Marks ");
        int TestOne = input.nextInt();
        
        System.out.println(" Enter TestTwo Marks ");
        int TestTwo = input.nextInt();
        
        System.out.println(" Enter Assignment Marks ");
        int Assignment = input.nextInt();
        
        int a = TestOne * 30/100;
        int b = TestTwo * 30/100;
        int c = Assignment * 40/100;
        int d = (a + b);
        
        int SemesterMark = d + c;
        System.out.println(" SemesterMark " + SemesterMark + "%" );
        
        if(SemesterMark <= 39){
            System.out.println(" Exam not Granted ");
        }
        else if(SemesterMark >= 40 && SemesterMark < 75){
            System.out.println(" Exam Granted ");
        }
        else if (SemesterMark >= 75 && SemesterMark == 100){
            System.out.println(" Exam Granted " + " Distinction ");
        }
        
        System.out.println(" Enter ExamMark ");
        int ExamMark = input.nextInt();
        int e = ExamMark/100 *60;
        
        int FinalMark = e + SemesterMark;
        System.out.println(" FinalMark " + FinalMark);
        
        if(FinalMark >= 0 && FinalMark <= 29){
            System.out.println(" Level 1-Not Achieved " + "Fail");
        }
        else if(FinalMark >=30 && FinalMark <= 39){
            System.out.println("Level 2-Elementantary Achieved");
        }
        else if(FinalMark >= 40 && FinalMark <= 49){
            System.out.println("Level 3-Moderate Achievement");
        }
        else if(FinalMark >= 50 && FinalMark <= 59){
            System.out.println("Level 4-Moderate Achievement");
        }
        else if(FinalMark >= 60 && FinalMark <= 69){
            System.out.println("Level 5-Substantial Achievement");
        }
        else if(FinalMark >= 70 && FinalMark <= 79){
            System.out.println("Level 6-Meritorious Achievement");
        }
        else if(FinalMark >=80 && FinalMark <= 100){
            System.out.println("Level 7-Outstanding Achievement");
        }
    }
}
    

