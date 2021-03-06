/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.aiforest.com
 * 注意：
 * 本软件为www.aiforest.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.aiforest.cloud.broker.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.aiforest.cloud.broker.common.entity.Housing;
import com.aiforest.cloud.broker.admin.mapper.HousingMapper;
import com.aiforest.cloud.broker.admin.service.HousingService;
import org.springframework.stereotype.Service;

/**
 * 房源信息
 *
 * @author aiforest
 * @date 2020-08-29 16:56:16
 */
@Service
public class HousingServiceImpl extends ServiceImpl<HousingMapper, Housing> implements HousingService {

}
