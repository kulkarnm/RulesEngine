package com.test.rules;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Function;

public class RuleSet<A,X,Y> extends LinkedList<Rule<A,X,Y>> {
    private Function<X,Y> defaultFunction = null;
    public RuleSet(){
        super();
    }
    public RuleSet (Collection<? extends Rule<A,X,Y>> c){
        super(c);
    }

    public RuleSet<A,X,Y> addRule(Rule<A,X,Y> rule){
        add(rule);
        return this;
    }

    public Function<X,Y> getDefaultFunction(){
        return  defaultFunction;
    }

    public void setDefaultFunction(Function<X, Y> defaultFunction) {
        this.defaultFunction = defaultFunction;
    }


    public void apply() {
        for(Rule<A,X,Y> rule: this){
            if(rule.getPredicate().test(rule.getA())){
                rule.getFunction().apply(rule.getX());
            }
        }
    }
}
