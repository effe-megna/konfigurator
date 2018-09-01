package modelss.entities.abstractions

import modelss.rows.abstractions.IEntityRow

interface IBooleanEntity : IEntity {
    val row: IEntityRow
}