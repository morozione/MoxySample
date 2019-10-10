package com.moxysample

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.moxysample.entity.User
import com.moxysample.mvp.UserDetailsPresenter
import com.moxysample.mvp.UserDetailsView
import com.moxysample.ui.UserDescriptionFragment
import kotlinx.android.synthetic.main.activity_main.*

class UserDetailsActivity : MvpAppCompatActivity(), UserDetailsView {

    @InjectPresenter(type = PresenterType.WEAK)
    lateinit var userDetailsPresenter: UserDetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment()

        //Here we are getting some userId form bundles.
        val userId = 1231L

        userDetailsPresenter.loadUser(userId)
    }

    private fun showFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.mContainer, UserDescriptionFragment())
            .commit()
    }

    override fun setUser(user: User) {
        mName.text = user.name
    }
}
