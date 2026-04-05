import java.util.List;

public class KanbanBoard
{
    private List<Column> columns;

    public KanbanBoard()
    {
    }

    public List<Column> getColumns()
    {
        return this.columns;
    }

    public void setColumns(List<Column> columns)
    {
        this.columns = columns;
    }

    public void addColumn(Column column)
    {
        this.columns.add(column);
    }
}
