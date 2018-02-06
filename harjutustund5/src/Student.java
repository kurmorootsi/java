/**
 * Created by Kurmo on 5.10.2016.
 */
public class Student {
    public static void main(String[] args){

        Course course1 = new Course("IDK2015", "OOP");

        Course course2 = new Course();
        course2.setName("UML");
        course2.setCode("IDK2011");
        course2.setCredits(5);
        System.out.println(course2);
        System.out.println(course2.getName()+
        " vajab " + course2.calculateHours() + " tundi tööd");
    }
}
