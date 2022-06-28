package top.bitv.dev.candy.state.ordinary;

import top.bitv.dev.candy.event.Event;
import top.bitv.dev.candy.state.ordinary.Condition;

/**
 * @author wangzp
 * @since 2022/6/22
 */
public interface StateEvent extends Event {
    Condition getCondition();
}
