package patterns.behavioral.template.data

import patterns.behavioral.template.domain.AnalyzedData
import patterns.behavioral.template.domain.CvReportGenerator
import patterns.behavioral.template.domain.ExtractedData
import patterns.behavioral.template.domain.GeneratedReport
import java.io.File

class PdfCvReportGenerator : CvReportGenerator() {

    override fun extractData(file: File): ExtractedData {
        println("Extracting Data  as PDF From ${file.path}")
        return ExtractedData("extracted")
    }


}