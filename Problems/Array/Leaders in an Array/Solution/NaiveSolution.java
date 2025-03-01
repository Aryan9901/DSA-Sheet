import java.util.ArrayList;


class Solution {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();

        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                leaders.add(arr[i]);
            }
        }
        return leaders;
    }
}
