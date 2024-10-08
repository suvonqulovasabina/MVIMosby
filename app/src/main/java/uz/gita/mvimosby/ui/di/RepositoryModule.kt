package uz.gita.mvimosby.ui.di


import uz.gita.mvimosby.ui.domain.AppRepository
import uz.gita.mvimosby.ui.domain.AppRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    fun signUpModel(impl: AppRepositoryImpl): AppRepository
}
