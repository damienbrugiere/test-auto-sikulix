package test;

import org.sikuli.script.Pattern;

public class FileUtils {

    private static final String workingDirectory = System.getProperty("user.dir") + "/src/test/resources/";

    public static Pattern matchFile(String file){
        return new Pattern(workingDirectory + file).similar(0.99f);
    }
    public static String file(String file){
        return workingDirectory + file;
    }
}
