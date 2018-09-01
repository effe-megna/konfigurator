package models.entities

import models.abstractions.*
import models.properties.AutoSelectProperty
import models.properties.RequiredProperty
import modelss.properties.abstractions.Property

data class NumericEntity(
        override val name: String,
        override val description: String?,
        override val properties: List<Property>,
        override val columns: List<Column>,
        override val rows: List<Row>
) : AbstractEntity() {
    override val type: Entity.EntityType = Entity.EntityType.Numeric

    companion object {
        fun newInstance(name: String): NumericEntity {
            return NumericEntity(
                    name,
                    null,
                    listOf(AutoSelectProperty.newInstance(), RequiredProperty.newInstance()),
                    listOf(),
                    listOf()
            )
        }
    }

    override fun toString(): String {
        return "NumericEntity(name='$name', description=$description, properties=$properties, columns=$columns, rows=$rows, type=$type)"
    }
}