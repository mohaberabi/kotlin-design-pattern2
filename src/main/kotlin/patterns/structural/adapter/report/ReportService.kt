package patterns.structural.adapter.report

class ReportService {


    fun getReport(): CsvReport = CsvReport("Your Report in CSV")

}