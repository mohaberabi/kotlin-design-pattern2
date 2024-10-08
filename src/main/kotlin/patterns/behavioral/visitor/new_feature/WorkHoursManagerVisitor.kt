package patterns.behavioral.visitor.new_feature

import patterns.behavioral.visitor.previous_features.DayShiftHoursManager
import patterns.behavioral.visitor.previous_features.NightShiftHoursManager
import patterns.behavioral.visitor.previous_features.RemoteShiftHoursManager

interface WorkHoursManagerVisitor {


    fun visit(manager: DayShiftHoursManager)
    fun visit(manager: NightShiftHoursManager)
    fun visit(manager: RemoteShiftHoursManager)

}

class LeaveRequestHoursVisitor : WorkHoursManagerVisitor {
    override fun visit(manager: DayShiftHoursManager) {
        println("managing leaveRequest from DayShiftHoursManager")
    }

    override fun visit(manager: NightShiftHoursManager) {
        println("managing leaveRequest from NightShiftHoursManager")


    }

    override fun visit(manager: RemoteShiftHoursManager) {
        println("managing leaveRequest from RemoteShiftHoursManager")
    }

}

private fun main() {
    val managers = listOf(
        DayShiftHoursManager(),
        NightShiftHoursManager(),
        RemoteShiftHoursManager()
    )
    managers.forEach {
        it.accept(LeaveRequestHoursVisitor())
    }
}