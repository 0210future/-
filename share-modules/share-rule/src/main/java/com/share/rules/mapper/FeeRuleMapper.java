package com.share.rules.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.share.rule.domain.FeeRule;

import java.util.List;

/**
 * 费用规则Mapper接口
 *
 */
public interface FeeRuleMapper extends BaseMapper<FeeRule>
{

    List<FeeRule> selectFeeRuleList(FeeRule feeRule);
}

