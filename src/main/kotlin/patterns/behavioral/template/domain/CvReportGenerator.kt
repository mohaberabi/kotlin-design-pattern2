package patterns.behavioral.template.domain

import java.io.File

abstract class CvReportGenerator {


    protected fun generate(path: String): GeneratedReport {

        val file = readFile(path)
        val extracted = extractData(file)
        val analyzed = analyzeData(extracted)
        return GeneratedReport(analyzed)
    }


    protected fun readFile(path: String): File = File(path)

    protected fun analyzeData(data: ExtractedData): AnalyzedData = AnalyzedData(data)
    abstract fun extractData(file: File): ExtractedData

}