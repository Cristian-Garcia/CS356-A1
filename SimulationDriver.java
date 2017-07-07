// Cristian Garcia

import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {

       Random rand = new Random();
       IVoteService service = new IVoteService();
       int numStudents = rand.nextInt(50);
       Student[] students = new Student[numStudents];

       System.out.println("# OF STUDENTS IN SERVICE: " + numStudents);

       for (int i = 0; i < students.length; i++){
           students[i] = new Student(String.valueOf(rand.nextInt(1000000)), service);
       }

       String[] answers = {"A","B","C"};
       service.setNewQuestion(new MultipleChoiceQuestion("Please choose the letter 'C'", answers));

       for (Student s : students){
           s.submitVote(rand.nextInt(3));
       }

       service.displayResults();

       students[5].submitVote(2);
       students[5].submitVote(1);
       students[5].submitVote(5);

       service.setNewQuestion(new SingleChoiceQuestion("This statement is false.", "True", "False"));

       for (Student s : students){
           s.submitVote(rand.nextInt(2));
       }

       service.displayResults();
   }
}
