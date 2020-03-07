package com.combination.example.one;

import java.util.ArrayList;

public class Branch extends Corp {


    //领导下边有哪些下级领导和小兵
    ArrayList<Corp> subordinateList = new ArrayList<Corp>();


    //构造函数是必需的
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    //增加一个下属，可能是小头目，也可能是个小兵
    public void addSubordinate(Corp corp) {
        corp.setParent(this);//设置父节点
        this.subordinateList.add(corp);
    }

    //我有哪些下属
    public ArrayList<Corp> getSubordinateList() {
        return this.subordinateList;
    }
}
