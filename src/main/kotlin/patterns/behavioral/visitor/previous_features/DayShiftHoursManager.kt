package patterns.behavioral.visitor.previous_features

import patterns.behavioral.visitor.new_feature.WorkHoursManagerVisitor

class DayShiftHoursManager : WorkHoursManager {
    override fun generateReport() = println("Generate Report For DayShift")

    override fun calculateOverTime() = println("Calc DayShift Hours")

    override fun accept(managerVisitor: WorkHoursManagerVisitor) = managerVisitor.visit(this)
}