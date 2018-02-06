/**
 * Created by Kurmo on 4.04.2017.
 */
public class Film extends main{
    String name;
    int type;

    public Film(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String changeType(int type) {
        if (type == 1|type == 2|type == 3) {
            this.type = type;
            return "Film type changed to " + getTypeName(type);
        } else return "Wrong type, try again";
    }

    public String getName() {
        return this.name;
    }

    public String getTypeName(int type) {
        if (type == 1) {
            return "New Release";
        } else if (type == 2) {
            return "Regular Film";
        } else if (type == 3) {
            return "Old Film";
        } else return "Wrong type!";
    }

    public int getType(){
        return this.type;
    }
}
