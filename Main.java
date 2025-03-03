import java.lang.reflect.Array;
import java.util.*;
public class Main {
    static HashMap<String, ArrayList<String>> GroupTeams = new HashMap<>();
    static HashMap<String, ArrayList<String>> IndividualTeams = new HashMap<>();
    static HashMap<String, ArrayList<String>> TeamPoints = new HashMap<>();

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

                GroupTeams.put(teamName, new ArrayList<>());
                for (int j = 0; j < 5; j++) {
                    System.out.println("Enter name: ");
                    String memberName = scanner.nextLine();
                    GroupTeams.get(teamName).add(memberName);
                    if (teamName.toLowerCase().contains("stop")) {
                        break;

                    }
                }
                boolean check = true;
                while (check) {
                    System.out.println("Do you want to play 1 game or all games: ");
                    String gameChoice = scanner.nextLine();
                    if (gameChoice.contains("1") || gameChoice.toLowerCase().contains("one")) {
                        GroupTeams.get(teamName).add("1");
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
                                GroupTeams.get(teamName).add("tug of war");
                                check1 = false;

                            } else if (gameChoice1.contains("2") || gameChoice1.toLowerCase().contains("two")) {
                                GroupTeams.get(teamName).add("team cooking competition");
                                check1 = false;

                            } else if (gameChoice1.contains("3") || gameChoice1.toLowerCase().contains("three")) {
                                GroupTeams.get(teamName).add("back to back drawing");
                                check1 = false;

                            } else if (gameChoice1.contains("4") || gameChoice1.toLowerCase().contains("four")) {
                                GroupTeams.get(teamName).add("trivia");
                                check1 = false;
                            } else if (gameChoice1.contains("5") || gameChoice1.toLowerCase().contains("five")) {
                                GroupTeams.get(teamName).add("scavenger hunt");
                                check1 = false;

                            } else {
                                System.out.println("Error please try again");

                            }
                        check = false;
                        }
                    } else if (gameChoice.toLowerCase().contains("all")) {
                        GroupTeams.get(teamName).add("0");
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

            for (int i = 0; i < 3; i++) { // Loop
                String positionText = (i == 0) ? "1st" : (i == 1) ? "2nd" : "3rd";
                String teamName;

                while (true) { // stops when "stop" is said
                    System.out.println("\nEnter the team that came " + positionText + " (or type 'stop' to skip): ");
                    teamName = scanner.nextLine().trim();

                    if (teamName.equalsIgnoreCase("stop")) {
                        System.out.println("\nSkipping the rest of the input for this game...");
                        break; // Exit loop and move to the next game
                    }

                    if (GroupTeams.containsKey(teamName)) {
                        GroupTeams.get(teamName).add(String.valueOf(points[i])); // Add points
                        break; // Exit loop once a valid team is entered
                    } else {
                        System.out.println("\n Error, Team not found. Please enter a valid team name.");
                    }
                }

                if (teamName.equalsIgnoreCase("stop")) {
                    break; // Skip the rest of the places for this game
                }
            }
        }
        System.out.println("All results recorded successfully!");
    }
}





