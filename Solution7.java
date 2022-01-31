public class Solution7 {
    // Given 3 int values, a b c,
    // return their sum.
    // However,
    // if one of the values is the same as another of the values,
    // it does not count towards the sum.
    // e.g.
    // lone_sum(1, 2, 3) -> 6
    // lone_sum(3, 2, 3) -> 2
    // lone_sum(3, 3, 3) -> 0

    public static void main(String[] args) {
        System.out.println(lone_sum(1,2,3));
        System.out.println(lone_sum(3,2,3));
        System.out.println(lone_sum(3,3,3));
    }

    public static int lone_sum(int a, int b, int c){
        int sum = 0;
        // if a is not equal to b and c
        if (a!=b && a!=c){
            sum += a;
        }
        // if b is not equal to a and c
        if (b!=a && b!=c){
            sum+=b;
        }
        // if c is not equal to a and b
        if (c!=a && c!=b){
            sum+=c;
        }
        return sum;
    }
}
