package Flowers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    @Test
    void printBouquetInfo() {
        Flower flower = new Flower();
        String str = flower.printBouquetInfo();
        String strResult = null;
        assertEquals(str, strResult);
    }
}