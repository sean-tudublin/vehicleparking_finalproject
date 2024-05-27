package MainPackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

public class Duration {

    public static void durationCountdown() {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Duration.class.getName()).log(Level.SEVERE, null, ex);
        }
        int[] idduration = new int[2];
        PreparedStatement pst = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/vehicleparkingDB","sean","1234");
            Statement statement = connection.createStatement();  

            String sqlQuery = "SELECT idvehicles, duration FROM vehicles";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while(resultSet.next()) {
                idduration[0]= resultSet.getInt("idvehicles");
                idduration[1] = resultSet.getInt("duration");
                pst = connection.prepareStatement("UPDATE vehicles SET duration = ? WHERE idvehicles = ?");
                pst.setInt(1, idduration[1] - 1);
                pst.setInt(2, idduration[0]);
                pst.executeUpdate();
            }

        }
        catch (SQLException ex)
        {
            Logger.getLogger(Duration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  

