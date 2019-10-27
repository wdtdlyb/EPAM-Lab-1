package Flowers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LilyTest {

    @Test
    void printBouquetInfo() {
        Lily lily = new Lily(126, 0, 28);
        String str = lily.printBouquetInfo();
        String strResult = "Лилия, цена 126, свежесть 0, длина стебля 28";
        assertEquals(str, strResult);
    }
}