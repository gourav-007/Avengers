package com.avengers.config.convertors;

import com.avengers.config.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConvertor implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> browserTypeMap = Map.of("CHROME", BrowserType.CHROME, "FIREFOX", BrowserType.FIREFOX);

        return browserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
    }
}
