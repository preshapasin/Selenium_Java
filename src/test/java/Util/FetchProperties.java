package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

public class FetchProperties {

    private static Properties prop;

    public static String getPropValues(String key) {

        String propFilePath = ".\\src\\test\\resources\\config.properties";

        try (InputStream input = new FileInputStream(propFilePath)) {
            prop = new Properties();
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

