package patterns.structural.bridge.video

class VimeoVideoProvider(
    override val quality: VideoQuality
) : VideoProvider {
    override fun playback(id: String) {
        quality.render()
        println("Playing https://videmeo.com/$id")
    }
}