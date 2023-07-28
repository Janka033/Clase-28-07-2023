package Constructor;

public class Sand {
    private String level;
    private int trophies;

    public Sand(String level) {
        this.level = level;
    }

    public Sand() {
    }

    public Sand(String level, int trophies) {
        this.level = level;
        this.trophies = trophies;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }
    public Sand(int x,int y){

    }
}
