package com.avengers.config;
import com.avengers.config.convertors.StringToBrowserTypeConvertor;
import com.avengers.config.enums.BrowserRemoteMode;
import com.avengers.config.enums.BrowserType;
import com.avengers.config.enums.RunMode;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system.properties",
        "system.env",
        "file:/C:/Users/goura/IdeaProjects/Avengers/src/test/resources/config.properties",
        "classpath:config.properties",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:/absolute/path/to/src/test/resources/config.properties"
})

public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserType browser();
    RunMode runModeBrowser();
    BrowserRemoteMode browserRemoteMode();
}
