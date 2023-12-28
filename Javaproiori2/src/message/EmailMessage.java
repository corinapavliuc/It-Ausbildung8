package message;

import java.time.LocalDate;

public class EmailMessage  extends MessangerMessage{
    private  final String subject;
    private  final String copy;
    private final String hiddenCopy;

    public EmailMessage(String text, String recipiend, String sender,
                        Status status, LocalDate date,
                        String subject, String copy, String hiddenCopy) {
        super(text, recipiend, sender, status, date);
        this.subject = subject;
        this.copy = copy;
        this.hiddenCopy = hiddenCopy;
    }

    public String getSubject() {
        return subject;
    }

    public String getCopy() {
        return copy;
    }

    public String getHiddenCopy() {
        return hiddenCopy;
    }
}
