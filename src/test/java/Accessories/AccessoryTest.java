package Accessories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessoryTest {

    @Test
    void printAccessoryInfo() {
        Accessory accessory = new Accessory();
        String str = accessory.printAccessoryInfo();
        String strResult = null;
        assertEquals(str, strResult);
    }
}