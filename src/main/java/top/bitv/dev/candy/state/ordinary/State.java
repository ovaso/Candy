package top.bitv.dev.candy.state.ordinary;


/**
 * @author wangzp
 * @since 2022/6/22
 */
public interface State {
    /**
     * 获取状态码
     * @return
     */
    int getCode();

    /**
     * 获取状态名称
     * @return
     */
    String getName();

    /**
     * 获取下一个状态
     * @param action
     */
    void getStepState(Action action);

    /**
     * 获取上一个状态
     * @param action
     */
    void getBackState(Action action);

    /**
     * 获取当前状态
     * @return
     */
    default State getCurrent(){
        return this;
    }
}
