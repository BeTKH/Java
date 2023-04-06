package MoshOOP.LooseCoupling.DecouplingVideoProcessorExample;

public class VideoProcessor {

    private VideoEncoder encoder;

    // constructor injection
    public VideoProcessor(VideoEncoder encoder_) {
        this.encoder = encoder_;
    }



    public void process(Video video) {

        // decoupled video encoder
        encoder.encode(video);

        var database = new VideoDatabase();
        database.store(video);

        var emailService = new EmailService();
        emailService.sendEmail(video.getUser());
    }
}

