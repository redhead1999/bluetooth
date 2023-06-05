package com.aold.bluetoothchat.domain

/**
 * @author Kirilin Yury on 03.06.2023.
 */
data class BluetoothMessage(
    val message: String,
    val senderName: String,
    val isFromLocalUser: Boolean,
)