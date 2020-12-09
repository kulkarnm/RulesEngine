package com.test.rules;

import java.util.function.Function;

public interface FunctionBuilder<X,Y> {
    public Function <X,Y> buildFunction();
    public X getX();
}
