// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.script.demo.mvc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Zqq
 */
public class DataFormatUtil {

    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static String format(Date date) {
        return date != null ? format.format(date) : null;
    }
}
