package com.aold.bluetoothchat.domain.chat

/**
 * @author Kirilin Yury on 03.06.2023.
 */
sealed interface ConnectionResult {
    object ConnectionEstablished : ConnectionResult
    data class TransferSucceeded(val message: BluetoothMessage) : ConnectionResult
    data class Error(val message: String) : ConnectionResult
}