package com.niit.start.utils;

import android.content.Context;

public class Utils {

    /**
     * 根据手机分辨率将dp单位转化成px
     * px = dip x dpi / 160
     *
     * @param context
     * @param value
     * @return
     */
    public static int DipToPx(Context context, float value) {
        // 获取当前手机的像素密度(1dp对应几个px)
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (value * scale + 0.5f);
    }
}
