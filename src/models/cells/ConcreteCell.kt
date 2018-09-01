package models.cells

import models.abstractions.AbstractCell

data class ConcreteCell (
        override val columnName: String,
        override val value: Any
) : AbstractCell() {
    override fun toString(): String {
        return super.toString()
    }
}