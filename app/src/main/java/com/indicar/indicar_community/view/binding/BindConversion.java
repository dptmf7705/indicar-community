package com.indicar.indicar_community.view.binding;

import android.databinding.BindingConversion;
import android.util.Log;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yeseul on 2018-04-13.
 */

public class BindConversion {


    /**
     * xml 에서 필드에 Data 타입이 들어오면 값을 자동으로 변경하여 binding 해준다.
     *
     * 보통 작성 날짜가 들어올거고,
     * 오늘 날짜면 ---> 예) 13시간 전
     * 오늘 날짜가 아니라면 ---> 예) 2018/04/11
     *
     * */
    @BindingConversion
    public static String convertDateToDisplayText(Date inputDate){
        SimpleDateFormat dateOnly = new SimpleDateFormat("yyyy/MM/dd");
        Date currentDate = new Date();
        String displayString = "";

        long diffTimeMillis = currentDate.getTime() - inputDate.getTime(); // 경과된 시간 (ms)
        int diffTime = (int) (diffTimeMillis / (1000 * 60)); // 분 단위로 변경

        if(diffTime > 0) {
            if (diffTime < 60) { // ~ 59분 전
                displayString = diffTime + "분 전";
            } else {
                diffTime = diffTime / 60; // 시간 단위로 변경

                if(diffTime < 24){ // ~ 23시간 전
                    displayString = diffTime + "시간 전";
                } else { // 날짜 출력
                    displayString = dateOnly.format(inputDate);
                }
            }
        }
        return displayString;
    }

    @BindingConversion
    public static int convertBooleanToVisibility(boolean visible){
        Log.d("", "convertBooleanToVisibility() called ... with visible: " + visible);
        return visible ? View.VISIBLE : View.GONE;
    }


}
