package alex.carcar.beatbox

import androidx.lifecycle.ViewModel

class BeatViewModel : ViewModel() {
    var initialLoad: Boolean = true
    lateinit var beatBox: BeatBox
}