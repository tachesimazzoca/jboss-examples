package com.github.tachesimazzoca.jboss.jaxrs;

import java.util.ArrayList;
import java.util.List;

public class ApiResponse<T> {
    private final List<T> entries;

    private ApiResponse() {
        this.entries = null;
    }

    public ApiResponse(T entry) {
        this.entries = new ArrayList<T>();
        this.entries.add(entry);
    }

    public ApiResponse(List<T> entries) {
        this.entries = entries;
    }

    public List<T> getEntries() {
        return entries;
    }
}
