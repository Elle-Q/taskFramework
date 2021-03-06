package com.qxy.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class DateUtil {
    public static void main(String[] args) {

    }

    /**
     * 日期
     *
     * @param fmt         格式
     * @param yearOffset  年偏移量 1 下一年 -1 去年
     * @param monthOffset 月偏移量 1 下月 0 本月 -1 上月
     * @param dayOffset   today 当天 last 最后一天 first 第一天 其他：日期偏移
     * @return
     */
    public static String getDateStr(String fmt, int yearOffset,
                                    int monthOffset, int dayOffset) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, yearOffset);
        c.add(Calendar.MONTH, monthOffset);
        c.add(Calendar.DATE, dayOffset);
        return dateToStr(c.getTime(), fmt);
    }


    public static Date addHour(Date date, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.HOUR, offset);
        return c.getTime();
    }

    public static Date addMinute(Date date, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, offset);
        return c.getTime();
    }

    public static Date addSecond(Date date, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.SECOND, offset);
        return c.getTime();
    }

    public static Date addDay(Date date, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, offset);
        return c.getTime();
    }

    public static Date addDayByNow(int offset) {
        return addDay(new Date(), offset);
    }

    public static Date addMonth(Date date, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, offset);
        return c.getTime();
    }

    public static Date addYear(Date date, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, offset);
        return c.getTime();
    }


    public static String dateToStrYyyyMMdd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String c = sdf.format(date);
        return c;
    }

    public static String dateToStr(Date date, String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        String c = sdf.format(date);
        return c;
    }

    public static Date strToDate(String str, String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getTime();
    }

    public static Date strToDateYyyyMMdd(String str) {
        return strToDate(str, "yyyyMMdd");
    }

    public static long getNowTimeLong() {
        return new Date().getTime();
    }

    /**
     * @return yyyyMMdd
     */
    public static String getNowTimeYyyyMMdd() {
        return getNowTimeDesc("yyyyMMdd");
    }

    /**
     * @return yyyyMMdd
     */
    public static String getNowTimeYyyyMMdd(Date date) {
        return dateToStr(date, "yyyyMMdd");
    }

    /**
     * @return yyyy-MM-dd
     */
    public static String getNowTimeYyyy_MM_dd() {
        return getNowTimeDesc("yyyy-MM-dd");
    }

    /**
     * @return yyyyMMddHHmmss
     */
    public static String getNowTimeYyyyMMddHHmmss() {
        return getNowTimeDesc("yyyyMMddHHmmss");
    }

    /**
     * @return yyyyMMddHHmmssSSS
     */
    public static String getNowTimeYyyyMMddHHmmssSSS() {
        return getNowTimeDesc("yyyyMMddHHmmssSSS");
    }

    public static String getNowTimeDesc(String fmt) {
        return dateToStr(new Date(), fmt);
    }

    /**
     * @return yyyyMMddHHmmss
     */
    public static String getNowTimeDesc() {
        return getNowTimeDesc("yyyyMMddHHmmss");
    }

    /**
     * @return yyyyMMddHHmmssSSS
     */
    public static String getNowTimeDescMillisecond() {
        return getNowTimeDesc("yyyyMMddHHmmssSSS");
    }


    /**
     * 把秒格式化成指定时间
     *
     * @param seccond
     * @return
     */
    public static String formatTimeSeccond(int seccond, String format) {
        Date date = new Date();
        //这里不知道为什么会多8个小时
        date.setTime(seccond * 1000 - 8 * 60 * 60 * 1000);
        String s = DateUtil.dateToStr(date, format);
        return s;
    }

    /**
     * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
     *
     * @param nowTime 当前时间
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     * @author jqlin
     */
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    public static Date strToDateyymmdd(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        Date date = null;
        try {
            date = formatter.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

