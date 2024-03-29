package org.zero.mall.common.model.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.zero.mall.common.enums.CodeEnum;

/**
 * 返回类
 * 
 * @author yezhaoxing
 * @date 2017/4/29
 */
@ApiModel("返回带有数据的vo对象")
public class ReturnVo<T> extends BaseReturnVo {

    @ApiModelProperty("返回结果")
    private T data;

    public ReturnVo() {
    }

    public ReturnVo(CodeEnum codeEnum, String msg) {
        super(codeEnum, msg);
    }

    public static <T> ReturnVo<T> success(T data) {
        ReturnVo<T> returnVo = new ReturnVo<>(CodeEnum.SUCCESS, SUCCESS_DEFAULT_DESC);
        returnVo.setData(data);
        return returnVo;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
