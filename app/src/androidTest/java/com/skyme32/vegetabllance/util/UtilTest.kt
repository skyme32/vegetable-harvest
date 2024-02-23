package com.skyme32.vegetabllance.util

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class UtilTest {

    @Test
    fun parseMonthsTest() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("Jan", parseMonths(1, context))
        assertEquals("Feb", parseMonths(2, context))
        assertEquals("Mar", parseMonths(3, context))
        assertEquals("Apr", parseMonths(4, context))
        assertEquals("May", parseMonths(5, context))
        assertEquals("Jun", parseMonths(6, context))
        assertEquals("Jul", parseMonths(7, context))
        assertEquals("Aug", parseMonths(8, context))
        assertEquals("Sep", parseMonths(9, context))
        assertEquals("Oct", parseMonths(10, context))
        assertEquals("Nov", parseMonths(11, context))
        assertEquals("Dec", parseMonths(12, context))
        assertEquals("N/A", parseMonths(13, context))
    }
}