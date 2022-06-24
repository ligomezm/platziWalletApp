package com.cristianvillamil.platziwallet.ui

class TransferProxy {
    val MAX_TRANSFER_AMOUNT = 1000000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount: Double) : String {
        return when {
            amount > MAX_TRANSFER_AMOUNT -> {
                "The amount exceeds maximum allowed"
            }
            amount < MIN_TRANSFER_AMOUNT -> {
                "Minimum transaction is $MIN_TRANSFER_AMOUNT"
            }
            else -> {
                doTransfer(amount)
                "Transfer completed"
            }
        }
    }

    private fun doTransfer(amount: Double) {

    }

}