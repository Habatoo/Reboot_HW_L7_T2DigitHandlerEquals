package Laptenkov;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс {@link DigitHandlerTest} для теста публичных методов класса {@link DigitHandler(int)}.
 */
class DigitHandlerTest {

    DigitHandler digitHandler_01;
    DigitHandler digitHandler_02;
    DigitHandler digitHandler_03;

    /**
     * Подготовка данных для тестирования.
     * Инициализация объектов {@link DigitHandler} с числами {@link Integer}
     */
    @BeforeEach
    void setUp() {
        digitHandler_01 = new DigitHandler(10);
        digitHandler_02 = new DigitHandler(10);
        digitHandler_03 = new DigitHandler(20);
    }

    /**
     * Очистака всех объектов после каждого теста.
     */
    @AfterEach
    void tearDown() {
        digitHandler_01 = null;
        digitHandler_02 = null;
        digitHandler_03 = null;
    }

    /**
     * Метод {@link DigitHandlerTest#testEqualsSuccess_Test}
     * проверяет идентичность объектов типа {@link DigitHandler}.
     * Сценарий проверяет успешное сравление идентичных объектов.
     */
    @Test
    void testEqualsSuccess_Test() {
        Assert.assertEquals(digitHandler_01, digitHandler_02);

    }

    /**
     * Метод {@link DigitHandlerTest#testEqualsFail_Test}
     * проверяет идентичность объектов типа {@link DigitHandler}.
     * Сценарий проверяет не успешное сравление не идентичных объектов.
     */
    @Test
    void testEqualsFail_Test() {
        Assert.assertNotEquals(digitHandler_01, digitHandler_03);
        Assert.assertNotEquals(digitHandler_01, null);
        Assert.assertNotEquals(digitHandler_01, 10);
        Assert.assertNotEquals(digitHandler_01, 10L);
    }

    /**
     * Метод {@link DigitHandlerTest#testHashCodeSuccess_Test}
     * считает hashCode по полям объекта типа {@link DigitHandler}.
     * Сценарий проверяет успешное сравление hashCode идентичных объектов.
     */
    @Test
    void testHashCodeSuccess_Test() {
        Assert.assertEquals(digitHandler_01.hashCode(), digitHandler_01.hashCode());
    }

    /**
     * Метод {@link DigitHandlerTest#testHashCodeSuccess_Test}
     * считает hashCode по полям объекта типа {@link DigitHandler}.
     * Сценарий проверяет не успешное сравление hashCode не идентичных объектов.
     */
    @Test
    void testHashCodeFail_Test() {
        Assert.assertNotEquals(digitHandler_01.hashCode(), digitHandler_03.hashCode());
        Assert.assertNotEquals(new Integer(10).hashCode(), digitHandler_03.hashCode());
        Assert.assertNotEquals(new Long(10).hashCode(), digitHandler_03.hashCode());
    }

}