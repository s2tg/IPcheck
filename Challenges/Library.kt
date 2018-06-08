package Challenges

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(val title :String,
                             val genre: String,
                             var publicationsYear: Int,
                             var borrowed: Boolean): Lendable {

    override fun borrow() {
        if (!borrowed) {
            borrowed = true
        }
        else {
            println("This item is already borrowed")
        }
    }

    override fun toString(): String {
        return "InventoryItem(title=$title, genre=$genre, publicationsYear=$publicationsYear, borrowed=$borrowed)"
    }

    abstract fun copy(): InventoryItem
}

class LibraryBook(title: String,
                  val author: String,
                  genre: String,
                  publicationsYear: Int): InventoryItem(title, genre, publicationsYear, true) {

    fun read() {
        println("Reading a book by $author")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryBook(title,author,genre,publicationsYear)
        copy.borrowed = this.borrowed

        return copy
    }
}

class LibraryDVD(title: String,
                 genre: String,
                 val length: Int,
                 publicationsYear: Int): InventoryItem(title,genre, publicationsYear, borrowed = true){

    fun watch() {
        println("Watching $title")
    }

    override fun copy(): InventoryItem {
        val copy = LibraryDVD(title,genre,length,publicationsYear)
        copy.borrowed = this.borrowed

        return copy
    }

}