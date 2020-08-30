package zw.co.guava.studentkit.ui.main.modules.components

class AssignmentStudentKit (
        val title: String,
        val deadline: Long,
        val isGroup: Boolean,
        val submitted: Boolean,
        var dateSubmitted: Long? = null,
        val question: String,
        var attachments: List<String>? = null,
        val dateUploaded: Long,
)