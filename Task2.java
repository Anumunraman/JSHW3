import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        nums.removeIf(cur -> cur % 2 == 0);

        System.out.println(nums);
    }
}
