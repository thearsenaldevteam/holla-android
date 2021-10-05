package com.hollabrowser.meforce.extensions

import android.app.Dialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.hollabrowser.meforce.dialog.BrowserDialog

/**
 * Show single choice items.
 *
 * @param items A list of items and their user readable string description.
 * @param checkedItem The item that will be checked when the dialog is displayed.
 * @param onClick Called when an item is clicked. The item clicked is provided.
 */
fun <T> MaterialAlertDialogBuilder.withSingleChoiceItems(
    items: List<Pair<T, String>>,
    checkedItem: T,
    onClick: (T) -> Unit
) {
    val checkedIndex = items.map(Pair<T, String>::first).indexOf(checkedItem)
    val titles = items.map(Pair<T, String>::second).toTypedArray()
    setSingleChoiceItems(titles, checkedIndex) { _, which ->
        onClick(items[which].first)
    }
}

/**
 * Ensures that the dialog is appropriately sized and displays it.
 */
fun MaterialAlertDialogBuilder.resizeAndShow(): Dialog = show().also { BrowserDialog.setDialogSize(context, it) }
