package github.preeti5sharon.pokemonapp.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import github.preeti5sharon.pokemonapp.api.PokemonService
import github.preeti5sharon.pokemonapp.paging.PokemonRepository
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideMoshi() = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

    @Singleton
    @Provides
    fun provideRetrofit(moshi: Moshi) = Retrofit.Builder().addConverterFactory(
        MoshiConverterFactory.create(moshi)
    )
        .baseUrl("https://pokeapi.co/api/v2/").build()

    @Singleton
    @Provides
    fun provideService(retrofit: Retrofit) = retrofit.create(PokemonService::class.java)

    @Singleton
    @Provides
    fun provideRepository(service: PokemonService) = PokemonRepository(service)
}
