package ro.ase.csie.cts.g1092.dp.singleton.registry;

import java.util.HashMap;

public class DbConnection {
    private String socket, schema;

    private static HashMap<String, DbConnection> instances = new HashMap<>();

    private DbConnection(String socket, String schema) {
        System.out.println("Creating a DbConnection...");
        this.socket = socket;
        this.schema = schema;
    }

    public static DbConnection getInstance(String socket, String schema) {
        DbConnection instance = instances.get(socket);

        if (instance == null) {
            instance = new DbConnection(socket, schema);
            instances.put(socket, instance);
        }

        return instance;
    }
}
