package top.bitv.dev.candy.state.ordinary;

/**
 * 可状态化接口
 * @author wangzp
 * @since 2022/6/22
 */
public interface Statable<S extends Enum & State> {
    S getState();
}
