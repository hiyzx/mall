package org.zero.mall.pms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 属性值表
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_attr_value")
@ApiModel(value="AttrValue对象", description="属性值表")
public class AttrValue implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "属性值名称")
    private String valueName;

    @ApiModelProperty(value = "属性id")
    private Long attrId;

    @ApiModelProperty(value = "启用：1 停用：0 1")
    private String isEnabled;


}
