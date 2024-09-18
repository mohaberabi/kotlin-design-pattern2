package patterns.structural.adapter.report

class DefaultReportServiceAdapter(
    private val reportService: ReportService
) : ReportServiceAdappter {


    override fun getReportDataInJson(): JsonReport {
        val csv = reportService.getReport()
        val json = convertCsvIntoJson(csv)
        return JsonReport(json.data)
    }


    private fun convertCsvIntoJson(csv: CsvReport) = JsonReport(csv.data)
}