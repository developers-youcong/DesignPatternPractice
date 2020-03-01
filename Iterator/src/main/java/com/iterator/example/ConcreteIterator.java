package com.iterator.example;

import java.util.Vector;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {


    private Vector vector = new Vector();


    //定义当前游标
    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {

        this.vector = _vector;
    }


    public Object next() {

        Object result = null;

        if (this.hasNext()) {

            result = this.vector.get(this.cursor++);
        }


        return result;
    }

    public boolean hasNext() {


        if (this.cursor == this.vector.size()) {

            return false;
        } else {

            return true;
        }

    }

    public boolean remove() {

        this.vector.remove(this.cursor);

        return true;
    }
}
