//Artak Vanyan
//CS 3560
//iVote Simulator
//29 September 2022

//single choice type question with question & answer
public class sc implements Question{

    String question, answer;

    public String setQuestionType(){
        return question;
    }

    public String setAnswerType(){
        return answer;
    } 

    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    } 

    public boolean multipleChoice(){
        return false;
    } 
}
