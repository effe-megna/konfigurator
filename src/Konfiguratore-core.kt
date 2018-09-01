
import models.entities.StringEntity
import models.cells.ConcreteCell
import models.columns.KeyColumn
import models.columns.NumericColumn
import models.columns.StringColumn
import models.properties.AutoSelectProperty
import models.properties.RequiredProperty
import models.rows.EntityRow

fun main(args: Array<String>) {
    val columns = listOf(
            KeyColumn("Key", "Chiave"),
            StringColumn("Descrizione", "Descrizione breve"),
            NumericColumn("Prezzo", "Prezzo minimo di partenza")
    )

    val cells = listOf(
            ConcreteCell("Key", "Electric"),
            ConcreteCell("Descrizione", "Elettriche"),
            ConcreteCell("Prezzo", 790)
    )

    val rows = listOf(
            EntityRow(1, columns, cells)
    )

    val entity = StringEntity(
            "entity1",
            null,
            listOf(AutoSelectProperty.newInstance(), RequiredProperty.newInstance()),
            columns,
            rows
    )
}