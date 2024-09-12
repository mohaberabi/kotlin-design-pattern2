package patterns.behavioral.visitor.previous_features

import patterns.behavioral.visitor.new_feature.WorkHoursManagerVisitor

class RemoteShiftHoursManager : WorkHoursManager {
    override fun generateReport() = println("Generate Report For RemoteShiftHoursManager ")
    override fun calculateOverTime() = println("Calc OverTime For RemoteShiftHoursManager ")
    override fun accept(managerVisitor: WorkHoursManagerVisitor) = managerVisitor.visit(this)
}
