package com.gabrielhernandes.espresso.login

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gabrielhernandes.espresso.MainActivity
import com.gabrielhernandes.espresso.login.robot.LoginRobot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()
    private val robot = LoginRobot()

    @Test
    fun testPageObjects() {
        robot.run {
            checkTitle()
            clearText()
            typeEmail()
            closeKeyboard()
            typePassword()
            closeKeyboard()
            onLoginButtonClicked()
            checkTitleSuccess()
            onBackButtonClicked()
            checkTitle()
        }
    }

}