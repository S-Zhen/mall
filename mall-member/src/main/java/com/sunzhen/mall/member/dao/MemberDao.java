package com.sunzhen.mall.member.dao;

import com.sunzhen.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sunzhen
 * @email 1025951770@qq.com
 * @date 2021-01-02 00:34:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
