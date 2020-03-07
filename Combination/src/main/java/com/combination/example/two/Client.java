package com.combination.example.two;


public class Client {


    //通过递归遍历树
    public static void display(Component root) {
        for (Component c : root.getChildren()
        ) {


            if (c instanceof Leaf) {
                c.doSomething();
            } else {
                //树枝节点
                display(c);
            }
        }
    }

}
