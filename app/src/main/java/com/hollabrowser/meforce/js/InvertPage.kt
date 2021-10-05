package com.hollabrowser.meforce.js

import com.anthonycr.mezzanine.FileStream

/**
 * Invert the color of the page.
 */
@FileStream("app/src/main/js/InvertPage.js")
interface InvertPage {

    fun provideJs(): String

}