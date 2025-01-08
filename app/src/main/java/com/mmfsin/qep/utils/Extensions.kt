package com.mmfsin.qep.utils

import androidx.fragment.app.FragmentActivity
import com.mmfsin.qep.base.dialog.ErrorDialog

fun FragmentActivity.showErrorDialog(goBack: Boolean = true) {
    val dialog = ErrorDialog(goBack)
    this.let { dialog.show(it.supportFragmentManager, "") }
}
