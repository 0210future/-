package com.share.rules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.share.rule.domain.FeeRule;
import com.share.rule.domain.FeeRuleRequestForm;
import com.share.rule.domain.FeeRuleResponseVo;

import java.util.List;

/**
 * 费用规则Service接口
 *
 */
public interface IFeeRuleService extends IService<FeeRule>
{
    //计算订单费用
    FeeRuleResponseVo calculateOrderFee(FeeRuleRequestForm feeRuleRequestForm);


    List<FeeRule> selectFeeRuleList(FeeRule feeRule);

    List<FeeRule> getALLFeeRuleList();
}
