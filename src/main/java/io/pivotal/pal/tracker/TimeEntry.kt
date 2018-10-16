package io.pivotal.pal.tracker

import java.time.LocalDate

data class TimeEntry(var id: Long, val projectId: Long, val userId: Long, val date: LocalDate?, val hours: Int) {

    constructor(projectId: Long, userId: Long, date: LocalDate, hours: Int) : this(0, projectId, userId, date, hours)
    constructor() : this(0, 0, 0 ,null, 0)

}
