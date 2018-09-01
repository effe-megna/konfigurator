package models.entities

import models.abstractions.*
import models.properties.AutoSelectProperty
import models.properties.RequiredProperty
import modelss.properties.abstractions.Property

data class StringEntity(
        override val name: String,
        override val description: String?,
        override val properties: List<Property>,
        override val columns: List<Column>,
        override val rows: List<Row>
) : AbstractEntity() {
    override val type: Entity.EntityType = Entity.EntityType.String

    companion object {
        fun newInstance(name: String): StringEntity {
            return StringEntity(
                    name,
                    null,
                    listOf(AutoSelectProperty.newInstance(), RequiredProperty.newInstance()),
                    listOf(),
                    listOf()
            )
        }
    }

    override fun toString(): String {
        return "IStringEntity(name='$name', description=$description, properties=$properties, columns=$columns, rows=$rows, type=$type)"
    }
}
