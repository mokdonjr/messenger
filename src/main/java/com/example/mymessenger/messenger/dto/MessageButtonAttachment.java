package com.example.mymessenger.messenger.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MessageButtonAttachment {

    private String text;
    private String fallback;
    @JsonProperty("callback_id")
    private String callbackId;
    private String color;
    @JsonProperty("attachment_type")
    private String attachmentType;
    private List<Action> actions;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getCallbackId() {
        return callbackId;
    }

    public void setCallbackId(String callbackId) {
        this.callbackId = callbackId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
