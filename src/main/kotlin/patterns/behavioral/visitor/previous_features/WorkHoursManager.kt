package patterns.behavioral.visitor.previous_features

import patterns.behavioral.visitor.new_feature.WorkHoursManagerAcceptor

interface WorkHoursManager : WorkHoursManagerAcceptor {


    fun generateReport()
    fun calculateOverTime()
}

