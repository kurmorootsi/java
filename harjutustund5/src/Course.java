/**
 * Created by Kurmo on 5.10.2016.
 */
public class Course {
    private String code;
    private String name;
    private int credits;

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String toString() {
        return "Course [code=" + code + ", name= " + name + '\'' + ", credits =" + credits + "";
    }

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public int getCredits() {
        return credits;
    }
    public int calculateHours () {
        //1 EAP = 26 Hours
        return this.credits *26;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Course() {
    }

    public Course(String code, int credits) {
        this.code = code;
        this.credits = credits;
    }
}
