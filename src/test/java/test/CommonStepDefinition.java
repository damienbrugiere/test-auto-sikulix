package test;

import org.sikuli.script.Screen;

public class CommonStepDefinition {

    private static CommonStepDefinition instance = null;
    private Screen screen;
    private final String workingDirectory = System.getProperty("user.dir");

    private CommonStepDefinition() {
        this.screen = new Screen();
    }

    public static CommonStepDefinition getInstance() {
        if (instance == null) {
            instance = new CommonStepDefinition();
        }
        return instance;
    }

    public Screen getScreen() {
        return screen;
    }
}
