package top.bitv.dev.candy.z.biz;

import top.bitv.dev.candy.event.Event;
import top.bitv.dev.candy.state.ordinary.Action;
import top.bitv.dev.candy.state.ordinary.Condition;
import top.bitv.dev.candy.state.ordinary.ETrigger;

/**
 * @author wangzp
 * @since 2022/6/22
 */
public class AuditTrigger<T extends AuditEvent> extends ETrigger {
    @Override
    public Action trigger(Condition condition) {
        return null;
    }

    @Override
    public void listen(Event event) {

    }
}
