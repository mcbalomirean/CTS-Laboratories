package ro.ase.csie.cts.g1092.dp.chain;

public class TestChain {
    public static void main(String[] args) {
        ChatHandler privateNode = new PrivateMessageHandler();
        ChatHandler broadcastNode = new BroadcastMessageHandler();
        ChatHandler filterNode = new EnglishFilter(7);

        filterNode.setNext(privateNode);
        privateNode.setNext(broadcastNode);

        ChatHandler chatServer = filterNode;

        chatServer.processMessage(new ChatMessage("@everyone", "Hello!", 0));
        chatServer.processMessage(new ChatMessage("@everyone", "Hit Superman! It's a bot.", 0));
        chatServer.processMessage(new ChatMessage("@john", "Hello! Let's join the party.", 0));
    }
}
