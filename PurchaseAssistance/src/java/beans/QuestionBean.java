
package beans;

import java.io.Serializable;
import java.util.Random;

public class QuestionBean implements Serializable{
    private String[][][] questions = new String[2][2][5];
    private String question;
    private int sCount = 0;
    private int qNumber;
    private Random random = new Random();
    int rnd = random.nextInt(5);

    public int getRnd() {
        return rnd;
    }

    public void setRnd(int rnd) {
        this.rnd = rnd;
    }

    public int getqNumber() {
        return qNumber;
    }

    public void setqNumber(int qNumber) {
        this.qNumber = qNumber;
    }

    public int getsCount() {
        return sCount;
    }

    public void setsCount(int sCount) {
        this.sCount = sCount;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String[][][] getQuestions() {
        return questions;
    }

    public void setQuestions(String[][][] questions) {
        this.questions = questions;
    }
    
    public void addQuestion(){
        questions[0][0][0] = "Do you want a shirt or pants?";
        questions[0][1][0] = "Do you want white or blue?";
        questions[1][0][0] = "High quality or low price?";
        questions[0][0][1] = "Do you want a hat or shoes?";
        questions[0][1][1] = "Do you want black or white?";
        questions[1][0][1] = "High quality or low price?";
        questions[0][0][2] = "Do you need to remove a nail or screw?";
        questions[0][1][2] = "Do you want powered or manual use?";
        questions[1][0][2] = "High quality or low price?";
        questions[0][0][3] = "Do you want a hamburger or hotdog?";
        questions[0][1][3] = "Do you want mustard or ketchup?";
        questions[1][0][3] = "Sesame seed or normal bun?";
        questions[0][0][4] = "Do you want eggs or pancakes?";
        questions[0][1][4] = "Do you want bacon or sausage with that?";
        questions[1][0][4] = "Orange juice or soda?";
        
        
    }
    public QuestionBean(){
        
    }
}
