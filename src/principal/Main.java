package principal;

import java.util.List;

public class Main {

	public static void main(String[] args) {
        int[][] exampleMatrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] exampleMatrix2 = {
            {1, 2, 3},
            {4, 10, 12},
            {6, 7, 33}
        };
        
        List<Integer> result1 = Snail.snailOrder(exampleMatrix1);
        List<Integer> result2 = Snail.snailOrder(exampleMatrix2);
        
        System.out.println(result1);
        System.out.println(result2);
    }
}


