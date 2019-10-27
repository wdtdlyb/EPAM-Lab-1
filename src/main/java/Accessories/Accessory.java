package Accessories;

import java.util.logging.Logger;

public class Accessory {

    private int cost;

    private final static Logger log = Logger.getLogger(String.valueOf(Accessory.class));

    public void InfoLevel(){
        log.info("мы использовали метод!");
    }

    public int getCost() {
        return cost;
    }

    public String printAccessoryInfo(){
        return null;
    }
}
