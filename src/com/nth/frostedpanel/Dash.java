package com.nth.frostedpanel;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 *
 * Created by HAU TRUNG NGUYEN <haunt.hcm2015@gmail.com> on Nov 16, 2021
 */
public class Dash extends Pane {

    private Media media;
    private MediaPlayer player;
    private MediaView mediaView;

    private FrostedPanel panel;
    private Scene scene;

    public void setup(Scene scene) {
        this.scene = scene;
        media = new Media(getClass().getResource("video.mp4").toExternalForm());
        player = new MediaPlayer(media);
        mediaView = new MediaView(player);
        player.setAutoPlay(true);
        player.setVolume(0);
        getChildren().add(mediaView);
        mediaView.fitWidthProperty().bind(scene.widthProperty());
        mediaView.fitHeightProperty().bind(scene.heightProperty());

    }
}
