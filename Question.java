//Artak Vanyan
//CS 3560
//iVote Simulator
//29 September 2022

//Question interface 
interface Question {
    
    public String setQuestionType(); //define whether multiple-choice or single-choice question

    public String setAnswerType(); //define answer

    public boolean multipleChoice(); //define whether multiple choice

    public void setQuestion(String question); //sets a question

    public void setAnswer(String answer); //sets an answer   
}
