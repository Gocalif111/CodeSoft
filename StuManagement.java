import java.util.*;
public class StuManagement {
    public static void main(String args[]){
        System.out.println("enter marks obtained in each subject");
        //Take input marks of all five subjects
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        //total amrks
        int totMarks=(sub1+sub2+sub3+sub4+sub5);
        //calculate percentage
        float percent=(float)totMarks/5;
        char grade;
        //grade allotment according to percentage obtained
        if(percent>=90){
             grade='A';
        }
        else if(percent>=80 && percent<90){
           grade='B';
        }
        else if(percent>=70 && percent<80){
            grade='C';
        }
        else{
            grade='D';
        }
        System.out.println("Total marks = "+totMarks+" | "+"percentage = "+percent+"%"+" | "+"Grade = "+grade);
    }
}
