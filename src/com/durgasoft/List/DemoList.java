package com.durgasoft.List;

import java.util.ArrayList;

public class DemoList {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add(10);
        arrayList.add("A");
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.remove(2);
        arrayList.add(2,"M");
        arrayList.add("N");
        System.out.println(arrayList);
    }

    @Override
    public String toString() {
        return "DemoList{}";
    }
}
