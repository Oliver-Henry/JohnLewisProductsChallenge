package com.challenge.productschallenge.common;

import com.challenge.productschallenge.common.base.BasicColor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorConverterTest {

    private ColorConverter colorConverter;

    @Before
    public void setUp() {
        colorConverter = new ColorConverter();
    }

    @Test
    public void givenValidBasicColorReturnHex() {
        String rgbColor = colorConverter.getRGBColorFor(BasicColor.Acqua.name());
        assertEquals("#00FFFF", rgbColor);
    }

    @Test
    public void givenInvalidColorReturnDefault() {
        String rgbColor = colorConverter.getRGBColorFor("Khaki");
        assertEquals("#FFFFFF", rgbColor);
    }

}