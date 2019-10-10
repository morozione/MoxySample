package com.moxysample.mvp

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.moxysample.entity.User

/*
TODO: Please read it)
We are using one presenter for couple of fragments for get better performance.
In Activity we are loading some POJO once from network and them we`ll get the object after
inject this WEAK presenter to another view component.
- First example: You have activity with some tabs of fragment(just different information in each fragment
which gets form the POJO) which is using the same POJO object with activity
- Second sample: You are creating one object(Maybe rent Home. First fragment is some basic details.
Second fragment is photos...) And main creating home state need to be saved somewhere and you can
user WEAK presenter for this. All three fragment we`ll have access to the save presenter which contains
the save HOME which we`ll send to the network in the last fragment.
 */

@InjectViewState
class UserDetailsPresenter: MvpPresenter<UserDetailsView>() {
    fun loadUser(userId: Long) {

        //Here we are using some model where we`ll get user form network
        val user = User("Test", "Some important description")

        viewState.setUser(user)
    }
}