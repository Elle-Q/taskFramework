package com.qxy.tool;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.beans.PropertyDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Vector;

/**
 * User: pretty el
 * Date: 2019/10/5
 */
public class LogUtil {

    private static final Log log = LogFactory.getLog(LogUtil.class);

    public static final Log jsErrorLog = LogFactory.getLog("jsError");
    public static final Log jsIgnoreErrorLog = LogFactory.getLog("jsIgnoreError");
    public static final Log securityLog = LogFactory.getLog("Security");
    public static final Log importantLog = LogFactory.getLog("Important");

    public static Log getLog(Class<Object> cls) {
        return LogFactory.getLog(cls);
    }


/*
    */
/**
     * 获取http请求的详细信息
     *
     * @param request
     * @return
     *//*

    public static String getRequestInfo(HttpServletRequest request) {
        String urlPath = "http " + request.getMethod() + ":" + HttpUtil.getFullUrl(request);
        String referer = request.getHeader("referer");
        return urlPath + " referer:" + referer + " ip:" + request.getRemoteAddr() + " agent:" + HttpUtil.getAgent(request);
    }

    public static String getRequestClientInfo(HttpServletRequest request) {
        String referer = request.getHeader("referer");
        return " referer:" + referer + " ip:" + request.getRemoteAddr() + " agent:" + HttpUtil.getAgent(request);
    }
*/

    /**
     * 获取异常信息的第一行
     *
     * @param e
     * @return
     */
    public static String exceptionFirstRow(Throwable e) {
        String info = exceptionToString(e);
        String[] strings = info.split("\r\n");
        if (strings != null && strings.length > 0) {
            return strings[0];
        }
        return null;
    }

    /**
     * 异常信息第一行是否包含
     *
     * @param e
     * @return
     */
    public static boolean exceptionFirstRowContain(Throwable e, String str) {
        String firstRow = exceptionFirstRow(e);
        if (firstRow == null)
            return false;
        return firstRow.contains(str);
    }

    public static String exceptionToString(Throwable e) {
        // StringWriter将包含堆栈信息
        StringWriter stringWriter = new StringWriter();
        // 必须将StringWriter封装成PrintWriter对象，
        // 以满足printStackTrace的要求
        PrintWriter printWriter = new PrintWriter(stringWriter);
        // 获取堆栈信息
        e.printStackTrace(printWriter);
        // 转换成String，并返回该String
        StringBuffer error = stringWriter.getBuffer();
        return error.toString();
    }

    public static String exceptionToHtml(Exception e) {
        String str = exceptionToString(e);
        str = str.replace("\n", "<br/>\n");
        return str;
    }

    public static String beanToString(Object bean) {
        String info = "";
        if (bean == null)
            return "null";
        PropertyDescriptor[] descriptors = getAvailablePropertyDescriptors(bean);
        for (int i = 0; descriptors != null && i < descriptors.length; i++) {
            java.lang.reflect.Method readMethod = descriptors[i].getReadMethod();
            try {
                Object[] objs = null;
                Object value = readMethod.invoke(bean, objs);
                if (value != null)
                    info += "[" + descriptors[i].getName() + "]:" + value + " ; ";
            } catch (Exception e) {
//        log.info("LogUtil : beanToString 失败 ：" + e.getMessage());
            }
        }
        return info;
    }

    public static PropertyDescriptor[] getAvailablePropertyDescriptors(Object bean) {
        try {
            java.beans.BeanInfo info = java.beans.Introspector.getBeanInfo(bean.getClass());
            if (info != null) {
                PropertyDescriptor pd[] = info.getPropertyDescriptors();
                Vector<PropertyDescriptor> columns = new Vector<PropertyDescriptor>();
                for (int i = 0; i < pd.length; i++) {
                    String fieldName = pd[i].getName();
                    if (fieldName != null && !fieldName.equals("class")) {
                        columns.add(pd[i]);
                    }
                }
                PropertyDescriptor[] arrays = new PropertyDescriptor[columns.size()];
                for (int j = 0; j < columns.size(); j++) {
                    arrays[j] = columns.get(j);
                }
                return arrays;
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }
}
