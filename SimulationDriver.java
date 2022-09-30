//Artak Vanyan
//CS 3560
//iVote Simulator
//29 September 2022

import java.util.Random;
import java.util.ArrayList;

//Create students & answers
public class SimulationDriver {

    private static Student students[];
    private static Question question;
    private static Random random = new Random();
    public static void main(String[] args){

        students = generateStudents();

        int type = random.nextInt(2);
        if (type == 0) {
            question = new mc();
            mc();
        }
        else if(type == 1) {
            question = new sc();
            sc();
        }
        VotingService vote = new VotingService(students, question);
    }

    private static Student[] generateStudents(){

        int numStudents = 30;
        Student students[] = new Student[numStudents];
        ArrayList<Integer> studentIDs= new ArrayList<>(); 
 
        for(int i=0; i<numStudents; i++) {
           int ID= random.nextInt(8999)+1000;
           while(studentIDs.contains(ID))
           ID= random.nextInt(8999)+1000;
           
        studentIDs.add(ID);
        students[i]=new Student();
        students[i].setID(ID);
        }
        return students;
    }
 
    private static void mc(){ 

        String answers[] = {"A", "B", "C", "D"};
        question.setQuestion("Sample Question #1: Choose A, B, C or D");
        int choice = random.nextInt(4);
        question.setAnswer(answers[choice]); 

        for (int i=0; i<students.length; i++) { 
            choice = random.nextInt(4);
            students[i].setAnswer(answers[choice]);
        }
    }
    
    private static void sc(){

       question.setQuestion("Sample Question #2: Choose True or False ");
       question.setAnswer("True"); 

        for(int i=0; i<students.length; i++) {
           int choice = random.nextInt(2);
           if(choice==0)
              students[i].setAnswer("True");
           else
              students[i].setAnswer("False");
        }
    }
}