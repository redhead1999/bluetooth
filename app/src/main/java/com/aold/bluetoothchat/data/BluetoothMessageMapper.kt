package com.aold.bluetoothchat.data

import com.aold.bluetoothchat.domain.chat.BluetoothMessage

/**
 * @author Kirilin Yury on 03.06.2023.
 */
fun String.toBluetoothMessage(isFromLocalUser: Boolean): BluetoothMessage {
    val name = substringBeforeLast("#")
    val message = substringAfter("#")
    return BluetoothMessage(
        message = message,
        senderName = name,
        isFromLocalUser = isFromLocalUser
    )
}

fun BluetoothMessage.toByteArray(): ByteArray {
    return "$senderName#$message".encodeToByteArray()
}