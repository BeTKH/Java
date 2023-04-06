package MoshOOP.LooseCoupling.DecouplingVideoProcessorExample;

public class VideoProcessorMain {

    public static void main(String[] args) {



        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));



        // create an instance of encoder from the interface
        XVideoEncoder xEncoder = new XVideoEncoder();

        // pass the encoder via constructor injection
        var processor = new VideoProcessor(xEncoder);
        processor.process(video);
    }
}
