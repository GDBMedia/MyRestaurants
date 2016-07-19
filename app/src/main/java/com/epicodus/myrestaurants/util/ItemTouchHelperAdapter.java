package com.epicodus.myrestaurants.util;

/**
 * Created by Laker77 on 7/18/2016.
 */
public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}
