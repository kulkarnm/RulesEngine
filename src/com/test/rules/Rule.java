package com.test.rules;

import java.util.function.Function;
import java.util.function.Predicate;

public class Rule < A,X,Y> {
         private final Predicate <A> predicate;
         private final Function <X,Y> function;
         private A a;
         private X x;

    public Rule(PredicateBuilder<A> predicateBuilder, FunctionBuilder<X, Y> functionBuilder) {
        this.predicate = predicateBuilder.buildPredicate();
        this.function = functionBuilder.buildFunction();
        this.a = predicateBuilder.getA();
        this.x = functionBuilder.getX();
    }

    public Predicate<A> getPredicate() {
        return predicate;
    }

    public Function<X, Y> getFunction() {
        return function;
    }

    public A getA() {
        return a;
    }

    public X getX() {
        return x;
    }
}
