package com.mytube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.processing.Processor;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        VideoEncoder01 videoEncoder = new VideoEncoder01();
        EmailService01 emailService = new EmailService01();
        VideoDatabase01 videoDatabase = new VideoDatabase01();
        VideoProcessor processor = new VideoProcessor(videoEncoder,videoDatabase, emailService);
        processor.process(video);

        List<String> test = new ArrayList<>();
        Collections.addAll(test, "a","b");
        LinkedList<String> test2 = (LinkedList<String>) test;
    }
}
