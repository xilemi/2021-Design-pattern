import java.util.List;
import java.util.stream.Collectors;
public class GirlFilter implements IFilter {
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(person -> person.getGender().equals("男")).collect(Collectors.toList());
    }
}
