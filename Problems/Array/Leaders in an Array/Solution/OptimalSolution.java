import java.util.ArrayList;

class OptimalSolution {
    public static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> reversedLeaders = new ArrayList<>();
        reversedLeaders.add(arr[arr.length - 1]);
        int currLeader = arr[arr.length - 1];

        
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= currLeader) {
                reversedLeaders.add(arr[i]);
                currLeader = arr[i];
            }
        }

        ArrayList<Integer> leaders = new ArrayList<>();
        for (int i = reversedLeaders.size() - 1; i >= 0; i--) {
            leaders.add(reversedLeaders.get(i));
        }

        return leaders;
    }
}
