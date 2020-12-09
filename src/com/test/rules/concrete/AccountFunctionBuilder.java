package com.test.rules.concrete;

import com.test.rules.FunctionBuilder;

import java.util.function.Function;

public class AccountFunctionBuilder implements FunctionBuilder<Account,Boolean> {

    private final Account account;

    public AccountFunctionBuilder(Account account) {
        this.account = account;
    }

    @Override
    public Function<Account, Boolean> buildFunction() {
        return a->a.setInEligible();
    }

    @Override
    public Account getX() {
        return this.account;
    }
}
