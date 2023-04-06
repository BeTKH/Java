package MoshOOP.LooseCoupling.DecouplingVideoProcessorExample;

public class VideoProcessorMain {

    public static void main(String[] args) {



        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));



        // create an instance of encoder from the interface XVideoEncoder
        XVideoEncoder xEncoder = new XVideoEncoder();

        // create a database instance from the interface xVideoDatabase
        xVideoDatabase xDatabase = new xVideoDatabase();

        // create an instance of the email service from the xEmailService interface
        xEmailService xEmail = new xEmailService();

        // pass the encoder & databse via constructor injection
        var processor = new VideoProcessor(xEncoder, xDatabase, xEmail);
        processor.process(video);
    }
}
