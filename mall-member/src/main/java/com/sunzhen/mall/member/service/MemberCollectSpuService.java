package com.sunzhen.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.mall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-02 00:34:58
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

