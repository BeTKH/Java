package MoshOOP.LooseCoupling.DecouplingVideoProcessorExample;

public class xEmailService implements EmailService {

    @Override
    public void sendEmail(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}

