package basics

import kotlin.test.assertEquals
import kotlin.test.assertTrue

sealed class Tree {
    override fun toString(): String = when (this) {
        is Leaf -> value
        is Node -> "$left, $right"
    }

    override fun equals(other: Any?): Boolean = when {
        this is Leaf && other is Leaf -> value == other.value
        this is Node && other is Node -> left == other.left && right == other.right
        else -> false
    }
}

class Leaf(val value: String) : Tree()
class Node(val left: Tree, val right: Tree) : Tree()

fun Tree.count(): Int = when (this) { // Count Leafs
    is Leaf -> 1
    is Node -> left.count() + right.count()
}

fun Tree.height() : Int = when (this) { // Depth of Nodes
    is Leaf -> 0
    is Node -> 1 + maxOf(left.height(), right.height())
}

operator fun Tree.contains(element: String): Boolean = when (this) {
    is Leaf -> value == element
    is Node -> element in left || element in right
}

operator fun Tree.plus(another: Tree): Tree = Node(this, another)

fun main() {
    val tree = Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC"))
    assertEquals(3, tree.count())
    assertEquals(2, tree.height())

    assertTrue("AAA" in tree)
    assertTrue("CCC" in tree)
    assertTrue("ZZZ" !in tree)

    val doubled = tree + tree
    assertEquals(6, doubled.count())
    assertEquals(3, doubled.height())

    val withDDD = tree + Leaf("DDD")
    assertEquals(4, withDDD.count())
    assertEquals(3, withDDD.height())
    assertTrue("AAA" in withDDD)
    assertTrue("DDD" in withDDD)

    assertEquals(doubled, Node(Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")), Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC"))))
    assertEquals(withDDD, Node(Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")), Leaf("DDD")))
}