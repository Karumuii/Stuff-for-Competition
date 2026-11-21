package AbstractClasses2;

public class SubtractionActivity extends MathActivity{
   
    public SubtractionActivity(String name){
        super (name, "Subtraction");
    }
    @Override
    void generateQuestion() {
       num1 = random.nextInt(10);// 0,1,2,3,4... hantud 9 then + 1 para 10
       num2 = random.nextInt(10);
    }

    @Override
    String getQuestionText() {
        return num1 + " - " + num2 + " = ?";
    }

    @Override
    boolean checkAnswer(int studentAnswer) {
        return studentAnswer == (num1 - num2);
    }
   
    
}




