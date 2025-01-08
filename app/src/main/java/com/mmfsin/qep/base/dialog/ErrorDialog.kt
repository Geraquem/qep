package com.mmfsin.qep.base.dialog

import android.app.Dialog
import android.view.LayoutInflater
import com.mmfsin.qep.base.BaseDialog
import com.mmfsin.qep.databinding.DialogErrorBinding

class ErrorDialog(private val goBack: Boolean = true) : BaseDialog<DialogErrorBinding>() {

    override fun inflateView(inflater: LayoutInflater) = DialogErrorBinding.inflate(inflater)

    override fun setCustomViewDialog(dialog: Dialog) = centerViewDialog(dialog)

    override fun setListeners() {
        binding.btnAccept.setOnClickListener {
            if (goBack) activity?.onBackPressedDispatcher?.onBackPressed()
            dismiss()
        }
    }
}