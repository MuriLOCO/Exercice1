import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){


        List<String> example1 = new ArrayList<>();
        List<String> example2 = new ArrayList<>();


        example1.add("1110");
        example1.add("11010");
        example1.add("11000");
        example1.add("0000");

        example2.add("11000");
        example2.add("11000");
        example2.add("00100");
        example2.add("00011");

        getResults(example1, "example1");
        getResults(example2, "example2");



    }

    private static void getResults(List<String> list, String listName){
        int result = 0;
        for(String s : list){
            for(int i = 0; i < 4; i++){
                if(i != 0 && ((s.charAt(i-1) == '0' && s.charAt(i) == '1'))){
                    result++;
                }
            }
        }
        System.out.println(String.format("Results for %s is %d", listName, result));
    }

}
