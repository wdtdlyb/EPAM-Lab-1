package Flowers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoseTest {

    @Test
    void printBouquetInfo() {
        Rose rose = new Rose(154, 1, 32);
        String str = rose.printBouquetInfo();
        String strResult = "Роза, цена 154, свежесть 1, длина стебля 32";
        assertEquals(str, strResult);
    }
}