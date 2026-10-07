package blood_bank_and_blood_donation_management_system;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
public class DatabaseHelper {

    // 1. Execute INSERT, UPDATE, DELETE
    public static boolean executeUpdate(String sql, Object... params) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    // 2. Load data into a JTable
    public static void loadTableData(String sql, JTable table, String[] columnNames) {
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make table read-only
            }
        };
        
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnNames.length; i++) {
                    row.add(rs.getObject(i));
                }
                model.addRow(row);
            }
            table.setModel(model);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // 3. Fill a JComboBox with data (e.g., Blood Groups, Banks)
    public static void loadComboBox(String sql, JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                comboBox.addItem(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4. Get an ID based on a name (e.g., Get blood_group_id for "A+")
    public static int getIdByName(String tableName, String idColumn, String nameColumn, String nameValue) {
        int id = 0;
        String sql = "SELECT " + idColumn + " FROM " + tableName + " WHERE " + nameColumn + " = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nameValue);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(idColumn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
}