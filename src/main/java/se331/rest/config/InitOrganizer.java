package se331.rest.config;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.context.event.ApplicationReadyEvent;
        import org.springframework.context.ApplicationListener;
        import org.springframework.stereotype.Component;
        import se331.rest.entity.Organizer;
        import se331.rest.repository.OrganizerRepository;

@Component
public class InitOrganizer implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    OrganizerRepository organizerRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        organizerRepository.save(Organizer.builder()
                .organizerName("A")
                .address("Chiang Mai")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("B")
                .address("Chiang Mai")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("C")
                .address("Chiang Mai")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("D")
                .address("Chiang Mai")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("E")
                .address("Chiang Mai")
                .build());
        organizerRepository.save(Organizer.builder()
                .organizerName("F")
                .address("Chiang Mai")
                .build());

    }
}
