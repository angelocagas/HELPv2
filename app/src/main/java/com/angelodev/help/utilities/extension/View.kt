package com.angelodev.help.utilities.extension

import android.view.View

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

/*fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
} */

fun View.fadesOut() {
    animate().alpha(0.0f)
}

fun View.fadesIn() {
    animate().alpha(1.0f)
}

fun View.fadesOut(duration: Long) {
    animate().alpha(0.0f).duration = duration
}

fun View.fadesIn(duration: Long) {
    animate().alpha(1.0f).duration = duration
}

fun View.animateByHeight() {
    animate().translationY(this.height.toFloat())
}

fun View.animateByWidth() {
    animate().translationY(this.width.toFloat())
}

fun View.translateY(duration: Long) {
    animate().translationY(1f).duration = duration
}

fun View.translateX() {
    animate().translationY(1f)
}