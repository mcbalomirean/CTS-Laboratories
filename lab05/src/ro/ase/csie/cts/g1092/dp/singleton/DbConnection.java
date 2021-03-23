package ro.ase.csie.cts.g1092.dp.singleton;

public class DbConnection {
    private String socket, schema;

    // eager-loading approach
//    private static DbConnection instance = new DbConnection();
    private static DbConnection instance = null;

    // class static initializer
    // lazy-loading approach
    static {
        // executed only once when the class is loaded by the JVM
        System.out.println("Loading DbConnection string...");
    }

    // constructor initializer
    {
        // executed before each constructor call
        System.out.println("Initializing DbConnection string...");
    }

    private DbConnection() {
        System.out.println("Creating a DbConnection...");
        // access a local configuration file...
    }

    private DbConnection(String socket, String schema) {
        System.out.println("Creating a DbConnection...");
        this.socket = socket;
        this.schema = schema;
    }

    // returns reference to unique object
    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection("", "");
        }

        return instance;
    }

//     either the above or this but actually please don't do this
    public static DbConnection getInstance(String socket, String schema) throws Exception {
        if (instance == null) {
            instance = new DbConnection(socket, schema);
        }
//         throw an error if they try to open a connection to a different database
        if (!socket.equals(instance.socket) || !schema.equals(instance.schema)) {
            throw new Exception("You know what you've done.");
        }

        return instance;
    }
}
