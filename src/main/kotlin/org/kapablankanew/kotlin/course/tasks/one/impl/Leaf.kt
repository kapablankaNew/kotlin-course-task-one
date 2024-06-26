package org.kapablankanew.kotlin.course.tasks.one.impl

import org.kapablankanew.kotlin.course.tasks.one.interfaces.AbstractNode

class Leaf<T>(private val value: T) : AbstractNode<T> {
    override fun convertSubTreeToMap(): Map<MutableList<String>, T> {
        return mutableMapOf(mutableListOf<String>() to value)
    }
}