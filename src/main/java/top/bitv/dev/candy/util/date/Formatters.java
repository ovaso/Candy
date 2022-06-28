package top.bitv.dev.candy.util.date;

import java.time.format.DateTimeFormatter;

/**
 * 列举常见的格式化格式器
 * @see DateTimeFormatter
 * @author wangzp
 * @since 2022/6/24
 */
public class Formatters {
    public static final DateTimeFormatter STANDARD = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static DateTimeFormatter get(String pattern){
        return DateTimeFormatter.ofPattern(pattern);
    }
}
