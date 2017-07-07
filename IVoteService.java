// Cristian Garcia

import java.util.HashMap;

public class IVoteService {

    @SuppressWarnings("unchecked")
    private Question currentQuestion;
    private HashMap<String, Integer> voteMap = new HashMap<String, Integer>(20);

    public void setNewQuestion(Question question){
        currentQuestion = question;
        voteMap.clear();
    }

    public void displayResults(){

        int[] votes = currentQuestion.getVotes();
        String[] possibleAnswers = currentQuestion.getPossibleAnswers();

        System.out.println("      " + currentQuestion.getPrompt() + "      ");
        for (int i = 0; i < votes.length; i++){
            System.out.println(possibleAnswers[i] + ": " + votes[i]);
        }
    }

    public void submitVote(String id, int vote){
        if (vote < currentQuestion.getPossibleAnswers().length && vote >= 0){
            Integer oldVote = voteMap.put(id, vote);

            if (oldVote != null){
                currentQuestion.retractVote(oldVote);
            }
            currentQuestion.submitVote(vote);
        }
        else {
            System.out.println("ERROR:INVALID VOTE (" + vote + ") FROM STUDENT: \"" + id + "\". VOTE NOT SUBMITTED.");
        }
    }
}
