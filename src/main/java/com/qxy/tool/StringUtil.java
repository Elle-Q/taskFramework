package com.qxy.tool;

import com.spreada.utils.chinese.ZHConverter;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class StringUtil {

    public static void main(String[] args) {

        String str = "123a\bbc.jpg";
        String str2 = replaceLocalSystemFileInvalidCharToUnicode(str);
        System.out.println(str);
        System.out.println(str2);
    }

    private static String[] WINDOWS_SYSTEM_LOCAL_FILE_INVALID_CHARS = {"\\", "/", ":", "*", "?", "<", ">", "|", "\"","\b"};// 不能作为文件名的关键字
    private static List<String> WINDOWS_SYSTEM_LOCAL_INVALID_FILENAME = Arrays.asList(new String[]{"con", "nul", "aux"});// 不能作为文件名的名字
    private static String[] INVALID_CHARR_REGXS = {"\\.+$"};// 不能是.结尾

    /**
     * 限制最大长度的字符串，如果超过就截取
     *
     * @return
     */
    public static String subStrByMaxLength(String str, int maxLength) {
        return str == null ? null : str.length() > maxLength ? str.substring(0, maxLength) : str;
    }

    /**
     * 按字节截断
     * @param str
     * @param maxLength
     * @param charsetName
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String subStrByMaxByteLength(String str, int maxLength, String charsetName) throws UnsupportedEncodingException {
        int totalByteNum = 0;
        StringBuilder sb = new StringBuilder();

        if(isBlank(str))return str;
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            int byteNum = String.valueOf(chr).getBytes(charsetName).length;
            totalByteNum = totalByteNum + byteNum;
            sb.append(chr);

            if (totalByteNum == maxLength) {
                return sb.toString();
            }

            if (totalByteNum > maxLength){
                return sb.subSequence(0, sb.length() - 1).toString();
            }
        }

        return sb.toString();
    }

    /**
     * 是否支持字符集
     *
     * @return
     */
    public static boolean isSupportCharset(String str, String encoding) {
        return str.equals(convertCharset(str, encoding));
    }

    public static String convertCharset(String str, String encoding) {
        try {
            return new String(str.getBytes(encoding), encoding);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("编码错误!" + e.getMessage());
        }
    }

    /**
     * 删除指定字符串之后的所有内容
     *
     * @param after
     * @return
     */
    public static String substrAfter(String src, String after) {
        if (src == null)
            return src;
        int indexOf = src.indexOf(after);
        if (indexOf > 0)
            src = src.substring(0, indexOf);
        return src;
    }


    /**
     * 智能分词
     */
    public static List<String> smartSplitStr(String str) {
        List<String> list = RegexUtil.searchList(str, "[a-z|A-Z]+");
        List<String> zhList = RegexUtil.searchList(str, "[\u4e00-\u9fa5]+");
        list.addAll(zhList);
        return list;
    }


    /**
     * 双字节文字的位置
     *
     * @return 返回-1代表没有找到
     */
    public static int doubleCharPos(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) + "").getBytes().length > 1) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 是否包含双字节文件
     */
    public static boolean isContainDoubleChar(String str) {
        return isContainDoubleChar(str, null);
    }

    /**
     * 是否包含双字节文件
     */
    public static boolean isContainDoubleChar(String str, List<String> excludes) {
        for (int i = 0; i < str.length(); i++) {
            String temp = str.charAt(i) + "";
            if (excludes != null && excludes.contains(temp))
                continue;
            if (temp.getBytes().length > 1) {
                return true;
            }
        }
        return false;
    }

    /**
     * 过滤掉双字节的字符
     *
     * @param str
     * @return
     */
    public static String filterDoubleChar(String str) {
        if (str == null)
            return null;
        StringBuilder bul = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c + "").getBytes().length == 1) {
                bul.append(c);
            }
        }
        return bul.toString();
    }

    /**
     * 是否中文繁体字
     *
     * @param str
     * @return
     */
    public static boolean zhContainsTraditional(String str) {
        if (StringUtil.isBlank(str))
            return false;
        return !str.equals(ZHConverter.convert(str, ZHConverter.SIMPLIFIED));
    }

    /**
     * 判断两个字符串是否相等
     */
    public static boolean equals(String str1, String str2) {
        if (StringUtil.isBlank(str1)) return false;
        if (StringUtil.isBlank(str2)) return false;
        return str1.equals(str2);
    }

    /**
     * 中文繁体,转简体
     *
     * @param str
     * @return
     */
    public static String zhTraditional2Simplified(String str) {
        if (StringUtil.isBlank(str))
            return str;
        return ZHConverter.convert(str, ZHConverter.SIMPLIFIED);
    }

    /**
     * 调用obj.toString()，但是不会报空指针异常
     *
     * @param obj
     * @return
     */
    public static String objToString(Object obj) {
        if (obj == null)
            return null;
        return obj.toString();
    }

    /**
     * 分割字符串
     *
     * @param stringToSplit
     * @param delimitter
     * @return
     */
    public static List<?> split(String stringToSplit, String delimitter) {
        String[] split = StringUtils.split(stringToSplit, delimitter);
        return split == null ? new ArrayList<>() : Arrays.asList(split);
    }

    /**
     * 把html中的转义字符替换为正常编码
     *
     * @param html
     * @return
     */
    public static String unicodeToStr(String html) {
        List<String> list = RegexUtil.searchList(html, "&#\\d{1,5};");
        String str = html;
        for (String ch : list) {
            str = str.replace(ch, "" + (char) Integer.parseInt(ch.replace("&#", "").replace(";", "")));
        }
        return str;
    }

    /**
     * 把正常编码转为html中的转义字符
     *
     * @return
     */
    public static String strToUnicode(char ch) {
        return "&#" + (int) ch + ";";
    }

    /**
     * 把文件系统中不允许出现的字符串,替换为unicode转义
     *
     * @param str
     * @return
     */
    public static String replaceLocalSystemFileInvalidCharToUnicode(String str) {
        return replaceLocalSystemFileInvalidCharToUnicode(str,true,false);
    }

    /**
     * 把文件系统中不允许出现的字符串,替换为unicode转义
     * @param str
     * @param isConsiderLastDot 是否考虑末尾有小数点的情况
     * @return
     */
    public static String replaceLocalSystemFileInvalidCharToUnicode(String str,boolean isConsiderLastDot,boolean isConsiderSpecialChar) {
        if(StringUtil.isBlank(str)) return str;
        for (String invalidChar : WINDOWS_SYSTEM_LOCAL_FILE_INVALID_CHARS) {
            if (str.contains(invalidChar)) {
                String replaceStr = strToUnicode(invalidChar.charAt(0));
                str = str.replace(invalidChar, replaceStr);
            }
        }
        if(isConsiderLastDot){
            String invalidEndChar = ".";
            if (str.lastIndexOf(invalidEndChar) == str.length() - 1)
                str = str.substring(0, str.length() - 1) + strToUnicode(invalidEndChar.charAt(0));
        }
        if(isConsiderSpecialChar)
            str=replaceLocalSystemFileSpecialChar(str,"_");
        return str;
    }

    /**
     * 替换文件中的特殊字符，ascii在32以下
     * @param src
     * @param replaceChr
     * @return
     */
    public static String replaceLocalSystemFileSpecialChar(String src,String replaceChr){
        if(StringUtil.isBlank(src)) return src;
        String result="";
        for(char chr:src.toCharArray()){
            int ascii= (int)chr;
            //对照ASCII字符表，32以下的需要进行替换。
            if (ascii < 32 ) {
                result+=replaceChr;
            }else{
                result+=chr;
            }
        }
        return result;
    }



    /**
     * 把文件系统中不允许出现的字符串替换掉
     *
     * @param str
     * @param replaceStr
     * @return
     */
    public static String replaceLocalSystemFileInvalidChar(String str, String replaceStr) {
        for (String invalidChar : WINDOWS_SYSTEM_LOCAL_FILE_INVALID_CHARS) {
            if (str.contains(invalidChar))
                str = str.replace(invalidChar, replaceStr);
        }
        for (String invalidCharRegx : INVALID_CHARR_REGXS) {
            str = RegexUtil.replace(str, invalidCharRegx, replaceStr);
        }
        return str;
    }

    /**
     * 和startWith相反，是判断结尾
     *
     * @param org
     * @param end
     * @return
     */
    public static boolean endWith(String org, String end) {
        if (org.length() < end.length())
            return false;
        return org.substring(org.length() - end.length()).equals(end);
    }

    /**
     * 删除字符串中指定字符串后面所有的内容
     */
    public static String deleteAfter(String str, String afterStr) {
        if (str.contains(afterStr))
            str = str.substring(0, str.lastIndexOf(afterStr));
        return str;
    }

    /**
     * 删除字符串中指定字符串前面所有的内容
     */
    public static String deleteBefore(String str, String afterStr) {
        if (str.contains(afterStr))
            str = str.substring(str.indexOf(afterStr) + afterStr.length(), str.length());
        return str;
    }


    public static boolean isFileInvalidChar(String str) {
        return isContainsChar(str, WINDOWS_SYSTEM_LOCAL_FILE_INVALID_CHARS);
    }

    /**
     * str中，是否包含数组中定义的字符
     *
     * @param str
     * @return
     */
    public static boolean isContainsChar(String str, String[] finds) {
        for (String find : finds) {
            if (str.contains(find))
                return true;
        }
        return false;
    }


    // 替换所有发现的匹配字符串
    public static String replace(String str, String repl, String with) {
        return StringUtils.replace(str, repl, with);
    }


    // 只替换第一次发现的匹配字符串
    public static String replaceOnce(String str, String strOrg, String strReplace) {
        int indexOf = str.indexOf(strOrg);
        return str.substring(0, indexOf) + strReplace + str.substring(indexOf + strOrg.length());
    }

    /**
     * 获取字符串的长度，中文占两个字符,英文数字符号占1字符
     *
     * @param value 指定的字符串
     * @return 字符串的长度
     */
    public static int length(String value) {
        int valueLength = 0;
        if (isBlank(value))
            return valueLength;
        String chinese = "[\u4e00-\u9fa5]";
        // 获取字段值的长度，如果含中文字符，则每个中文字符长度为2，否则为1
        for (int i = 0; i < value.length(); i++) {
            // 获取一个字符
            String temp = value.substring(i, i + 1);
            // 判断是否为中文字符
            if (temp.matches(chinese)) {
                // 中文字符长度为2
                valueLength += 2;
            } else {
                // 其他字符长度为1
                valueLength += 1;
            }
        }
        // 进位取整
        return valueLength;
    }

    /**
     * 要求str，包括cons字符串数组中所有字符串
     *
     * @param str  字符串
     * @param cons 必须保护的字符串数组
     * @return
     */
    public static boolean containsAll(String str, String[] cons) {
        for (String str1 : cons) {
            if (!str.contains(str1))
                return false;
        }
        return true;
    }

    /**
     * 包括cons字符串数组中任何一个字符串，就返回true
     *
     * @param str  字符串
     * @param cons 必须保护的字符串数组
     * @return
     */
    public static boolean containsOne(String str, String[] cons) {
        for (String str1 : cons) {
            if (str.contains(str1))
                return true;
        }
        return false;
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().equals("");
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String ifNotBlank(String ifNotBlank, String str) {
        return isBlank(ifNotBlank) ? "" : str;
    }

    /**
     * 删除结尾字符串，只能在最开头结尾
     *
     * @return 返回删除后的字符串，如果找不到则返回原始字符串
     */
    public static String deleteLast(String str, String lastStr) {
        if (str == null || lastStr == null || str.length() < lastStr.length()) {
            return str;
        }
        if (str.substring(str.length() - lastStr.length()).equals(lastStr)) {
            return str.substring(0, str.length() - lastStr.length());
        }
        return str;
    }

    /**
     * 删除开头字符串，只能在最开头出现
     *
     * @param orgStr
     * @param delStr
     * @return 返回删除后的字符串，如果找不到则返回原始字符串
     */
    public static String deleteHead(String orgStr, String delStr) {
        if (orgStr == null || delStr == null || orgStr.length() < delStr.length()) {
            return orgStr;
        }
        return orgStr.indexOf(delStr) == 0 ? orgStr.substring(delStr.length()) : orgStr;
    }

    /**
     * html转义字符还原
     *
     * @param html
     * @return
     */
    public static String html2Str(String html) {
        String[] str1 = {"&amp;"};
        String[] str2 = {"&"};
        String str = html;
        for (int i = 0; i < str1.length; i++) {
            str = str.replace(str1[i], str2[i]);
        }
        return str;
    }

    public static String urlDecode(String str) {
        return urlDecode(str, "utf-8");
    }


    public static String urlDecode(String str, String encode) {
        String s = null;
        try {
            s = java.net.URLDecoder.decode(str, encode);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        }
        return s;
    }

    /**
     * 封装普通的URLEncoder.encode
     *
     * @param str
     * @return
     */
    public static String urlEncode(String str) {
        return urlEncode(str, "utf-8");
    }


    /**
     * 封装普通的URLEncoder.encode
     *
     * @param str
     * @param encode
     * @return
     */
    public static String urlEncode(String str, String encode) {
        String s = null;
        try {
            s = java.net.URLEncoder.encode(str, encode);
            //因为默认的会把空格编码为+,所以增加修正+为%20,
            s = s.replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        }
        return s;
    }

    public static String join(List<?> list, String separator) {
        if (list == null)
            return "";
        return join(list.toArray(), separator);
    }

    public static String join(Set<?> list, String separator) {
        if (list == null)
            return "";
        return join(list.toArray(), separator);
    }

    public static String join(Object[] array, String separator) {
        if (array == null || array.length == 0)
            return "";
        if (separator == null) {
            separator = "";
        }

        int arraySize = array.length;
        int bufSize = arraySize == 0 ? 0 : (array[0].toString().length() + separator.length()) * arraySize;
        StringBuffer buf = new StringBuffer(bufSize);

        for (int i = 0; i < arraySize; ++i) {
            if (i > 0) {
                buf.append(separator);
            }

            buf.append(array[i]);
        }

        return buf.toString();
    }

    public static String join(Iterator iterator, String separator) {
        if (separator == null) {
            separator = "";
        }

        StringBuffer buf = new StringBuffer(256);

        while (iterator.hasNext()) {
            buf.append(iterator.next());
            if (iterator.hasNext()) {
                buf.append(separator);
            }
        }

        return buf.toString();
    }

    /**
     * 找字符串第几次出现的位置
     *
     * @param str
     * @param findStr
     * @param count
     * @return
     */
    public static int indexOf(String str, String findStr, int count) {
        int curCount = 0;
        int rest = str.indexOf(findStr);
        int index = -1;
        while (curCount < count && str.indexOf(findStr, index) > -1) {
            rest = str.indexOf(findStr, index);
            index = rest + 1;
            curCount++;
        }
        if (curCount != count)
            return -1;
        return rest;
    }

    /**
     * 是否有多个相同子串
     * @param str
     * @param indexOfStr
     * @return
     */
    public static  boolean isMulitIndexOf(String str, String indexOfStr) {
        return (str.indexOf(indexOfStr) != str.lastIndexOf(indexOfStr));
    }

}
