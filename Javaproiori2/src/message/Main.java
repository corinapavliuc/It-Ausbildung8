package message;

import java.time.LocalDate;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Hello", "1", "2");
        MessangerMessage messangerMessage = new MessangerMessage(
                "Hello",
                "+10897890",
                "+2678956",
                Status.NOT_SENT,
                LocalDate.now()
        );
        EmailMessage emailMessage = new EmailMessage(
                "Hello",
                "gh@gh.com",
                "fgk@gh.com",
                Status.NOT_SENT,
                LocalDate.now(),
                "Important",
                "dggh@fg.com",
                null
        );
    }
}
