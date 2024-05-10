package core.basesyntax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColorSupplierTest {
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    @Test
    public void shouldReturnRandomColor() {
        //given
        //when
        String resultColor = colorSupplier.getRandomColor();
        //then
        assertNotNull(resultColor);
        assertFalse(resultColor.isEmpty());
        assertTrue(isValidColor(resultColor));
    }

    private boolean isValidColor(String colorName) {
        for (Color color : Color.values()) {
            if (color.name().equals(colorName)) {
                return true;
            }
        }
        return false;
    }

}