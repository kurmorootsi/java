import javax.xml.bind.annotation.*;

/**
 * Created by Kurmo on 16.03.2017.
 */
    @XmlRootElement(name = "person")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class Person {
        @XmlElement
        String name;
        @XmlElement
        String ID;
        @XmlElement
        String phone;
        @XmlElement
        String address;

        public Person() {
        }


        public Person(String name, String ID, String phone, String address) {
            this.name = name;
            this.ID = ID;
            this.phone = phone;
            this.address = address;
        }
    }
