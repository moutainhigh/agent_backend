/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.mall.common.dto;

import lombok.Data;
import java.io.Serializable;

/**
 *
 * @author JL
 * @date 2019-08-12 16:25:10
 */
@Data
public class SpuSpecDTO implements Serializable {
	private static final long serialVersionUID = 1L;

    private String id;
    private String value;

}
