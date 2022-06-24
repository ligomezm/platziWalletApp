package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSuccess"
        val TYPE_INFO = "typeInfo"
    }

    fun getDialog(context: Context, type: String) : AlertDialog.Builder {
        when (type) {
            TYPE_ERROR -> {
                return AlertDialog.Builder(context)
                    .setMessage("Error while getting content")
            }
            TYPE_SUCCESS -> {
                return AlertDialog.Builder(context)
                    .setMessage("Content successfully loaded")
            }
            TYPE_INFO -> {
                return AlertDialog.Builder(context)
                    .setMessage("Info")
            }
        }
        return AlertDialog.Builder(context)
            .setMessage("Please add new type")
    }
}