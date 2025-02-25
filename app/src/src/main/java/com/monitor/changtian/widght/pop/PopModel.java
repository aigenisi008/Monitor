package com.monitor.changtian.widght.pop;

import android.support.annotation.DrawableRes;

import java.io.Serializable;

/**
 * Created by zhanglifeng on 2017/3/28.
 * Pop Data Model
 */

public class PopModel implements Serializable {

    private int drawableId;
    private String itemDesc;
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(@DrawableRes int drawableId) {
        this.drawableId = drawableId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

}
