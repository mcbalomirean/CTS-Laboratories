package ro.ase.csie.cts.g1092.dp.singleton.enumeration;

// implement the singleton as an enum
public enum DbConnection {
    INSTANCE("127.0.0.1:1000", "enumDb");

    String socket, schema;
    DbConnection(String socket, String schema) {
        this.socket = socket;
        this.schema = schema;
    }

    public static DbConnection getInstance() {
        return INSTANCE;
    }
}
