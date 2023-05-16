package com.example.blindtest.utilities;

import com.example.blindtest.game.Match;
import com.example.blindtest.game.Round;
import javafx.scene.image.Image;
import javafx.scene.media.Media;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameFactory {

    private static final int LIMIT_ROUNDS = 10;

    public static Match initMatch() {
        final Match match = new Match();
        match.addRounds(initRounds());
        return match;
    }

    private static List<Round> initRounds() {
        final List<Round> rounds = new ArrayList<>();

        //get all files
        try(var stream = Files.newDirectoryStream(Path.of(GameFactory.class.getResource("assets").toURI()))){
            // shuffle files order
            var listFiles = new ArrayList<Path>();
            stream.iterator().forEachRemaining(listFiles::add);
            Collections.shuffle(listFiles);

            // add new round (with file path of music or image)
            for(int i=0;i<LIMIT_ROUNDS;i++) {
                rounds.add(initRound(listFiles.get(i).toFile().getPath()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return rounds;
    }

    private static Round initRound(String url) {
        String[] fileURL = url.split("/");
        String[] fileFullName = fileURL[fileURL.length-1].split(".");
        final String fileExtension = fileFullName[1];
        final String filename = fileFullName[0];

        switch (fileExtension) {
            case "png", "jpeg" -> {
                return new Round(new Image(url), filename);
            }
            case "mp3", "mp4", "wav" -> {
                new Media(url);
                return new Round(new Media(url), filename);
            }
        }

        throw new IllegalArgumentException("File format is not accepted");
    }

}
