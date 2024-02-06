package org.example;

import org.example.db.Database;
import org.flywaydb.core.Flyway;

public class Migration {
    public static void main(String[] args) {

        Database db = new Database();
        Flyway flyway = Flyway.configure()
                .dataSource(db.getDbUrl(),db.getUsername(), db.getPassword())
                .baselineOnMigrate(true)
                .load();

        flyway.migrate();
    }
}
