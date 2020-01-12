package com.fola.web;

public class AppResponse {
    private final String filterUUID;
    private final String handlerUUID;

    public AppResponse(String filterUUID, String handlerUUID) {
        this.filterUUID = filterUUID;
        this.handlerUUID = handlerUUID;
    }

    public String getFilterUUID() {
        return filterUUID;
    }

    public String getHandlerUUID() {
        return handlerUUID;
    }
}
