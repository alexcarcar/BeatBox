package alex.carcar.beatbox

private const val WAV = ".wav"

class Sound(val assetPath: String) {
    val name = assetPath.split("/").last().removePrefix(WAV)
}