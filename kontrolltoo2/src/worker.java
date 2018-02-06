/**
 * Created by Kurmo on 7.12.2016.
 */
public class worker {
    protected int Isikukood;
    protected String Nimi;
    protected String Amet;

    public String getNimi(){
        return Nimi;
    }

    public String getAmet(){
        return Amet;
    }

    public int getIsikukood(){
        return Isikukood;
    }

    public Boolean changeAmet(String uusAmet){
        if (uusAmet != Amet){
            this.Amet = uusAmet;
            return true;
        }
        else {
            return false;
        }
    }
}
