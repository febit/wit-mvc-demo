// Copyright (c) 2013, Webit Team. All Rights Reserved.
package webit.script.demo.mvc.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Zqq
 */
public class DateFormatUtil {

    //Not Thread Safe: private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static String format(Date date) {
        //return date != null ? format.format(date) : null;
        if (date != null) {
            final Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return new StringBuilder(10)
                    .append(calendar.get(Calendar.YEAR))
                    .append('-')
                    .append(calendar.get(Calendar.MONTH)+1)
                    .append('-')
                    .append(calendar.get(Calendar.DAY_OF_MONTH))
                    .toString();
        }
        return null;
    }
}
