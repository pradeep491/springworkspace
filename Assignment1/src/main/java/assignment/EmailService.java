package assignment;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class EmailService {
    private DataSource dsource;

    public EmailService(DataSource dsource) {
        this.dsource = dsource;
    }

    void sendEmail(){
        String emails[] = dsource.getEmails();
        Arrays.stream(emails).forEach(s-> System.out.println(s));
    }
}
