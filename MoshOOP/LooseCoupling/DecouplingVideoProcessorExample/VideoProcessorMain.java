package MoshOOP.LooseCoupling.DecouplingVideoProcessorExample;

public class VideoProcessorMain {

    public static void main(String[] justNameOfVariable) {



        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));



        // create instance of encoder,database & email service  from respective interfaces
        XVideoEncoder xEncoder = new XVideoEncoder();
        xVideoDatabase xDatabase = new xVideoDatabase();
        xEmailService xEmail = new xEmailService();

        // inject the objects via constructors - constructor injection
        var processor = new VideoProcessor(xEncoder, xDatabase, xEmail);
        processor.process(video);
    }
}
