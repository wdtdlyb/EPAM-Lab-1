package Flowers;

import java.util.logging.Logger;

public class Iris extends Flower{
    private int irisCost;

    public Iris(int irisCost, int fresh, int stalkLength) {
        super(0, fresh, stalkLength);
        this.irisCost = irisCost;
    }

    private final static Logger log = Logger.getLogger(String.valueOf(Iris.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    @Override
    public int getCost() {
        return irisCost;
    }

    @Override
    public String printBouquetInfo(){
        InfoLevel();
        return "Ирис" + ", " + "цена " + this.irisCost + ", " + "свежесть " + this.getFresh() + ", " + "длина стебля " + this.getStalkLength();
    }
}
