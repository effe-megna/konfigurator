package modelss.rows.abstractions

import modelss.cells.abstractions.ICell

interface IRow {
    val index: Int
    val cells: List<ICell>
}

