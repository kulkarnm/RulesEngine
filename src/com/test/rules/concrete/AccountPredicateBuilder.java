package com.test.rules.concrete;

import com.test.rules.PredicateBuilder;

import java.util.function.Predicate;

public class AccountPredicateBuilder implements PredicateBuilder<Account> {
    private final Account account;
    public AccountPredicateBuilder(Account account) {
        this.account = account;
    }

    @Override
    public Predicate<Account> buildPredicate() {
        return a->a.isChannelEligible();
    }

    @Override
    public Account getA() {
        return this.account;
    }
}
