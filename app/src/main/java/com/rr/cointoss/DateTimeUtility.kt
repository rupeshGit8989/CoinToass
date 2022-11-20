package com.rr.cointoss

import java.text.SimpleDateFormat
import java.util.*

object DateTimeUtility {
    // Display current time in 12 hour format with AM/PM. Like this 02:32:45 PM.
    @JvmStatic
    val time: String
        get() {
            val cal = Calendar.getInstance(TimeZone.getDefault())
            val sdf = SimpleDateFormat("hh:mm:ss a", Locale.getDefault())
            return sdf.format(cal.time)
        }

    // Get Date Day/Mounth/Year. Like this 4/2/2018.
    @JvmStatic
    val date: String
        get() {
            val cal = Calendar.getInstance(TimeZone.getDefault())
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            return sdf.format(cal.time)
        }
}