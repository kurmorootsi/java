import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by Kurmo on 16.03.2017.
 */
@XmlRootElement(name = "people")
@XmlAccessorType(XmlAccessType.FIELD)
public class People {
    @XmlElement(name = "person")
    private static List<Person> people = null;

    public static List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}