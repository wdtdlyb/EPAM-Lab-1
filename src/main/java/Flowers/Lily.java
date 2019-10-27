package Flowers;

import java.util.logging.Logger;

public class Lily extends Flower{
    private int lilyCost;

    public Lily(int lilyCost, int fresh, int stalkLength) {
        super(0, fresh, stalkLength);
        this.lilyCost = lilyCost;
    }

    private final static Logger log = Logger.getLogger(String.valueOf(Lily.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    @Override
    public int getCost() {
        return lilyCost;
    }

    @Override
    public String printBouquetInfo(){
        InfoLevel();
        return "Лилия" + ", " + "цена " + this.lilyCost + ", " + "свежесть " + this.getFresh() + ", " + "длина стебля " + this.getStalkLength();
    }
}
