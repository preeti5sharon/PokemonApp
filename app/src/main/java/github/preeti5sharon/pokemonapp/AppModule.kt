package github.preeti5sharon.pokemonapp

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideMoshi() = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
    @Singleton
    @Provides
    fun provideRetrofit(moshi:Moshi) = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl("https://pokeapi.co/api/v2/").build()
    @Singleton
    @Provides
    fun provideService(retrofit:Retrofit) = retrofit.create(PokemonService::class.java)
    @Singleton
    @Provides
    fun provideRepository(service: PokemonService) = PokemonRepository(service)
}