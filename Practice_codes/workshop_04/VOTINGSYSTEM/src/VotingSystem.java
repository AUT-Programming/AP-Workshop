import java.util.ArrayList;
import java.util.Objects;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        this.votingList = new ArrayList<>();
    }

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices) {
        Voting voting = new Voting(type, question, isAnonymous);
        for (String choice : choices) {
            voting.createChoices(choice);
        }
        votingList.add(voting);
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VotingSystem that = (VotingSystem) o;
        return Objects.equals(votingList, that.votingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(votingList);
    }

    public Voting getVoting (int index){
        return votingList.get(index);
    }

    public  void  printResult (int index){
        votingList.get(index).printResult();
    }

    public  void  printVoters ( int index) {
        votingList.get(index).printVoters();
    }

    public void  pringVoting( int index){
        Voting voting = votingList.get(index);
        System.out.println(voting.getQuestion() + " : ");
        for ( String choice : voting.getChoices()){
            System.out.println(choice);
        }
    }



}
