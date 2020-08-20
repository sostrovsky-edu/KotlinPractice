package syntax.functions.operation.override.example2

import java.io.ByteArrayOutputStream
import java.io.OutputStream

fun main(args: Array<String>) {
    val os = ByteArrayOutputStream()
    val pngImage = PNGImage()
    pngImage.save(os)
}

open class Image {
    open fun save(output: OutputStream) {
        println("Some logic to save an image")
    }
}

interface VendorImage {
    fun save(output: OutputStream) {
        println("Vendor saving an image")
    }
}

class PNGImage : Image(), VendorImage {
    override fun save(output: OutputStream) {
        super<VendorImage>.save(output)
        super<Image>.save(output)
    }
}