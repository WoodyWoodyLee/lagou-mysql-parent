package com.lagou.hint;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

public class MyHintShardingAlgorithm implements HintShardingAlgorithm<Long> {
    @Override
    public Collection<String> doSharding(Collection<String> collection, HintShardingValue<Long> hintShardingValue) {
        Collection<String> res = new ArrayList<>();
        for (String s : collection) {
            for (Long value : hintShardingValue.getValues()) {
                if (s.endsWith(String.valueOf(value%2))){
                   res.add(s);
                }
            }
        }
        return res;
    }
}
