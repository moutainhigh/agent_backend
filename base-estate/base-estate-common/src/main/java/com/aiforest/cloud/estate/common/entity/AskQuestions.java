/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.estate.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
    import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/**
 * 房产提问
 *
 * @author way
 * @date 2020-04-13 11:15:48
 */
@Data
@TableName("ask_questions")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "房产提问")
public class AskQuestions extends Model<AskQuestions> {
    private static final long serialVersionUID=1L;

    /**
     * PK
     */
    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "PK")
    private String id;
	/**
	 * 序号
	 */
	@ApiModelProperty(value = "序号")
	private Integer ordinal;
    /**
     * 所属租户
     */
    @ApiModelProperty(value = "所属租户")
    private String tenantId;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    @ApiModelProperty(value = "逻辑删除标记（0：显示；1：隐藏）")
    private String delFlag;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 创建者ID
     */
    @ApiModelProperty(value = "创建者ID")
    private String createId;
    /**
     * 提问内容
     */
    @ApiModelProperty(value = "提问内容")
    private String content;
    /**
     * 回答数量
     */
    @ApiModelProperty(value = "回答数量")
    private Integer answerNum;
    /**
     * 审核状态（0：未审核；1：通过 2：拒绝）
     */
    @ApiModelProperty(value = "审核状态（0：未审核；1：通过 2：拒绝）")
    private String auditStatus;
	/**
	 * 关联楼盘ID
	 */
	@ApiModelProperty(value = "关联楼盘ID")
	private String affiliationId;

	@TableField(exist = false)
	private List<TopicReply> listTopicReply;

	/**
	 * 用户信息
	 */
	@TableField(exist = false)
	private UserInfo userInfo;

}
