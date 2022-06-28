package top.bitv.dev.candy.state.ordinary;

/**
 * 状态机规范
 * @author wangzp
 * @since 2022/6/22
 */
public interface StateMachine {
    void shift();
    void preValid();
}
