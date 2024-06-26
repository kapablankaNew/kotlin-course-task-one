package org.kapablankanew.kotlin.course.tasks.one.interfaces

interface CalculableNode<T> : AbstractNode<T> {
    fun calculate(value: T): Number
}