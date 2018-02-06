import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Created by Kurmo on 16.03.2017.
 */

public class main {
    static String name;
    static String ID;
    static String phone;
    static String address;
    static People people = new People();

    public static void main(String[] args) {
        people.setPeople(new ArrayList<Person>());
        start();
    }

    /**
     * Kirjutab listis olevad objektid XML failiks.
     * @throws JAXBException
     */
    public static void writeXML() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(People.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(people, System.out);

        jaxbMarshaller.marshal(people, new File("people.xml"));
    }

    /**
     * Uurib välja inimese informatsiooni kutsudes välja ask class'id.
     * Loob uue inimese objekti ning lisab selle listi.
     * Lõpus küsib, kas lisada veel inimene või ei.
     */
    public static void start() {
        name = null;
        ID = null;
        phone = null;
        address = null;
        askName();
        askID();
        askPhone();
        askAddress();

        Person Person = new Person(name, ID, phone, address);

        People.getPeople().add(Person);
        Scanner reader = new Scanner(System.in);
        System.out.println("Kas soovid veel lisada inimesi? (Jah/Ei)");
        String continueLower = reader.next();
        String continueUp = continueLower.toUpperCase();
        if (continueUp.equals("JAH")) {
            start();
        } else try {
            writeXML();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Küsib inimese nime ning lisab selle stringi.
     */
    public static void askName() {
        Scanner reader = new Scanner(System.in);
        String regex = "[a-zA-Z- ',]+";
        do {
            System.out.println("Sisesta Nimi: ");
            name = reader.next();
        }
        while ((!name.matches(regex)));
    }

    /**
     * Küsib inimese isikukoodi ning lisab selle stringi.
     * Kontrollib, kas input on digits ja 11 märki.
     */
    public static void askID() {
        Scanner reader = new Scanner(System.in);
        String regex = "[0-9]+";
        do {
            System.out.println("Sisesta Isikukood: ");
            ID = reader.next();
        }
        while ((!ID.matches(regex)) || (ID.length() != 11));
    }

    /**
     * Küsib inimese aadressi ning lisab selle stringi.
     */
    public static void askAddress() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kas soovid sisestada aadressi? (Jah/Ei): ");
        String addressAnswerLower = reader.next();
        String addressAnswer = addressAnswerLower.toUpperCase();
        if (addressAnswer.equals("JAH")) {
            System.out.println("Sisesta aadress: ");
            address = reader.next();
        }
    }

    /**
     * Küsib inimese telefoni nr'it ning lisab selle stringi.
     */
    public static void askPhone() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kas soovid sisestada telefoni nr? (Jah/Ei): ");
        String phoneAnswerLower = reader.next();
        String phoneAnswer = phoneAnswerLower.toUpperCase();
        if (phoneAnswer.equals("JAH")) {
            System.out.println("Sisesta telefoni nr: ");
            phone = reader.next();
        }
    }
}
