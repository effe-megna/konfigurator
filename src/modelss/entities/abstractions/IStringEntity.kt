package modelss.entities.abstractions

import modelss.rows.abstractions.IEntityRow

interface IStringEntity : IEntity {
    val row: IEntityRow
}