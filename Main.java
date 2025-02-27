import java.util.*;
public class Main {
    public static void main (String[] args) {
        registerTeams();
    }
    public static void registerTeams(){
        HashMap<String, ArrayList<String>> teams = new HashMap<>();
        for (int i = 0; i < 4; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Team Name");
            String teamName = scanner.nextLine();

            teams.put(teamName, new ArrayList<>());
            for (int j = 0; j < 5; j++){
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter name ");
                String memberName = scanner.nextLine();
                teams.get(teamName).add(memberName);

            }



            System.out.println("Do you want to play 1 game or all games");
            String gameChoice = scanner.nextLine();
            if (gameChoice.contains("1") || gameChoice.toLowerCase().contains("one")){
                teams.get(teamName).add("1");
            } else {
                teams.get(teamName).add("0");
            }
            System.out.println(teams);
        }

    }
    }

