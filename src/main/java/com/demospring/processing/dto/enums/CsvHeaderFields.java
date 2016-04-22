package com.demospring.processing.dto.enums;

import java.util.ArrayList;
import java.util.List;

public enum CsvHeaderFields {
    DRONE_ID,
    ALTITUDE,
    LAT,
    LON,
    SPEED,
    BATTERY,
    SEQUENCE,
    TRACK,
    LAST_PACKET;

    public static String[] getCsvHeaderFieldMapping() {
        List<String> headerList = new ArrayList<String>();
        for(CsvHeaderFields status : values()) {
            headerList.add(String.valueOf(status));
        }
        String[] headerMapping = new String[headerList.size()];
        return headerList.toArray(headerMapping);
    }
}
