package AbstractClasses2;
import java.util.*;
public abstract class MathActivity {
   String studName;
   String activityType;
   int numOfQuestions, correctAnswers, num1, num2;
   Random random = new Random();
   
   public MathActivity(String studName, String activityType){
       this.studName = studName;
       this.activityType = activityType;
       this.correctAnswers = 0;
   }
    
   abstract void generateQuestion();
   abstract String getQuestionText();
   abstract boolean checkAnswer(int studentAnswer);
   
   public void setNumOfQuestions(int n){
       this.numOfQuestions = n;
   }
    public void start (Scanner sn){
        for(int i = 1; i <= numOfQuestions; i++){
            generateQuestion();
            int answer = 0;
            boolean valid = false;
            
            while (!valid){ // is valid
                System.out.println("Question #" + i + ": " + getQuestionText());
                System.out.print("Your Answer: ");
                String inp = sn.nextLine().trim();
                
                try{
                    answer = Integer.parseInt(inp);
                    valid = true;
                } catch (Exception e){
                    System.out.println("Invalid Input. Please enter a valid number.");
                }
            }
            
            if(checkAnswer(answer)){
                System.out.println("Correct Answer. SHEESH VAMOS!\n");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. Better luck next time :D\n");
        }   }
    }
    
    public void display(){
        System.out.println("========= RESULTS =======");
        System.out.println("Student: " + studName);
        System.out.println("Activity Type: " + activityType);
        System.out.println("Number of Questions: " + numOfQuestions);
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Score: " + correctAnswers + "/" + numOfQuestions);
    }
}





