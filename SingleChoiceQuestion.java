// Cristian Garcia

public class SingleChoiceQuestion implements Question{
private String prompt;
    private int[] votes;
    private String[] possibleAnswers;

    public SingleChoiceQuestion(String prompt, String possibleAnswer1, String possibleAnswer2){
        this.prompt = prompt;
        votes = new int[2];
        this.possibleAnswers = new String[]{possibleAnswer1, possibleAnswer2};
    }

    public String getPrompt(){
        return prompt;
    }

    public int[] getVotes(){
        return votes;
    }

    public String[] getPossibleAnswers(){
        return possibleAnswers;
    }

    public void submitVote(int vote){
        votes[vote] = votes[vote] + 1;
    }

    public void retractVote(int vote){
         votes[vote] = votes[vote] - 1;
    }
}
