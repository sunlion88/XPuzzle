package com.sunlion.xpuzzle.bean;

import android.graphics.Bitmap;

/**
 * 拼图Item逻辑实体类:封装逻辑相关属性
 * Created by Administrator on 2016/11/28 0028.
 */

public class ItemBean {

    // Item的Id
    private int mItemId;
    // bitmap的Id
    private int mBitmapId;
    // mBitmap
    private Bitmap mBitmap;

    public ItemBean() {
    }

    public ItemBean(Bitmap mBitmap, int mBitmapId, int mItemId) {
        this.mBitmap = mBitmap;
        this.mBitmapId = mBitmapId;
        this.mItemId = mItemId;
    }

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public void setmBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }

    public int getmBitmapId() {
        return mBitmapId;
    }

    public void setmBitmapId(int mBitmapId) {
        this.mBitmapId = mBitmapId;
    }

    public int getmItemId() {
        return mItemId;
    }

    public void setmItemId(int mItemId) {
        this.mItemId = mItemId;
    }
}
