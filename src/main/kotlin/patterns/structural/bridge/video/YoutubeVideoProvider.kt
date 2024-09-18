package patterns.structural.bridge.video

class YoutubeVideoProvider(
    override val quality: VideoQuality,
) : VideoProvider {
    override fun playback(id: String) {
        quality.render()
        println("Playing https://youtube.com/$id")
    }
}