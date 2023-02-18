package darksword.console;

import java.util.LinkedHashMap;
import java.util.Map;

public class Config {

    public static Map<Option, Setting> argSetting = new LinkedHashMap<>();

    static {
        argSetting.put(Option.Version, new Setting("-v", false, false));
        argSetting.put(Option.Help, new Setting("-h", false, false));

        argSetting.put(Option.Input, new Setting("-i", true, System.in));

        argSetting.put(Option.LogOutput, new Setting("-log-o", true, System.out));

        argSetting.put(Option.OJMode, new Setting("-oj", false, false));

        argSetting.put(Option.Stdin, new Setting("-stdin", true, System.in));
        argSetting.put(Option.Stdout, new Setting("-stdout", true, System.out));

        argSetting.put(Option.LibRavel, new Setting("-ravel", true, ""));
        argSetting.put(Option.Builtin, new Setting("-builtin", true, ""));

        argSetting.put(Option.JIT, new Setting("-jit", false, false));
        argSetting.put(Option.EmitDir, new Setting("-jit-emit", true, "jit"));

        argSetting.put(Option.OptLevel, new Setting("-opt", true, 0));
    }

    ;

    public static String getPath(Option option) {
        var setting = argSetting.get(option);
        assert setting.needValue;
        return setting.argValueStr;
    }

    public static Object getArgValue(Option option) {
        var setting = argSetting.get(option);
        assert setting.needValue;
        return setting.argValue;
    }

    public enum Option {Version, Help, Input, LogOutput, OJMode, Stdin, Stdout, LibRavel, Builtin, JIT, EmitDir, OptLevel}

    public static class Setting {
        String argName;
        String argValueStr;
        boolean needValue;

        Object argValue;

        public Setting(String argName, boolean needValue, Object defaultValue) {
            this.argName = argName;
            this.needValue = needValue;
            this.argValue = defaultValue;
        }
    }
}
