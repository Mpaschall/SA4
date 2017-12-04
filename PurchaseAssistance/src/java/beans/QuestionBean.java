
package beans;

import java.io.Serializable;
import java.util.Random;

public class QuestionBean implements Serializable{
    
    //variables
    private String[][][] questions = new String[2][2][5];
    private String question;
    private int sCount = 0;
    private int qNumber;
    private int rnd;
    private String item;
    private String a1;
    private String a2;
    private String a3;

    //getters and setters
    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public int getRnd() {
        
        //generates a new random number every time getRnd is called
        Random random = new Random();
        rnd = random.nextInt(5);
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
    
    //Method to add questions to the binary array tree
    public void addQuestion(){
        questions[0][0][0] = "Do you want a shirt or pants?";
        questions[0][1][0] = "Do you want white or blue?";
        questions[1][0][0] = "High quality or low price?";
        questions[0][0][1] = "Do you want a hat or shoes?";
        questions[0][1][1] = "Do you want black or white?";
        questions[1][0][1] = "High quality or low price?";
        questions[0][0][2] = "Do you need a hammer or screwdriver?";
        questions[0][1][2] = "Do you want powered or manual use?";
        questions[1][0][2] = "High quality or low price?";
        questions[0][0][3] = "Do you want a hamburger or hotdog?";
        questions[0][1][3] = "Do you want mustard or ketchup?";
        questions[1][0][3] = "Deluxe or standard?";
        questions[0][0][4] = "Do you want eggs or pancakes?";
        questions[0][1][4] = "With or without salt?";
        questions[1][0][4] = "Deluxe or standard?";
        
        
    }
    
    //Default constructor
    public QuestionBean(){
        
    }
}
