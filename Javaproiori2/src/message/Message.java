package message;

public class Message {

    private String text;

    private String recipiend;

    private String sender;

    public Message(String text, String recipiend, String sender) {
        this.text = text;
        this.recipiend = recipiend;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public String getRecipiend() {
        return recipiend;
    }

    public String getSender() {
        return sender;
    }
}

