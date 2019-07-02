package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FirstNonRepeated {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        int length = input.length();

        for(int i = 0; i <length; i++){
            char c = input.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c,1);
        }

        for(int i = 0; i < length;i++){
            char c = input.charAt(i);
            if(map.get(c) == 1){
                System.out.println(c);
                return;
            }
        }
    }
}
