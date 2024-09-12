import java.util.HashMap;
import java.util.Map;

public class CountGreaterThan25 {

    public static void main(String[] args){

        Map<String,Integer> employees = new HashMap<>();

        employees.put("Juan", 22);
        employees.put("Elisa", 27);
        employees.put("Damian", 30);
        employees.put("Dilan", 25);

        long count = employees.entrySet().stream().filter(e -> e.getValue() > 25).count();

        System.out.println(count);
    }

}
