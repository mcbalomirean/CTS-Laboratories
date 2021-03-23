package ro.ase.csie.cts.g1092.dp.singleton.enumeration;

public class TestEnumSingleton {
    public static void main(String[] args) {
        DbConnection connection1 = DbConnection.getInstance();
        DbConnection connection2 = DbConnection.getInstance();

        if (connection1 == connection2) {
            System.out.println("All good here.");
        }
    }
}
