package com.example.blindtest.game;

import javafx.scene.image.Image;
import javafx.scene.media.Media;

public class Round {

    private final Object content;

    private final String contentType;

    private final String answer;

    public Round(Image content, String answer) {
        this.content = content;
        this.contentType = "image";
        this.answer = answer;
    }

    public Round(Media content, String answer) {
        this.content = content;
        this.contentType = "media";
        this.answer = answer;
    }

    public Object getContent() {
        return content;
    }

    public String getContentType() {
        return contentType;
    }

    public String getAnswer() {
        return answer;
    }
}
