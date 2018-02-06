/**
 * Configuration for HW02 Droptris.
 */
public class Configuration {
    private int level;
    private int lookahead;
    private int seed;
    private final String uniid = "kuroot";

    public Configuration(int level, int lookahead, int seed) {
        this.level = level;
        this.lookahead = lookahead;
        this.seed = seed; }
    @Override
    public String toString() {
        return "todo"; } }
