package Scaler;

import java.util.HashMap;
import java.util.Scanner;

public class CountriesWithPopulationLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (true){
            String key = sc.next();
            if (key.equals("done")){
                break;
            }
            int value = sc.nextInt();
            map.put(key, value);
        }
        int k = sc.nextInt();
        System.out.println(count(map, k));
    }

    public static int count(HashMap<String, Integer> map, int k){
        int count = 0;
        for (String key : map.keySet()) {
            if (map.get(key) < k){
                count ++;
            }
        }
        return count;
    }
}
