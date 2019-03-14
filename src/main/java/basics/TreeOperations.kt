package basics

class TreeOperationsTest {
    /*
            root Node
            /      \
          Node     CCC
         /    \
       AAA    BBB
     */
    val tree1 = Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC"))

    /*
                    root Node
                   /         \
               Node           Node
            /      \        /      \
          Node     CCC    Node     CCC
         /    \          /    \
       AAA    BBB      AAA    BBB
     */
    val tree2 =
        Node(Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")), Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")))

    /*
                root Node
                /     \
              Node    DDD
            /      \
          Node     CCC
         /    \
       AAA    BBB
     */
    val tree3 = Node(Node(Node(Leaf("AAA"), Leaf("BBB")), Leaf("CCC")), Leaf("DDD"))

//    @Nested
//    inner class CountTests {
//        @Test
//        fun `Count of a leaf is 1`() {
//            assertEquals(1, Leaf("AAA").count())
//        }
//
//        @Test
//        fun `Count of a single node with two leafs is 2`() {
//            assertEquals(2, Node(Leaf("AAA"), Leaf("BBB")).count())
//        }
//
//        @Test
//        fun `Count returns number of leafs in the tree`() {
//            assertEquals(3, tree1.count())
//            assertEquals(6, tree2.count())
//            assertEquals(4, tree3.count())
//        }
//    }
//
//    @Nested
//    inner class SizeTests {
//        @Test
//        fun `Count of a leaf is 1`() {
//            assertEquals(1, Leaf("AAA").height())
//        }
//
//        @Test
//        fun `Count of a single node with two leafs is 2`() {
//            assertEquals(2, Node(Leaf("AAA"), Leaf("BBB")).height())
//        }
//
//        @Test
//        // Every level in height is one more to the result
//        fun `Height returns the highest dustance from the root to a leaf`() {
//            assertEquals(3, tree1.height())
//            assertEquals(4, tree2.height())
//            assertEquals(4, tree3.height())
//        }
//    }
//
//    @Nested
//    inner class ContainsTests {
//        @Test
//        fun `Value of a leaf is in this leaf`() {
//            assertTrue(Leaf("AAA").contains("AAA"))
//        }
//
//        @Test
//        fun `Node with leafs contains values of its leafs`() {
//            val tree = Node(Leaf("AAA"), Leaf("BBB"))
//            assertTrue(tree.contains("AAA"))
//            assertTrue(tree.contains("BBB"))
//            assertTrue(!tree.contains("CCC"))
//            assertTrue(!tree.contains("DDD"))
//        }
//
//        @Test
//        fun `Complex cases`() {
//            assertTrue(tree1.contains("AAA"))
//            assertTrue(tree1.contains("BBB"))
//            assertTrue(tree1.contains("CCC"))
//            assertTrue(!tree1.contains("CCCC"))
//            assertTrue(!tree1.contains("D"))
//
//            assertTrue(tree2.contains("AAA"))
//            assertTrue(tree2.contains("BBB"))
//            assertTrue(tree2.contains("CCC"))
//            assertTrue(!tree2.contains("CCCC"))
//            assertTrue(!tree2.contains("D"))
//
//
//            assertTrue(tree3.contains("AAA"))
//            assertTrue(tree3.contains("BBB"))
//            assertTrue(tree3.contains("CCC"))
//            assertTrue(tree3.contains("DDD"))
//            assertTrue(!tree3.contains("CCCC"))
//            assertTrue(!tree3.contains("D"))
//        }
//    }
//
//    @Nested
//    inner class PlusTests {
//        @Test
//        fun `Plus of two leafs test`() {
//            val tree = Leaf("AAA").plus(Leaf("BBB"))
//            assertTrue(tree is Node)
//            val n = tree as Node
//            assertTrue(n.left == Leaf("AAA"))
//            assertTrue(n.right == Leaf("BBB"))
//        }
//
//        @Test
//        fun `Plus just places subtrees on the left and right side without copying them`() {
//            val tree = tree1.plus(tree2)
//            assertTrue(tree is Node)
//            val n = tree as Node
//            assertTrue(n.left === tree1)
//            assertTrue(n.right === tree2)        }
//    }
}