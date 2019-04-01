package com.challenge.productschallenge.common;


import java.util.HashMap;

import static com.challenge.productschallenge.common.base.RGBColor.Acqua;
import static com.challenge.productschallenge.common.base.RGBColor.Black;
import static com.challenge.productschallenge.common.base.RGBColor.Blue;
import static com.challenge.productschallenge.common.base.RGBColor.Cyan;
import static com.challenge.productschallenge.common.base.RGBColor.Fuschia;
import static com.challenge.productschallenge.common.base.RGBColor.Grey;
import static com.challenge.productschallenge.common.base.RGBColor.Green;
import static com.challenge.productschallenge.common.base.RGBColor.Lime;
import static com.challenge.productschallenge.common.base.RGBColor.Magenta;
import static com.challenge.productschallenge.common.base.RGBColor.Maroon;
import static com.challenge.productschallenge.common.base.RGBColor.Navy;
import static com.challenge.productschallenge.common.base.RGBColor.Olive;
import static com.challenge.productschallenge.common.base.RGBColor.Purple;
import static com.challenge.productschallenge.common.base.RGBColor.Red;
import static com.challenge.productschallenge.common.base.RGBColor.Silver;
import static com.challenge.productschallenge.common.base.RGBColor.Teal;
import static com.challenge.productschallenge.common.base.RGBColor.White;
import static com.challenge.productschallenge.common.base.RGBColor.Yellow;

/**
 * Convert basic color to RGB format
 */
public class ColorConverter {

    private HashMap<String, String> colorHashMap = new HashMap<>();

    public ColorConverter() {
        initColors();
    }

    private void initColors() {
        colorHashMap.put(Acqua.name(), "#00FFFF");
        colorHashMap.put(Black.name(), "#000000");
        colorHashMap.put(Blue.name(), "#0000FF");
        colorHashMap.put(Cyan.name(), "#00FFFF");
        colorHashMap.put(Fuschia.name(), "#FF00FF");
        colorHashMap.put(Grey.name(), "#808080");
        colorHashMap.put(Green.name(), "#008000");
        colorHashMap.put(Lime.name(), "#00FF00");
        colorHashMap.put(Magenta.name(), "#FF00FF");
        colorHashMap.put(Maroon.name(), "#800000");
        colorHashMap.put(Navy.name(), "#000080");
        colorHashMap.put(Olive.name(), "#808000");
        colorHashMap.put(Purple.name(), "#800080");
        colorHashMap.put(Red.name(), "#FF0000");
        colorHashMap.put(Silver.name(), "#C0C0C0");
        colorHashMap.put(Teal.name(), "#008080");
        colorHashMap.put(White.name(), "#FFFFFF");
        colorHashMap.put(Yellow.name(), "#FFFF00");
    }

    public String getRGBColorFor(String basicColor) {
        String rgbColor = colorHashMap.get(basicColor);
        return rgbColor != null ? rgbColor : "";
    }
}
