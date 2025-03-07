import java.lang.reflect.Array;
import java.util.*;

class TeamData {
    ArrayList<String> members;
    String gameChoice;
    String chosenGame;
    int points;
    public TeamData(ArrayList<String> members, String gameChoice, String chosenGame) {
        this.members = members;
        this.gameChoice = gameChoice;
        this.chosenGame = chosenGame;
        this.points = 0; // setting points
    }
    public void addPoints(int value) {
        this.points += value;
    }

    @Override
    public String toString() {
        return "Members: " + members + ", Game Choice: " + gameChoice + ", Chosen Game: " + chosenGame;
    }
}
public class Main {
    static HashMap<String, TeamData> GroupTeams = new HashMap<>();
    static HashMap<String, ArrayList<String>> IndividualTeams = new HashMap<>();
    //static HashMap<String, Integer>  TeamPoints = new HashMap<>();
    static String [][] TeamPoints = new String [4][2];

    public static void main(String[] args) {
        registerTeams();
        pointsSystemTeams();

    }

    public static void registerTeams() {

        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Team Name: ");
            String teamName = scanner.nextLine();

            if (teamName.toLowerCase().contains("stop")) {
                break;
            } else {

                TeamPoints[i][0] = teamName;
                TeamPoints[i][1] = "0";
                GroupTeams.put(teamName, new TeamData(new ArrayList<>(), "", ""));
                for (int j = 0; j < 5; j++) {
                    System.out.println("Enter name: ");
                    String memberName = scanner.nextLine();
                    GroupTeams.get(teamName).members.add(memberName);
                    if (teamName.toLowerCase().contains("stop")) {
                        break;

                    }
                }
                boolean check = true;
                while (check) {
                    System.out.println("Do you want to play 1 game or all games: ");
                    String gameChoice = scanner.nextLine();
                    if (gameChoice.contains("1") || gameChoice.toLowerCase().contains("one")) {
                        GroupTeams.get(teamName).gameChoice = "1";
                        boolean check1 = true;
                        while (check1) {
                            System.out.println("""
                                    
                                    
                                    We have 5 different events please select one out of the 5 options by selecting the corresponding number
                                    1: Tug of War
                                    2: Team Cooking Competition
                                    3: Back to Back Drawing
                                    4: Trivia
                                    5: Scavenger Hunt
                                    """);
                            String gameChoice1 = scanner.nextLine();
                            if (gameChoice1.contains("1") || gameChoice.toLowerCase().contains("one")) {
                                GroupTeams.get(teamName).chosenGame = ("tug of war");
                                check1 = false;

                            } else if (gameChoice1.contains("2") || gameChoice1.toLowerCase().contains("two")) {
                                GroupTeams.get(teamName).chosenGame = ("team cooking competition");
                                check1 = false;

                            } else if (gameChoice1.contains("3") || gameChoice1.toLowerCase().contains("three")) {
                                GroupTeams.get(teamName).chosenGame = ("back to back drawing");
                                check1 = false;

                            } else if (gameChoice1.contains("4") || gameChoice1.toLowerCase().contains("four")) {
                                GroupTeams.get(teamName).chosenGame = ("trivia");
                                check1 = false;
                            } else if (gameChoice1.contains("5") || gameChoice1.toLowerCase().contains("five")) {
                                GroupTeams.get(teamName).chosenGame = ("scavenger hunt");
                                check1 = false;

                            } else {
                                System.out.println("Error please try again");

                            }
                            check = false;
                        }
                    } else if (gameChoice.toLowerCase().contains("all")) {
                        GroupTeams.get(teamName).chosenGame = ("0");
                        check = false;
                    } else {
                        System.out.println("Error Please Try Again");
                    }
                    System.out.println(GroupTeams);

                }
            }

        }
    }


    public static void registerIndividualTeams() {

        for (int i = 0; i < 20; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Name: ");
            String individualName = scanner.nextLine();
            IndividualTeams.put(individualName, new ArrayList<>());
            IndividualTeams.get(individualName);

            System.out.println("Do you want to play 1 game or all games: ");
            String gameChoice = scanner.nextLine();
            boolean check = true;
            while (check) {
                if (gameChoice.contains("1") || gameChoice.toLowerCase().contains("one")) {
                    IndividualTeams.get(individualName).add("One Game");

                    boolean check1 = true;
                    while (check1) {
                        System.out.println("""
                                
                                
                                We have 5 different events please select one out of the 5 options by selecting the corresponding number
                                1: Javelin
                                2: Maths quiz
                                3: Drawing Blindfolded
                                4: Fitness Pacer Test
                                5: Faster to build a house of cards
                                """);
                        String gameChoice1 = scanner.nextLine();
                        if (gameChoice1.contains("1") || gameChoice.toLowerCase().contains("one")) {
                            IndividualTeams.get(individualName).add("javelin");
                            check1 = false;

                        } else if (gameChoice1.contains("2") || gameChoice1.toLowerCase().contains("two")) {
                            IndividualTeams.get(individualName).add("maths quiz");
                            check1 = false;

                        } else if (gameChoice1.contains("3") || gameChoice1.toLowerCase().contains("three")) {
                            IndividualTeams.get(individualName).add("drawing blindfolded");
                            check1 = false;

                        } else if (gameChoice1.contains("4") || gameChoice1.toLowerCase().contains("four")) {
                            IndividualTeams.get(individualName).add("fitness pacer test");
                            check1 = false;
                        } else if (gameChoice1.contains("5") || gameChoice1.toLowerCase().contains("five")) {
                            IndividualTeams.get(individualName).add("Fastest to build a house of cards");
                            check1 = false;

                        } else {
                            System.out.println("Error please try again");

                        }
                    }
                    check = false;
                } else if (gameChoice.toLowerCase().contains("all")) {
                    IndividualTeams.get(individualName).add("0");
                    check = false;
                } else {
                    System.out.println("Error Please Try Again");
                }
            }

            System.out.println(IndividualTeams);
        }
    }

    public static void pointsSystemTeams() {
        Scanner scanner = new Scanner(System.in);
        String[] games = {
                "Tug of War", "Team Cooking Competition", "Back to Back Drawing",
                "Trivia", "Scavenger Hunt"
        };
        int[] points = {5, 3, 1}; // Points for 1st, 2nd, and 3rd place

        for (String game : games) {
            System.out.println("Enter results for: " + game);

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter next place team");
                String teamName = scanner.nextLine().trim();
                Boolean check = true;
                while (check) {
                    for (int j = 0; j < 4; j++) {
                        if (teamName.equals(TeamPoints[j][0])) {
                            TeamPoints[j][1] = "" + (Integer.parseInt(TeamPoints[j][1]) + points[i]);
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println("Team not found");
                        check = false;
                    }
                }

            }
            System.out.println(TeamPoints[0][1]);
        }
    }

    public static void pointsSystemIndividuals() {
        Scanner scanner = new Scanner(System.in);
        String[] games = {
                "Javelin", "Maths Quiz", "Drawing Blindfolded",
                "Fitness Pacer Test", "Fastest to Build a House of Cards"
        };
        int[] points = {5, 3, 1}; // Points for 1st, 2nd, and 3rd place

        for (String game : games) {
            System.out.println("Enter results for: " + game);

            // Create a list of eligible individuals for this game
            ArrayList<String> eligibleIndividuals = new ArrayList<>();

            for (String individual : IndividualTeams.keySet()) {
                ArrayList<String> individualData = IndividualTeams.get(individual);
                String gameChoice = individualData.get(0); // First element is "1" (one game) or "0" (all games)
                String chosenGame = individualData.get(1); // Second element is the selected game

                if (gameChoice.equals("0") || chosenGame.equalsIgnoreCase(game)) {
                    eligibleIndividuals.add(individual);
                }
            }

            if (eligibleIndividuals.isEmpty()) {
                System.out.println("No individuals are eligible for this game.");
                continue;
            }

            // Assign points to the top 3 individuals
            for (int i = 0; i < 3; i++) {
                if (eligibleIndividuals.isEmpty()) break;

                String positionText = (i == 0) ? "1st" : (i == 1) ? "2nd" : "3rd";
                String individualName;

                while (true) {
                    System.out.println("\nEnter the individual that came " + positionText + " (or type 'stop' to skip): ");
                    individualName = scanner.nextLine().trim();

                    if (individualName.equalsIgnoreCase("stop")) {
                        System.out.println("\nSkipping the rest of the input for this game...");
                        break;
                    }

                    if (eligibleIndividuals.contains(individualName)) {
                        IndividualTeams.get(individualName).add(String.valueOf(points[i])); // Add points
                        eligibleIndividuals.remove(individualName); // Remove to avoid duplicate ranking
                        break;
                    } else {
                        System.out.println("\nError: Individual is either not found or not eligible for this game.");
                    }
                }

                if (individualName.equalsIgnoreCase("stop")) break;
            }
        }

        System.out.println("All results recorded successfully!");
    }

}






