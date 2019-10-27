package Flowers;

import java.util.logging.Logger;

public class Rose extends Flower{
    private int roseCost;

    public Rose(int roseCost, int fresh, int stalkLength){
        super(0, fresh, stalkLength);
        this.roseCost = roseCost;
    }

    private final static Logger log = Logger.getLogger(String.valueOf(Rose.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    @Override
    public int getCost() {
        return roseCost;
    }

    @Override
    public String printBouquetInfo(){
        InfoLevel();
        return "Роза" + ", " + "цена " + this.roseCost + ", " + "свежесть " + this.getFresh() + ", " + "длина стебля " + this.getStalkLength();
    }
}
