package AbstractClasses2;

public class AdditionActivity extends MathActivity{

    public AdditionActivity(String name){
        super (name, "Addition");
    }
    @Override
    void generateQuestion() {
       num1 = random.nextInt(10) + 1; // 0,1,2,3,4... hantud 9 then + 1 para 10
       num2 = random.nextInt(10) + 1;
    }

    @Override
    String getQuestionText() {
        return num1 + " + " + num2 + " = ?";
    }

    @Override
    boolean checkAnswer(int studentAnswer) {
        return studentAnswer == (num1 + num2);
    }
   
    
    
}




