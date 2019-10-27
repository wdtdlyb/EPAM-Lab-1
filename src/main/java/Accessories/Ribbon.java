package Accessories;

import java.util.logging.Logger;

public class Ribbon extends Accessory{
    private int ribbonCost;

    private final static Logger log = Logger.getLogger(String.valueOf(Ribbon.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    public Ribbon(int ribbonCost) {
        this.ribbonCost = ribbonCost;
    }

    @Override
    public String printAccessoryInfo(){
        InfoLevel();
        return "Использована ленточка стоимостью " + this.ribbonCost;
    }

    @Override
    public int getCost() {
        return ribbonCost;
    }
}