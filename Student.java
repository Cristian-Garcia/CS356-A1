// Cristian Garcia

public class Student {
    private String id;
    private IVoteService service;

    public Student(String id, IVoteService service){
        this.id = id;
        this.service = service;
    }

    public String getID(){
        return id;
    }

    public void submitVote(int vote){
        service.submitVote(id, vote);
    }
}
