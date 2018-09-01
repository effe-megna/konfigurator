package modelss.entities.abstractions

import modelss.rows.abstractions.IEntityRow

interface IListEntity : IEntity {
    val rows: List<IEntityRow>
}