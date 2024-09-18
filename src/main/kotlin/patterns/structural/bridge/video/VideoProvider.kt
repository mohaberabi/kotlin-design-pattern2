package patterns.structural.bridge.video

interface VideoProvider {


    val quality: VideoQuality
    fun playback(id: String)
}