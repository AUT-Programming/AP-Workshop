import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> choices = new ArrayList<>();
        choices.add("YES");
        choices.add("NO");
        choices.add("MAYBE");
        votingSystem.createVoting("do you participate this class", false, 0, choices);
        Person person = new Person( " Bita" , " shayegan");
        Person person1 = new Person( "Reza" , "Saberi");
        ArrayList<String> choices1 = new ArrayList<>();
        choices1.add("YES");
        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("NO");
        votingSystem.getVoting(0).vote(person, choices1);
        votingSystem.getVoting(0).vote(person1, choices2);
        votingSystem.getVoting(0).vote(person);
        votingSystem.pringVoting(0);
        System.out.println("________________\n");
        votingSystem.printResult(0);
        System.out.println("________________\n");
        votingSystem.printVoters(0);


    }
}