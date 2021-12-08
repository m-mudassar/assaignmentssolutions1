package softwarehouse.vu;

public class Solution4 {
    // Given a string and a non-negative int a,
    // return a string
    // that is n copies of original string
    // e.g.
    // string_times('test', 2) -> 'testtest'
    // string_times('test', 3) -> 'testtesttest'

    public static void main(String[] args) {
            string_times("ali", 2);
    }

    public static String string_times(String str, int count){
        if (count < 0 || count == 0){
            System.out.println("Count should be non negative and not zero");
            return null;
        }
        String string = str;

        for (int i=1; i<count; i++){
            string += string;
        }
        System.out.println(string);
        return string;
    }
}
