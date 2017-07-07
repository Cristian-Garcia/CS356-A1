// Cristian Garcia

public interface Question {
    public String getPrompt();
    public int[] getVotes();
    public String[] getPossibleAnswers();
    public void submitVote(int vote);
    public void retractVote(int vote);

}
