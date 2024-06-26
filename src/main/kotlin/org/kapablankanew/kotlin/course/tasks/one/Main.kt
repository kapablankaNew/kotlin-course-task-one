package org.kapablankanew.kotlin.course.tasks.one

import org.kapablankanew.kotlin.course.tasks.one.impl.Leaf
import org.kapablankanew.kotlin.course.tasks.one.impl.MutableNode
import org.kapablankanew.kotlin.course.tasks.one.impl.Tree
import org.kapablankanew.kotlin.course.tasks.one.interfaces.CalculableNode
import org.kapablankanew.kotlin.course.tasks.one.interfaces.ValidatableNode

fun main(args: Array<String>) {
    val tree = Tree<Int>()
    val nodeOne = MutableNode<Int>()
    tree.head = nodeOne
    val nodeTwo = TestNodeOne<Int>()
    val nodeThree = TestNodeOne<Int>()
    val nodeFour = TestNodeTwo<Int>()
    val leaf = Leaf(1)
    val leafTwo = Leaf(2)
    nodeOne.addChild("a", nodeTwo)
    nodeTwo.addChild("b", nodeThree)
    nodeTwo.addChild("d1", leafTwo)
    nodeThree.addChild("c", nodeFour)
    // nodeFour.addChild("d", nodeThree) - получим ошибку о несоответствии типов
    nodeFour.addChild("d", leaf)

    println(tree.convertSubTreeToMap())
}

open class TestNodeOne<T> : ValidatableNode<T>, MutableNode<T>() {
    override fun isValid(): Boolean {
        println("Validation!")
        return true
    }
}

class TestNodeTwo<T> : CalculableNode<T>, TestNodeOne<T>() {
    override fun calculate(value: T): Number {
        return value.hashCode()
    }
}