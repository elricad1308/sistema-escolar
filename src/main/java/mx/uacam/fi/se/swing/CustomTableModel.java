package mx.uacam.fi.se.swing;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import mx.uacam.fi.se.data.PersonaEscuela;

public class CustomTableModel extends AbstractTableModel {

    private final List<PersonaEscuela> personas;
    private final String[] columnNames = {"Nombre", "Apellido", "Rol"};

    public CustomTableModel(List<PersonaEscuela> personas) {
        this.personas = personas;
    }

    @Override
    public int getRowCount() {
        return personas.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PersonaEscuela persona = personas.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return persona.getNombre();

            case 1:
                return persona.getApellido();

            case 2:
                return persona.getId();

            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
