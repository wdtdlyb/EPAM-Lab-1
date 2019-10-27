package Accessories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapTest {

    @Test
    void printAccessoryInfo() {
        Wrap wrap = new Wrap(9);
        String str = wrap.printAccessoryInfo();
        String strResult = "Использована обёртка стоимостью 9";
        assertEquals(str, strResult);
    }
}