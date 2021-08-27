package Laptenkov;

import java.util.Objects;

/**
 * Класс {@link DigitHandler(int)}.
 * Класс - обертка над числом value.
 * Реализовать equals & hashCode.
 */
public class DigitHandler {
    int value;

    public DigitHandler(int value) {
        this.value = value;
    }

    /**
     * Метод {@link DigitHandler#equals} проверяет идентичность объектов типа {@link DigitHandler}.
     * @param o объект для сравнения.
     * @return <code>true</code> если объекты идентичны по полю value.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitHandler that = (DigitHandler) o;
        return value == that.value;
    }

    /**
     * Метод {@link DigitHandler#hashCode} считает hashCode по полям объекта типа {@link DigitHandler}.
     * @return целое число посчитанное по значению поля value.
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
