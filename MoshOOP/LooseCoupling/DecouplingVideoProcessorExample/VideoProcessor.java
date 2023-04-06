package MoshOOP.LooseCoupling.DecouplingVideoProcessorExample;

public class VideoProcessor {


    private VideoEncoder encoder;
    private VideoDatabase database;
    private EmailService emailService;



    // constructor injection-#1
    public VideoProcessor(VideoEncoder encoder_,
                          VideoDatabase database_,
                          EmailService emailService_) {
        this.encoder = encoder_;
        this.database = database_;
        this.emailService= emailService_;
    }



    public void process(Video video) {

        // decoupled video encoder
        encoder.encode(video);

        // decoupled database
        database.store(video);

        // decoupled the email service
        emailService.sendEmail(video.getUser());
    }
}

