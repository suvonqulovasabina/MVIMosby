package uz.gita.mvimosby.ui.presintation.home

import uz.gita.mvimosby.ui.data.local.GetCard
import uz.gita.mvimosby.ui.data.local.MyHistory
import org.orbitmvi.orbit.ContainerHost

interface HomeContract {

    interface ViewModel : ContainerHost<UIState, SideEffect> {
        fun onEventDispatcher(intent: Intent)
    }

    interface SideEffect {
        object Massage : SideEffect
    }


    data class UIState(val cardList: ArrayList<GetCard>, val myHistory: ArrayList<MyHistory>)

    interface Intent {}

}


interface HomeView : MvpView {
    fun showCardList(cardList: List<GetCard>)
    fun showMyHistory(myHistory: List<MyHistory>)
}
