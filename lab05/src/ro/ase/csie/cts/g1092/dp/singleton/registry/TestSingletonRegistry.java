package ro.ase.csie.cts.g1092.dp.singleton.registry;

public class TestSingletonRegistry {
    public static void main(String[] args) {
        DbConnection dbConnection1 = DbConnection.getInstance("127.0.0.1:8000", "localDb");
        DbConnection dbConnection2 = DbConnection.getInstance("127.0.0.1:8000", "localDb");
        DbConnection dbConnection3 = DbConnection.getInstance("127.0.0.2:8000", "localDb");

        if (dbConnection1 == dbConnection2) {
            System.out.println("All good.");
        }

        if (dbConnection1 != dbConnection3) {
            System.out.println("All good, again.");
        }
    }
}
