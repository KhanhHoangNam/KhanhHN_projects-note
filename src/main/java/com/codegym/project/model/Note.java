package com.codegym.project.model;

public class Note {
    private int typeId;
    private String title;
    private String content;

    public Note() {
    }

    public Note(int typeId, String title, String content) {
        this.typeId = typeId;
        this.title = title;
        this.content = content;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
