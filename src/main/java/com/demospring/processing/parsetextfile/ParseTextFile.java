package com.demospring.processing.parsetextfile;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

@Component
public class ParseTextFile {
    private static final Logger LOG = LoggerFactory.getLogger(ParseTextFile.class);

    public Map<String, Integer> parseFile(String filePath) throws IOException {
        Map<String, Integer> map = new TreeMap();
        File file = new File(this.getClass().getClassLoader().getResource(filePath).getFile());
        if (file.exists()) {
            String lineString;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((lineString = bufferedReader.readLine()) != null) {
                String[] strings = StringUtils.split(lineString, " ");
                map.put(strings[0], Integer.valueOf(strings[1]));
            }
            bufferedReader.close();
            return map;
        } else {
            throw new FileNotFoundException("file doesn't exists");
        }
    }

    public String getKeyFromValue(Map<String, Integer> map, Integer value) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(value)) {
                return key;
            }
        }
        return null;
    }
}

