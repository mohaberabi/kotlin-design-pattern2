package patterns.structural.bridge.video

interface VideoQuality {


    fun render()
}


class HDVideoQuality : VideoQuality {
    override fun render() {
        println("Rendering the video in HD Quality")
    }
}

class SDVideoQuality : VideoQuality {
    override fun render() {
        println("Rendering the video in SD Quality")

    }
}