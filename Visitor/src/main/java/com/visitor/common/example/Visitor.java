package com.visitor.common.example;

/**
 * 具体访问者
 */
public class Visitor implements IVisitor {
    public void visit(ConcreteElement1 element1) {
        element1.doSomething();
    }

    public void visit(ConcreteElement2 element2) {
        element2.doSomething();
    }
}
