package com.qxy.tool;

import java.io.UnsupportedEncodingException;

public class ChineseUtil {
  public static String toOct(String s)
  {
    String result = "";
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int b1 = b;
      if (b1 < 0) b1 = 256 + b1;
      result += "\\" + (b1 / 64) % 8 +  "" + (b1 / 8) % 8 + "" + b1 % 8;
    }
    return result;
  }

  public static String getOct(String s) throws UnsupportedEncodingException
  {
    String[] as = s.split("\\\\");
    byte[] arr = new byte[as.length - 1];
    for (int i = 1; i < as.length; i++)
    {
      int sum = 0;
      int base = 64;
      for (char c : as[i].toCharArray())
      {
        sum += base * ((int)c - '0');
        base /= 8;
      }
      if (sum >= 128) sum = sum - 256;
      arr[i - 1] = (byte)sum;
    }
    return new String(arr,"UTF-8");
  }

  public static void main(String[] args) throws UnsupportedEncodingException {
    String s = "123中文";
    String o = toOct(s);
    System.out.println(o);
    s = getOct("\\351\\202\\243\\345\\222\\213\\345\\212\\236\\345\\230\\233\\357\\274\\214\\346\\210\\221\\350\\243\\202\\345\\274\\200\\344\\272\\206");
    System.out.println(s);
  }
}
