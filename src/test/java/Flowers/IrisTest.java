package Flowers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IrisTest {

    @Test
    void printBouquetInfo() {
        Iris iris = new Iris(90, 2, 39);
        String str = iris.printBouquetInfo();
        String strResult = "Ирис, цена 90, свежесть 2, длина стебля 39";
        assertEquals(str, strResult);
    }
}