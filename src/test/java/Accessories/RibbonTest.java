package Accessories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonTest {

    @Test
    void printAccessoryInfo() {
        Ribbon ribbon = new Ribbon(7);
        String str = ribbon.printAccessoryInfo();
        String strResult = "Использована ленточка стоимостью 7";
        assertEquals(str, strResult);
    }
}