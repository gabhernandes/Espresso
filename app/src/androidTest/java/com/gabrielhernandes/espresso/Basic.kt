package com.gabrielhernandes.espresso

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)

class Basic {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    @Test
    fun login() {
        onView(withText("Hello first fragment Gabriel")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextPersonName)).perform(clearText())
        onView(withId(R.id.editTextPersonName)).perform(typeText("g@bol.com"))
        closeSoftKeyboard()
        onView(withId(R.id.editTextPassword)).perform(typeText("1234"))
        closeSoftKeyboard()
        onView(withId(R.id.button_first)).perform(click())
        onView(withText("Sucesso")).check((matches(isDisplayed())))
        onView(withText("Voltar")).perform(click())
        onView(withText("Hello first fragment Gabriel")).check(matches(isDisplayed()))
    }

    @Test
    fun fail() {
        onView(withText("Hello")).check(matches(isDisplayed()))
    }
}