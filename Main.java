import java.lang.reflect.Array;
import java.util.*;
public class Main {
    HashMap<String, ArrayList<String>> GroupTeams = new HashMap<>();
    HashMap<String, ArrayList<String>> IndividualTeams = new HashMap<>();
    public static void main(String[] args) {
        registerTeams();
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
                                3: Back to Back Drwaing
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

    public void pointsSystemTeams() {

        boolean check3 = true;
        Scanner scanner = new Scanner(System.in);
        while (check3) {
            System.out.println(" Please enter what team came 1st in Tug of War:");
            String TowFP = scanner.nextLine();
            if (this.GroupTeams.containsKey(TowFP)){
                GroupTeams.get(TowFP).add("5"); // 1st place gets 5 points
            }else {
                System.out.println("Error, team not found. Please enter a valid team name."); // makes sure any name not in the list isn't valid
            }

            System.out.println("please Enter what team came 2nd in Tug of War:");
            String TowSP = scanner.nextLine();

            if (this.GroupTeams.containsKey(TowSP)){
                GroupTeams.get(TowSP).add("3"); // 2nd place gets 3 points
            }else {
                System.out.println("Error, team not found. Please enter a valid team name."); // makes sure any name not in the list isn't valid
            }

            System.out.println("Please Enter what team came 3rd in Tug of War:");
            String TowTP = scanner.nextLine();

            if (this.GroupTeams.containsKey(TowTP)){
                GroupTeams.get(TowTP).add("1"); // 3rd place gets 1 points
            }else {
                System.out.println("Error, team not found. Please enter a valid team name."); // makes sure any name not in the list isn't valid
            }
            check3 = false;
        }
    }
}




