package patterns.behavioral.visitor.new_feature


interface WorkHoursManagerAcceptor {

    fun accept(managerVisitor: WorkHoursManagerVisitor)
}