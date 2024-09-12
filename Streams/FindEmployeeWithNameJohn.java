import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEmployeeWithNameJohn {

    public static void main(String[] args){
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Ricardo", 24);
        employees.put("Esteban", 35);
        employees.put("Claudio", 22);
        employees.put("Erica", 30);
        employees.put("John", 28);

        List<String> employeesWithNameJohn = employees.keySet().stream()
                .filter(integer -> integer.equals("John"))
                .collect(Collectors.toList());

        System.out.println(employeesWithNameJohn);

    }

}
