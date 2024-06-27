package org.kapablankanew.kotlin.course.tasks.one.impl

import org.kapablankanew.kotlin.course.tasks.one.AbstractNode

class Leaf<T>(private val value: T) : AbstractNode<T> {
    override fun getPathsToLeafs(): Map<List<String>, T> {
        return mutableMapOf(listOf<String>() to value)
    }
}