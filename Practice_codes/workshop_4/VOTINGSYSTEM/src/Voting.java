import java.time.LocalDateTime;
import java.util.*;

public class Voting {
    private  int type;
    private  String question;
    private boolean isAnonymouse;

    private ArrayList<Person> voters;
    private HashMap<String, HashSet<Vote>> choices;

    public Voting(int type, String question, boolean isAnonymouse) {
        this.type = type;
        this.question = question;
        this.isAnonymouse = isAnonymouse;
        voters = new ArrayList<>();
        choices = new HashMap<>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getChoices(){
        return new ArrayList<>(choices.keySet());
    }

    public void  createChoices ( String choice){
        choices.put(choice, new HashSet<>());
    }

    public  void  vote (Person voter , ArrayList<String> voterChoices){
        if(this.type == 0 && voterChoices.size() > 1){
            System.out.println("multiple answers is not allowed");
            return;
        }
        voters.add(voter);
        Vote vote = new Vote(voter, LocalDateTime.now().toString());
        for ( String choice : voterChoices){
            choices.get(choice).add(vote);
        }

    }

    public void vote ( Person person){
        voters.add(person);
        Vote vote = new Vote(person, LocalDateTime.now().toString() );
        Random random = new Random();
        int choice = random.nextInt(choices.size());
        int num = 0;
        for ( String str : choices.keySet()){
            if ( choice == num)
                choices.get(str).add(vote);
            num++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voting voting = (Voting) o;
        return type == voting.type && isAnonymouse == voting.isAnonymouse && Objects.equals(question, voting.question) && Objects.equals(voters, voting.voters) && Objects.equals(choices, voting.choices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, question, isAnonymouse, voters, choices);
    }

    public void  printResult (){
        for(String str : choices.keySet()){
            System.out.println(str + " : " + choices.get(str).size());
        }
    }

    public  void  printVoters (){
        if( this.isAnonymouse){
            System.out.println("this voting is Anonymous");
            return;
        }
        for ( String choice : choices.keySet()){
            if(choices.get(choice).size() == 0){
                System.out.println(choice + " : nobody");
                continue;
            }
            System.out.println(choice + " : ");
            for (Vote vote : choices.get(choice)){
                System.out.println(vote.getVoter().getFirstName() + " " + vote.getVoter().getLastName());
                System.out.println(" / ");
            }
        }
    }

}
