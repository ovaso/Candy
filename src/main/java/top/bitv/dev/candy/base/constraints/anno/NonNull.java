package top.bitv.dev.candy.base.constraints.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 需要有Runtime(或容器)支持
 * 不得为空
 * @author wangzp
 * @since 2022/6/24
 */
@Target({ElementType.PARAMETER, ElementType.TYPE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.SOURCE)
public @interface NonNull {
}
