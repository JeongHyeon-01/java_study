import java.util.HashMap;
import java.util.HashSet;

public class Practice1 {
    public static void solution(String a){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        char[] arr = a.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            if (map.get(arr[i]) < map.get(arr[i+1])){
                sum -= map.get(arr[i]);
            }else{
                sum += map.get(arr[i]);
            }
        }
        sum += map.get(arr[arr.length-1]);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        solution("III");
        solution("IV");
        solution("VI");
        solution("XIII");
        solution("XXVI");
        solution("MCMXCIV");
    }
}
