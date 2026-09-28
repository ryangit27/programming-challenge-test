public class Solution {

    /**
     * return the sum of a and b.
     */
    public int add(int a, int b) {
        int x = a+b;
        return x;
    }

    /**
     * return the difference of a and b.
     */
    public int subtract(int a, int b) {
        int x = a-b;
        return x;
    }

    /**
     * return the product of a and b.
     */
    public int multiply (int a, int b){
        int x = a*b;
        return x;
    }

    /**
     * return the quotient of a and b.
     */

    public double divide (int a, int b){
        double x = (double)a/b;
        return x;
    }

    /**
     * return the string concatenation of word1 and word2 
     */
    public String concatenate (String word1, String word2){
        String x = word1+word2;
        return x;
    }


    /**
     * Start with a variable x equal to a. Then, IN THIS ORDER:
     *   1. add 4 to x
     *   2. multiply x by 3
     *   3. subtract the ORIGINAL a value from x
     * Return x.
 */
    public int transform(int a) {
        int x = a;
        x += 4;
        x *= 3;
        x -= a;
        return x;
    }

    public static void main(String[] args) {
        //this main method is for manually debugging
        Solution solution = new Solution();
        int g = solution.add(5,6);
        double h = solution.divide(g,3);
        System.out.println(solution.add(1, 2));

    }
}
