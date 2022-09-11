package com.niit.start.utils;

import android.content.Context;

public class BaseUtils {

    /**
     * 根据手机分辨率将dp单位转化成px
     * px = dip x dpi / 160
     *
     * @param context
     * @param value
     * @return
     */
    public static int DipToPx(Context context, float value) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (value * scale + 0.5f);
    }
}
