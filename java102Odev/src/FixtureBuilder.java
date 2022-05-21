import java.util.*;

public class FixtureBuilder {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of team:");
        int teamNum= inp.nextInt();
        List<String> teams=new ArrayList<>();
        System.out.println("Enter name of teams");
        for (int i=0;i<teamNum;i++){
            teams.add(inp.next());
        }
        if (teamNum%2 != 0) {
            teams.add("Bay");
            teamNum+=1;
        }
        List<String> tempTeams=new ArrayList<>();
        Random r=new Random();
        while (teams.size()>0){
            int random=r.nextInt(teams.size());
            tempTeams.add(teams.get(random));
            teams.remove(teams.get(random));
        }
        teams=tempTeams;
        int totalRound=teamNum-1;
        int numMatchPerRound=teamNum/2;
        int index=r.nextInt(teams.size());
        String fixTeam=teams.get(index);
        teams.remove(teams.get(index));
        for (int i=1;i<=2*totalRound;i++){
            if (i<=totalRound){System.out.println(i+". Round");
                System.out.println(fixTeam+" vs "+teams.get(0));
                for (int j=1;j<=numMatchPerRound-1;j++){
                    System.out.println(teams.get(j)+" vs "+teams.get(teams.size()-j));
                }
                List<String> newList=new ArrayList<>();
                newList.add(teams.get(teams.size()-1));

                for(int k=0;k<teams.size()-1;k++){
                    newList.add(teams.get(k));
                }
                teams=newList;
            }else {
            System.out.println(i+". Round");
            System.out.println(teams.get(0)+" vs "+fixTeam);
            for (int j=1;j<=numMatchPerRound-1;j++){
                System.out.println(teams.get(teams.size()-j)+" vs "+teams.get(j));
            }
            List<String> newList=new ArrayList<>();
            newList.add(teams.get(teams.size()-1));

            for(int k=0;k<teams.size()-1;k++){
                newList.add(teams.get(k));
            }
            teams=newList;
        }
        }
    }
}
