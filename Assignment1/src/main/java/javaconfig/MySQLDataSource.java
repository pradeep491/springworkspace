package javaconfig;

public class MySQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {
        String emails[] = {"test@gmail.com", "test1@gmail.com", "test2@gmail.com"};
        return emails;
    }
}
