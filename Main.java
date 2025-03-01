import java.util.*;
public class Main {
    public static void main(String[] args) {
        registerTeams();
    }
    public static void registerTeams() {
        HashMap<String, ArrayList<String>> GroupTeams = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Team Name: ");
            String teamName = scanner.nextLine();

            GroupTeams.put(teamName, new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter name: ");
                String memberName = scanner.nextLine();
                GroupTeams.get(teamName).add(memberName);
                if (memberName.toLowerCase().contains("stop")) {
                    break;
                } else {

                    boolean check = true;
                    while (check) {
                        System.out.println("Do you want to play 1 game or all games: ");
                        String gameChoice = scanner.nextLine();
                        if (gameChoice.contains("1") || gameChoice.toLowerCase().contains("one")) {
                            GroupTeams.get(teamName).add("1");
                            check = false;
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
        }
    public static void registerIndividualTeams(){
        HashMap<String, ArrayList<String>> IndividualTeams = new HashMap<>();
        for (int i = 0; i < 20; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Name: ");
            String individualName = scanner.nextLine();
            IndividualTeams.put(individualName, new ArrayList<>());
            IndividualTeams.get(individualName);

            System.out.println("Do you want to play 1 game or all games: ");
            String gameChoice = scanner.nextLine();
            boolean check = true;
            while (check){
                if (gameChoice.contains("1") || gameChoice.toLowerCase().contains("one")) {
                    IndividualTeams.get(individualName).add("One Game");

                    boolean check1 = true;
                    while (check1){
                        System.out.println("""
                        
                        
                        We have 5 different events please select one out of the 5 options by selecting the corresponding number
                        1: Javelin
                        2: Maths quiz
                        3: Drawing Blindfolded
                        4: Fitness Pacer Test
                        5: Faster to build a house of cards
                        """);
                        String gameChoice1 = scanner.nextLine();
                        if (gameChoice1.contains("1") || gameChoice.toLowerCase().contains("one")){
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
                        }else if (gameChoice1.contains("5") || gameChoice1.toLowerCase().contains("five")) {
                            IndividualTeams.get(individualName).add("Fastest to build a house of cards");
                            check1 = false;

                        }else {
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
    public static void  pointsSystemTeams(){
        boolean check3 = true;
        Scanner scanner = new Scanner(System.in);
        while (check3){
            System.out.println(" Please enter who came first to Tug of War:");
            String TowFP = scanner.nextLine();

        }

    }
    }

