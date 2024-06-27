package org.kapablankanew.kotlin.course.tasks.one.impl

import org.kapablankanew.kotlin.course.tasks.one.AbstractNode

class Tree<T> : AbstractNode<T> {
    var head: AbstractNode<T>? = null

    override fun getPathsToLeafs(): Map<List<String>, T> = head?.getPathsToLeafs() ?: emptyMap()
}