package com.demospring.processing.Initializer;

import com.demospring.processing.parsetextfile.ParseTextFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

@Component
public class AppInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(AppInitializer.class);

    @Value("${filePath}")
    private String filePath;

    @Autowired
    ParseTextFile parseTextFile;

    public void showParsedRecords() {
        try {
            Map<String, Integer> map = parseTextFile.parseFile(filePath);
            LOG.info("Created Map after parsing is {}", map);
            Integer minimumAge = Collections.min(map.values());
            String key = parseTextFile.getKeyFromValue(map, minimumAge);
            LOG.info("Person with lowest age is {} with age {}", key, map.get(key));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
