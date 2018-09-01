package modelss.entities.abstractions

import modelss.rows.abstractions.IEntityRow

interface INumericEntity : IEntity {
    val row: IEntityRow
}