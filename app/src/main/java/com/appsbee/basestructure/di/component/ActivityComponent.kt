package com.appsbee.basestructure.di.component

import com.appsbee.basestructure.di.module.ActivityModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ActivityModule::class])
@Singleton
interface ActivityComponent {
}