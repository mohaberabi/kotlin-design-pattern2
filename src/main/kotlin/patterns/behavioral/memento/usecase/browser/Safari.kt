package patterns.behavioral.memento.usecase.browser

import patterns.behavioral.memento.domain.WebBrowser
import patterns.behavioral.memento.domain.model.DoubleLinkedNode
import patterns.behavioral.memento.domain.model.DoublyLinkedList
import patterns.behavioral.memento.domain.model.WebPage

class Safari : WebBrowser {

    private val list = DoublyLinkedList<WebPage>()
    private var lastAction: DoubleLinkedNode<WebPage>? = null

    private val referencesMap = mutableMapOf<WebPage, DoubleLinkedNode<WebPage>>()
    override fun loadPage(page: WebPage) {
        val added = list.addTail(page)
        lastAction = added
        referencesMap[page] = added
    }

    override fun goPreviousPage() {
        if (lastAction?.prev == null) {
            println("Nothing to laod")
        } else {
            lastAction = lastAction?.prev
        }
    }

    override fun goNextPage() {
        if (lastAction?.next == null) {
            println("nothing to load")
        } else {
            lastAction = lastAction?.next
        }

    }

    override fun closePage(page: WebPage) {

        val key = referencesMap[page]
        list.remove(key)
        lastAction = list.head
    }

    override fun currentPage(): WebPage? = lastAction?.data
    override fun previewCurrentPage() {
        println(currentPage()?.url)
    }
}

private fun main() {

    val safari = Safari()
    with(safari) {
        val google = WebPage("google.com")
        val facebook = WebPage("facebook.com")

        loadPage(google)
        previewCurrentPage()
        //
        goNextPage()
        //
        loadPage(facebook)
        previewCurrentPage()
        //
        goPreviousPage()
        previewCurrentPage()
        //
        goNextPage()
        previewCurrentPage()
        closePage(facebook)
        previewCurrentPage()
        goNextPage()
        
    }
}