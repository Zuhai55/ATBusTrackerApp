package bustracker;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
//Table model for JTable needed to store ETA
public class EtaTableModel extends AbstractTableModel {
	private List<Bus> data = new ArrayList<>();
    private List<String> etaMessages = new ArrayList<>();
    private final String[] columnNames = {"Bus Number", "ETA Message"};    

    public void addEtaMessage(String msg) {
        etaMessages.add(msg);
        int messageSize = etaMessages.size() - 1;
    	fireTableRowsInserted(messageSize, messageSize);
    }
    
    public void addBus(Bus bus) {
    	data.add(bus);
        int busSize = data.size() - 1;
    	fireTableRowsInserted(busSize, busSize);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getBusNumber();
        } else {
            return etaMessages.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    public Bus getBusAt(int row) {
        return data.get(row);
    }
}
