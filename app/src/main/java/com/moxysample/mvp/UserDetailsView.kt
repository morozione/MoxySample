package com.moxysample.mvp

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.moxysample.entity.User

interface UserDetailsView : MvpView {
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun setUser(user: User)
}