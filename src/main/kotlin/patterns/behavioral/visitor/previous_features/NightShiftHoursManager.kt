package patterns.behavioral.visitor.previous_features

import patterns.behavioral.visitor.new_feature.WorkHoursManagerVisitor

class NightShiftHoursManager : WorkHoursManager {
    override fun generateReport() = println("Generate Report For NightShift ")
    override fun calculateOverTime() = println("Calc OverTime For NightShift ")
    override fun accept(managerVisitor: WorkHoursManagerVisitor) = managerVisitor.visit(this)

}