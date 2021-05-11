package ro.ase.csie.cts.g1092.dp.chain;

import java.util.Locale;

public class PrivateMessageHandler extends ChatHandler {

    @Override
    public void processMessage(ChatMessage message) {
        if (message.getDestination().toLowerCase(Locale.ROOT).equals("@everyone")) {
            if (this.next != null) {
                this.next.processMessage(message);
            }
        } else {
            System.out.println("Private message for " + message.getDestination() + ": " + message.getText());
        }
    }
}
