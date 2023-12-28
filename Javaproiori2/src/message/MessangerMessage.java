package message;

import java.time.LocalDate;

public class MessangerMessage extends Message {
  private Status status;
  private LocalDate date;
    public LocalDate getDate() {
        return date;

    }

    public MessangerMessage(String text, String recipiend,
                            String sender, Status status, LocalDate date) {
        super(text, recipiend, sender);
        this.status = status;
        this.date=date;
    }


    public Status getStatus() {
        return status;
    }
}
