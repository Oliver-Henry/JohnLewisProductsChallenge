package com.challenge.productschallenge.common;


import java.util.HashMap;
import java.util.Map;

import static com.challenge.productschallenge.common.base.BasicColor.Acqua;
import static com.challenge.productschallenge.common.base.BasicColor.Black;
import static com.challenge.productschallenge.common.base.BasicColor.Blue;
import static com.challenge.productschallenge.common.base.BasicColor.Cyan;
import static com.challenge.productschallenge.common.base.BasicColor.Default;
import static com.challenge.productschallenge.common.base.BasicColor.Fuschia;
import static com.challenge.productschallenge.common.base.BasicColor.Grey;
import static com.challenge.productschallenge.common.base.BasicColor.Green;
import static com.challenge.productschallenge.common.base.BasicColor.Lime;
import static com.challenge.productschallenge.common.base.BasicColor.Magenta;
import static com.challenge.productschallenge.common.base.BasicColor.Maroon;
import static com.challenge.productschallenge.common.base.BasicColor.Navy;
import static com.challenge.productschallenge.common.base.BasicColor.Olive;
import static com.challenge.productschallenge.common.base.BasicColor.Purple;
import static com.challenge.productschallenge.common.base.BasicColor.Red;
import static com.challenge.productschallenge.common.base.BasicColor.Silver;
import static com.challenge.productschallenge.common.base.BasicColor.Teal;
import static com.challenge.productschallenge.common.base.BasicColor.White;
import static com.challenge.productschallenge.common.base.BasicColor.Yellow;

/**
 * Convert basic color to RGB format
 */
public class ColorConverter {

    private Map<String, String> colorHashMap = new HashMap<>();

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
        colorHashMap.put(Default.name(), "#FFFFFF");

    }

    public String getRGBColorFor(String basicColor) {
        String rgbColor = colorHashMap.get(basicColor);
        return rgbColor != null ? rgbColor : colorHashMap.get("Default");
    }
}
