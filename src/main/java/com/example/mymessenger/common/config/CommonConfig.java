package com.example.mymessenger.common.config;

import com.example.mymessenger.common.BaseBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CommonConfig extends BaseBean {

    private static Environment environment;

    public static Environment getEnvironment() {
        return environment;
    }

    public static void setEnvironment(Environment environment) {
        CommonConfig.environment = environment;
    }

    @Autowired
    public void setEnvironmentBean(Environment environment) {
        setEnvironment(environment);
    }

    public static String[] getActiveProfiles() {
        return environment.getActiveProfiles();
    }

    public static List<String> getActiveProfileList() {
        return Arrays.asList(getActiveProfiles());
    }

    public static String printActiveProfiles(String separator) {
        return StringUtils.join(getActiveProfileList(), separator);
    }

    public static boolean isActiveProfile(String profile) {
        return getActiveProfileList().contains(profile);
    }
}
