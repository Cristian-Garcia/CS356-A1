// Cristian Garcia

public class MultipleChoiceQuestion implements Question{
    private String prompt;
    private int[] votes;
    private String[] possibleAnswers;

    public MultipleChoiceQuestion(String prompt, String[] possibleAnswers){
        this.prompt = prompt;
        votes = new int[possibleAnswers.length];
        this.possibleAnswers = possibleAnswers;
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
