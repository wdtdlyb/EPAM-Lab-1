package Flowers;

import java.util.logging.Logger;

public class Flower {
    private int cost;
    private int fresh;
    private int stalkLength;
    private final static Logger log = Logger.getLogger(String.valueOf(Flower.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    public int getFresh() {
        return fresh;
    }

    public int getStalkLength() {
        return stalkLength;
    }

    Flower(int cost, int fresh, int stalkLength) {
        this.cost = cost;
        this.fresh = fresh;
        this.stalkLength = stalkLength;
    }

    public int getCost() {
        return cost;
    }

    public String printBouquetInfo(){
        InfoLevel();
        return null;
    }

    public Flower() {
    }
}
