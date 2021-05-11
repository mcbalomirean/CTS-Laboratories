package ro.ase.csie.cts.g1092.dp.chain;

import java.util.Locale;

public class BroadcastMessageHandler extends ChatHandler {

    @Override
    public void processMessage(ChatMessage message) {
        if (message.getDestination().toLowerCase(Locale.ROOT).equals("@everyone")) {
            System.out.println("@everyone: " + message.getText());
        }

        if (this.next != null) {
            this.next.processMessage(message);
        }
    }
}
