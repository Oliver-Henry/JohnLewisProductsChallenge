
package com.challenge.productschallenge.data.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuickAddToBasket {

    @SerializedName("showChooseSizeTriggerQV")
    @Expose
    private boolean showChooseSizeTriggerQV;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QuickAddToBasket() {
    }

    /**
     * 
     * @param showChooseSizeTriggerQV
     */
    public QuickAddToBasket(boolean showChooseSizeTriggerQV) {
        super();
        this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
    }

    public boolean isShowChooseSizeTriggerQV() {
        return showChooseSizeTriggerQV;
    }

    public void setShowChooseSizeTriggerQV(boolean showChooseSizeTriggerQV) {
        this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
    }

    public QuickAddToBasket withShowChooseSizeTriggerQV(boolean showChooseSizeTriggerQV) {
        this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
        return this;
    }

}
