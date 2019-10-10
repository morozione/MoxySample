package com.moxysample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.moxysample.R
import com.moxysample.entity.User
import com.moxysample.mvp.UserDetailsPresenter
import com.moxysample.mvp.UserDetailsView
import kotlinx.android.synthetic.main.fragment_user_description.*

class UserDescriptionFragment : MvpAppCompatFragment(), UserDetailsView {

    @InjectPresenter(type = PresenterType.WEAK)
    lateinit var userDetailsPresenter: UserDetailsPresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_user_description, container, false)

    override fun setUser(user: User) {
        mDetails.text = user.details
    }
}
