package org.fautapo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author FNZABALETAA
 */
public final class Convert {

    private Convert() {
    }

    public static final Boolean toBoolean(HttpServletRequest request, String value) {
        String variable = request.getParameter(value);
        if (null == variable) {
            variable = "";
        }
        return toBoolean(variable);
    }

    public static final Date toDate(HttpServletRequest request, String value, String format) throws ParseException {
        String variable = request.getParameter(value);
        Date date = null;
        if (null == variable) {
            date = new Date();
        } else {
            date = new SimpleDateFormat(format).parse(variable);
        }
        return date;
    }

    public static final int toInteger(HttpServletRequest request, String variable) {
        variable = request.getParameter(variable);
        if ((null == variable) || ("".equals(variable))) {
            variable = "0";
        }
        return Integer.parseInt(variable);
    }

    public static final Boolean toBoolean(String value) {
        Boolean valuereturn;
        switch (value) {
            case "on":
                valuereturn = Boolean.TRUE;
                break;
            case "off":
                valuereturn = Boolean.FALSE;
                break;
            case "false":
                valuereturn = Boolean.FALSE;
                break;
            case "true":
                valuereturn = Boolean.TRUE;
                break;
            default:
                valuereturn = Boolean.FALSE;
                break;
        }
        return valuereturn;
    }

    public static final String toString(HttpServletRequest request, String variable) {
        variable = request.getParameter(variable);
        if (null == variable) {
            variable = "";
        }
        return variable;
    }

    public static final String toString(Object variable) {
        return String.valueOf(variable);
    }
}
