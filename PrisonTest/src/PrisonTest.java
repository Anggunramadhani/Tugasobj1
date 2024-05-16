public class PrisonTest {
    public static void main(String[] args) {
        Prisoner twitch = new Prisoner("twitch", "Twitch", "5'8\" (1.73m)", "3 years");
        Prisoner bubba = new Prisoner("bubba", "Bubba", "6'10\" (2.08m)", "4 years");

        System.out.println(bubba == twitch);
        bubba = twitch;
        System.out.println(bubba == twitch);

        System.out.println("===Prisoner 1===");
        System.out.println("Variable: " + twitch.getVariable());
        System.out.println("Name: " + twitch.getName());
        System.out.println("Height: " + twitch.getHeight());
        System.out.println("Sentence: " + twitch.getSentence());

        System.out.println("\n===Prisoner 2===");
        System.out.println("Variable: " + bubba.getVariable());
        System.out.println("Name: " + bubba.getName());
        System.out.println("Height: " + bubba.getHeight());
        System.out.println("Sentence: " + bubba.getSentence());

    }
}



