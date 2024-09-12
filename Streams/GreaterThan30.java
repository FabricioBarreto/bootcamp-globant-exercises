import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.List;

public class GreaterThan30{
    public static void main(String[] args){

        Map<String, Integer> employees = new HashMap<>();

        employees.put("Rube", 25);
        employees.put("Claudio", 35);
        employees.put("Esteban", 27);
        employees.put("Aldo", 40);

        Optional<List<String>> employeeFilteredList = Optional.of(employees.entrySet().stream()
                .filter(e -> e.getValue() > 30)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));

        System.out.println(employeeFilteredList);
    }
}