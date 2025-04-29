package src.exercise3;

import java.util.Arrays;
import java.util.List;

public class Configuration {

    final String appName;
    final List<String> modules;

    public Configuration(String appName, List<String> modules) {
        this.appName = appName;
        this.modules = modules;
    }

    final void describe(){
        System.out.println(appName);
        modules.forEach(System.out::println);
    }
}
