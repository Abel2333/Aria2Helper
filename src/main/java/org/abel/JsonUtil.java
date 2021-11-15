package org.abel;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JsonUtil {
    static public void getJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File configFile = new File("conf.json");
            if (!configFile.exists()) {
                boolean successfulCreate = configFile.createNewFile();
                if (!successfulCreate) throw new IOException();
            }
            GlobalConfig.init(objectMapper.readValue(configFile, GlobalConfig.getConfigClass()));
        } catch (IOException e) {
            System.err.println("Cannot create \"conf.json\"");
        }
    }
}
