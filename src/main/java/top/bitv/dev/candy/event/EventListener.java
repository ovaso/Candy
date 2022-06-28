package top.bitv.dev.candy.event;

/**
 * @author wangzp
 * @since 2022/6/22
 */
public interface EventListener {
    // 对指定方法进行事件传入
    void listen(Event event);
}
