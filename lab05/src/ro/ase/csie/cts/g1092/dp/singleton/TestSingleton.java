package ro.ase.csie.cts.g1092.dp.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        System.out.println("The application started.");

        DbConnection dbConnection1 = DbConnection.getInstance();
        DbConnection dbConnection2 = DbConnection.getInstance();

        if (dbConnection1 == dbConnection2) {
            System.out.println("The two variables reference the same object.");
        }
    }
}
