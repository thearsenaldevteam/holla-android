package com.hollabrowser.meforce.search

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.hollabrowser.meforce.R

class SuggestionViewHolder(view: View) {
    val imageView: ImageView = view.findViewById(R.id.suggestionIcon)
    val titleView: TextView = view.findViewById(R.id.title)
    val urlView: TextView = view.findViewById(R.id.url)
    val insertSuggestion: View = view.findViewById(R.id.complete_search)
}
