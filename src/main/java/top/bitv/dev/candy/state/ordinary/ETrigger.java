package top.bitv.dev.candy.state.ordinary;

import top.bitv.dev.candy.event.Event;
import top.bitv.dev.candy.event.EventListener;

/**
 * EventTrigger 状态事件触发器
 * @author wangzp
 * @since 2022/6/22
 */
public abstract class ETrigger<SE extends StateEvent> implements Trigger, EventListener {

}
