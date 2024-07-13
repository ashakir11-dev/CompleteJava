package com.mytube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class VideoProcessor {
    IVideoEncoder videoEncoder; 
    VideoDatabase videoDatabase; 
    EmailService emailService; 

    

    public VideoProcessor(IVideoEncoder videoEncoder, VideoDatabase videoDatabase, EmailService emailService) {
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.emailService = emailService;

    }

    public void process(Video video) {
        videoEncoder.encode(video);
        videoDatabase.store(video);
        emailService.sendEmail(video.getUser());
    }
}

