package com.test.rules.concrete;

import com.test.rules.Rule;
import com.test.rules.RuleSet;

public class TestMain {
    public static void main(String[] args){
        Account account = new Account();
        AccountPredicateBuilder  apb = new AccountPredicateBuilder(account);
        AccountFunctionBuilder  afb = new AccountFunctionBuilder(account);
        Rule<Account,Account,Boolean> rule = new Rule<>(apb,afb);
        RuleSet<Account,Account,Boolean> ruleSet = new RuleSet<>();
        ruleSet.addRule(rule);
        ruleSet.apply();
    }
}
