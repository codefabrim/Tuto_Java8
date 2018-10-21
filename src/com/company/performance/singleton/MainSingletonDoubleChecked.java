package com.company.performance.singleton;

/**
 * Created by Oana on 25.04.2018.
 */
public class MainSingletonDoubleChecked {


    private static volatile VisitorTickectTracker instance;

    public static VisitorTickectTracker getInstance() {

        if (instance == null) {
            synchronized (VisitorTickectTracker.class) {
                if (instance == null) {
                    instance = new VisitorTickectTracker();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        System.out.println("MainSingleton.main : DoubleCheckedSingleton");
        VisitorTickectTracker v1 = getInstance();
        VisitorTickectTracker v2 = getInstance();

        System.out.println("MainSingleton.main");


    }
}