package uz.toza.testapp.data.di.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.toza.testapp.data.remote.rest.RepoService
import uz.toza.testapp.utils.Constants
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Singleton
    @Provides
    fun provideRepoService(retrofit: Retrofit): RepoService {
        return retrofit.create(RepoService::class.java)
    }
}