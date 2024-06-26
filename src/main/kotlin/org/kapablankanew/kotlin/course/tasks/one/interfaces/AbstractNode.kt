package org.kapablankanew.kotlin.course.tasks.one.interfaces

interface AbstractNode<T> {
    fun convertSubTreeToMap(): Map<MutableList<String>, T>
}