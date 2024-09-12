package patterns.behavioral.template.data

import patterns.behavioral.template.domain.AnalyzedData
import patterns.behavioral.template.domain.CvReportGenerator
import patterns.behavioral.template.domain.ExtractedData
import patterns.behavioral.template.domain.GeneratedReport
import java.io.File


class WordCvReportGenerator : CvReportGenerator() {


    override fun extractData(file: File): ExtractedData {
        println("Extracting Data  as Word From ${file.path}")
        return ExtractedData("extracted")
    }


}