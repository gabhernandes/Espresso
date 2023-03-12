package com.gabrielhernandes.espresso.login.robot

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.gabrielhernandes.espresso.R
import com.gabrielhernandes.espresso.login.constants.LoginConstants.BACK
import com.gabrielhernandes.espresso.login.constants.LoginConstants.EMAIL
import com.gabrielhernandes.espresso.login.constants.LoginConstants.PASSWORD
import com.gabrielhernandes.espresso.login.constants.LoginConstants.SUCCESS
import com.gabrielhernandes.espresso.login.constants.LoginConstants.TITLE

class LoginRobot {
    fun checkTitle() {
        onView(withText(TITLE))
            .check(matches(isDisplayed()))
    }

    fun clearText() {
        onView(withId(EMAIL_ID)).perform(ViewActions.clearText())
    }

    fun typeEmail() {
        onView(withId(EMAIL_ID)).perform(ViewActions.typeText(EMAIL))
    }

    fun closeKeyboard() {
        closeSoftKeyboard()
    }

    fun typePassword() {
        onView(withId(R.id.editTextPassword)).perform(ViewActions.typeText(PASSWORD))
    }

    fun onLoginButtonClicked() {
        onView(withId(R.id.button_first)).perform(ViewActions.click())
    }

    fun checkTitleSuccess() {
        onView(withText(SUCCESS)).check((matches(isDisplayed())))
    }

    fun onBackButtonClicked() {
        onView(withText(BACK)).perform(ViewActions.click())
    }

    private companion object {
        const val EMAIL_ID = R.id.editTextPersonName
    }
}