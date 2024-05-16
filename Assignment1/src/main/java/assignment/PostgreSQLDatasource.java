package assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pds")
@Primary
public class PostgreSQLDatasource implements DataSource {
    @Override
    public String[] getEmails() {
        String emails[] = {"test3@gmail.com", "test4@gmail.com", "test5@gmail.com"};
        return emails;
    }
}
