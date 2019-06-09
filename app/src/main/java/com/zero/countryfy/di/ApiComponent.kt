package com.zero.countryfy.di

import com.zero.countryfy.model.CountriesService
import com.zero.countryfy.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {
    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}