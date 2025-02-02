import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 1, 5};
        int target = 9;

        int[] result = findCombination(nums, target);

        System.out.print("[");
        for (int num : result) {
            System.out.print(num + ", ");
        }
        System.out.print("\b\b] Target = " + target);
        System.out.println("");

//        String[] words = {"airplane", "airport", "aircraft"};
        String[] words = {"dog", "racecar", "car"};

        Stack<Character> result2 = findString(words);
        String output = "";
        Stack<Character> output2 = new Stack<>();
        while(!result2.isEmpty()) {
          output2.push(result2.pop());
        }
        while(!output2.isEmpty()) {
            output += output2.pop();
        }
        System.out.println("\"" + output + "\"");
    }

    static int[] findCombination(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    int[] result = {i, k};
                    return result;
                }
            }
        }
        return new int[]{-1, -1};
    }

    static Stack<Character> findString(String[] words) {
        Stack<Character> out = new Stack<>();
        for (int i = 0; i < words[0].length(); i++) {
            out.push(words[0].charAt(i));
            for(int k = 1; k < words.length; k++){
                if (out.peek() != words[k].charAt(i)){
                    out.pop();
                    return out;
                }
            }
        }
        return out;
    }
}