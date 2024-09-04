package uz.gita.mvimosby.ui.domain

import uz.gita.mvimosby.ui.data.local.GetCard
import uz.gita.mvimosby.ui.data.local.MyHistory

interface AppRepository {


    fun getCard(): ArrayList<GetCard>


    fun myHistory(): ArrayList<MyHistory>
}