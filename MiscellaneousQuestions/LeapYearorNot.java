package MiscellaneousQuestions;

public class LeapYearorNot {
    public static void main(String[] args) {
        int year=2024;
        if(year%400==0){
            System.out.println("Leap");
        }
        else if(year%100==0){
            System.out.println("Not leap");
        }
        else if(year%4==0){
            System.out.println("Leap");
        }
        else{
            System.out.println("Not Leap");
        }
    }
}
