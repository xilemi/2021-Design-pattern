import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
        for (int i = 0; i < 10 ; i++) {
            if (i<5) {
            persons.add(new Person(String.valueOf(i), "男"));
            }else {
            persons.add(new Person(String.valueOf(i), "女"));
       }
     }
        IFilter boyFilter = new BoyFilter();
         //筛选出男同胞们
        persons = boyFilter.filter(persons);
        persons.forEach(person->System.out.println(person.toString()));
    }
}
