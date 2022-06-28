package top.bitv.dev.candy.state.ordinary;

/**
 * @author wangzp
 * @since 2022/6/22
 */
public interface Trigger {
    /**
     * 被动触发
     * @param condition 条件
     * @return 活动或操作
     */
    Action trigger(Condition condition);

    /**
     * 主动监听
     * 需要实现事件监听， 暂不做实现
     * @param condition 条件
     * @return 活动或操作
     */
    //Action listen(Condition condition);
}
