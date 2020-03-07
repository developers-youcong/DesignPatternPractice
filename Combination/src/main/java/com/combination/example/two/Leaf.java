package com.combination.example.two;

import java.util.ArrayList;

public class Leaf extends Component {


    @Deprecated
    public void add(Component component) {

        //空实现，直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }


    @Deprecated
    public void remove(Component component) {

        //空实现
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
