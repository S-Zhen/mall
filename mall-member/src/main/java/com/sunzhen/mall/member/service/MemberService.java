package com.sunzhen.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunzhen.common.utils.PageUtils;
import com.sunzhen.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-02 00:34:57
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

