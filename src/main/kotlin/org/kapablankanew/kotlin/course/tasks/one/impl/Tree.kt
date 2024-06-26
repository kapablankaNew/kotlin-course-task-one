package org.kapablankanew.kotlin.course.tasks.one.impl

import org.kapablankanew.kotlin.course.tasks.one.interfaces.AbstractNode

class Tree<T> : AbstractNode<T> {
    var head: AbstractNode<T>? = null

    override fun convertSubTreeToMap(): Map<MutableList<String>, T> = head?.convertSubTreeToMap() ?: emptyMap()
}