package ro.ase.csie.cts.g1092.dp.chain;

public class ChatMessage {
    private String destination;
    private String text;
    private int priority;

    public ChatMessage(String destination, String text, int priority) {
        this.destination = destination;
        this.text = text;
        this.priority = priority;
    }

    public String getDestination() {
        return destination;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }
}
