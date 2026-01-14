package com.designPattern;

public class Main {

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();

        GUIFactory factory1 = new MacFactory();

        Application app = new Application(factory);

        Application app2 = new Application(factory1);
        app.run();
        app2.run();
    }
}
