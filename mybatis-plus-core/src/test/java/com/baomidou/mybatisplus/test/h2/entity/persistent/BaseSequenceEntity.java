package com.baomidou.mybatisplus.test.h2.entity.persistent;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * </p>
 *
 * @author yuxiaobin
 * @date 2017/6/26
 */
@Data
@Accessors(chain = true)
@KeySequence("SEQ_TEST")
public abstract class BaseSequenceEntity {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "TEST_ID", type = IdType.INPUT)
    private Long id;

}
