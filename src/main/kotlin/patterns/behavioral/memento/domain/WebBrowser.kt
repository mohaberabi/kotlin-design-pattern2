package patterns.behavioral.memento.domain

import patterns.behavioral.memento.domain.model.WebPage

interface WebBrowser {


    fun loadPage(page: WebPage)
    fun goPreviousPage()
    fun goNextPage()
    fun closePage(page: WebPage)
    fun currentPage(): WebPage?

    fun previewCurrentPage()
}