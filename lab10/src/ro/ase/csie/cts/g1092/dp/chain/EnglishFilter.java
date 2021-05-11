package ro.ase.csie.cts.g1092.dp.chain;

import java.util.Locale;

public class EnglishFilter extends ChatHandler {
    public static String[] forbiddenWords = new String[]{"violent", "hit", "kill"};
    public int ageLimit;

    public EnglishFilter(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public void processMessage(ChatMessage message) {
        boolean isSafe = true;

        for (String word : forbiddenWords) {
            if (message.getText().toLowerCase(Locale.ROOT).contains(word)) {
                isSafe = false;
                break;
            };
        }

        if (isSafe) {
            if(this.next != null) {
                this.next.processMessage(message);
            }
        }
    }
}
