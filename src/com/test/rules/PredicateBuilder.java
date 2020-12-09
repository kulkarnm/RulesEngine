package com.test.rules;

import java.util.function.Predicate;

public interface PredicateBuilder<A> {
    public Predicate<A> buildPredicate ();
    public A getA();
}
