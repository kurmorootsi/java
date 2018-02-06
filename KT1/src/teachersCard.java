/**
 * Created by Kurmo on 12.10.2016.
 */
public class teachersCard extends pangakaart {
    private String ametiKoht;

    public void setAmetiKoht(String amet){
        ametiKoht = amet;
    }

    public String getAmetiKoht(){
        return "Ametikoht on: " + ametiKoht;
    }
}
