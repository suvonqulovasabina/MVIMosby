package uz.gita.mvimosby.ui.presintation.home

import androidx.lifecycle.ViewModel
import uz.gita.mvimosby.ui.domain.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import org.orbitmvi.orbit.viewmodel.container
import uz.gita.mvimosby.ui.presintation.home.HomeContract
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repo: AppRepository
) : HomeContract.ViewModel, ViewModel() {


    override val container = container<HomeContract.UIState, HomeContract.SideEffect>(
        HomeContract.UIState(
            cardList = repo.getCard(),
            myHistory = repo.myHistory()
        )
    )

    override fun onEventDispatcher
                (intent: HomeContract.Intent)
    {}
}