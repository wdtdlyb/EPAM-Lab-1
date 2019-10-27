package Accessories;

import java.util.logging.Logger;

public class Wrap extends Accessory{
    private int wrapCost;
    private final static Logger log = Logger.getLogger(String.valueOf(Wrap.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    public Wrap(int wrapCost) {
        this.wrapCost = wrapCost;
    }

    @Override
    public String printAccessoryInfo(){
        InfoLevel();
        return "Использована обёртка стоимостью " + this.wrapCost;
    }

    @Override
    public int getCost() {
        return wrapCost;
    }
}