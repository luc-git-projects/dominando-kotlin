package secao11

data class Tree (val color: String, val height : Double) : Cloneable {

    override fun clone(): Any {
        return Tree(color, height)
    }
}